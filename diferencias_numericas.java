import funciones.funcionPadre;

import java.util.function.Function;

public class diferencias_numericas {

    public Double primeraDiferenciaHaciaDelante(Double x0, Double h, funcionPadre f) {
        return (f.f(x0 + h) - f.f(x0)) / h;
    }

    public Double segundaDiferenciaHaciaDelante(Double x0, Double h, funcionPadre f) {
        Double a = (-f.f(x0 + 2 * h) + 4 * f.f(x0 + h) - 3 * f.f(x0));
        Double b = 2.0 * h;
        return a / b;
    }

    public Double primeraDiferenciaHaciaAtras(Double x0, Double h, funcionPadre f) {
        return (f.f(x0) - f.f(x0 - h)) / h;
    }

    public Double segundaDiferenciaHaciaAtras(Double x0, Double h, funcionPadre f) {
        Double a = (3 * f.f(x0) - 4 * f.f(x0 - h) + f.f(x0 - 2 * h));
        Double b = 2 * h;
        return a / b;
    }

    public Double diferenciaCentradaOrdenDos(Double x0, Double h, funcionPadre f) {
        Double a =(f.f(x0 + h) - f.f(x0 - h))  ;
        Double b = 2 * h;
        return a/b ;
    }

    public Double diferenciaCentradaOrdenCuatro(Double x0, Double h, funcionPadre f) {
        Double a = (-f.f(x0 + 2 * h) + 8 * f.f(x0 + h) - 8 * f.f(x0 - h) + f.f(x0 - 2 * h));
        Double b =12 * h ;
        return a /b ;

    }


    public Double diferencia3Puntoscentrada(Double x0, Double h, funcionPadre f) {
        Double a = (f.f(x0 + h) - f.f(x0 - h));
        Double b = 2 * h;
        return a /b ;
    }

    public Double diferencia3Puntos(Double x0, Double h, funcionPadre f) {
        Double b =2 * h ;
        Double a = (-3 * f.f(x0) + 4 * f.f(x0 + h) - f.f(x0 + b));
        return a / b ;
    }

    public Double diferenciaDe5PuntosPrimera(Double x0, Double h, funcionPadre f) {
        Double a=12*h;
        Double b=((-25 * f.f(x0) + 48 * f.f(x0 + h) - 36 * f.f(x0 + 2 * h)) +
                (16 * f.f(x0 + 3 * h) - 3 * f.f(x0 + 4 * h)));
        Double c=1/a;
        return c * b;
    }

    public Double diferenciaDe5Puntossegunda(Double x0, Double h, funcionPadre f) {
        Double a= 12 * h;
        Double b=(f.f(x0 - 2 * h) + 8 * f.f(x0 + h) - 8 * f.f(x0 - h) - f.f(x0 + 2 * h));
        Double c=1/a;
        return  a*b ;
    }


    /**
     * @param VV         valor verdadero
     * @param diferencia dividida
     * @return Ev
     */
    public Double Ev(Double VV, Double diferencia) {
        return Math.abs(VV - diferencia);
    }

    public Double Er(Double VV, Double Ev) {
        return Math.abs(Ev / VV);
    }

    public  Double calcularSegundaDerivada(Function<Double, Double> f, double x, double h) {
        Double f_x_plus_h = f.apply(x + h);
        Double f_x = f.apply(x);
        Double f_x_minus_h = f.apply(x - h);
        return (f_x_plus_h - 2 * f_x + f_x_minus_h) / (h * h);
    }
    public  Double calcularTerceraDerivada(Function<Double, Double> f, double x, double h) {
        Double f_x_minus_2h = f.apply(x - 2 * h);
        Double f_x_minus_h = f.apply(x - h);
        Double f_x = f.apply(x);
        Double f_x_plus_h = f.apply(x + h);
        Double f_x_plus_2h = f.apply(x + 2 * h);
        return (f_x_minus_2h - 2 * f_x_minus_h + 2 * f_x_plus_h - f_x_plus_2h) / (h * h * h);
    }

    public Double calcularCuartaDerivada(Function<Double, Double> f, double x, double h) {
        Double f_x_plus_2h = f.apply(x + 2 * h);
        Double f_x_plus_h = f.apply(x + h);
        Double f_x = f.apply(x);
        Double f_x_minus_h = f.apply(x - h);
        Double f_x_minus_2h = f.apply(x - 2 * h);
        return (f_x_minus_2h - 4 * f_x_minus_h + 6 * f_x - 4 * f_x_plus_h + f_x_plus_2h) / (h * h * h * h);
    }


    public Double Richardson(Function<Double, Double> f, double x, double h, int nivel) {
        Double[][] tabla = new Double[nivel + 1][nivel + 1];

        tabla[0][0] = (f.apply(x + h) - f.apply(x - h)) / (2 * h);

        for (int i = 1; i <= nivel; i++) {
            h /= 2;
            tabla[i][0] = (f.apply(x + h) - f.apply(x - h)) / (2 * h);

            for (int j = 1; j <= i; j++) {
                tabla[i][j] = tabla[i][j-1] + (tabla[i][j-1] - tabla[i-1][j-1]) / (Math.pow(4, j) - 1);
            }
        }

        return tabla[nivel][nivel];
    }
}
