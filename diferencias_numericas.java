import funciones.funcionPadre;

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


}
