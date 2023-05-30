import funciones.f96;
import funciones.funcionDatos;
import funciones.ln_x_x_tang_x_;

public class Main {
    public static void main(String[] args) {
        imprimirDatos colecion = new imprimirDatos();
        ln_x_x_tang_x_ ex = new ln_x_x_tang_x_();
        colecion.valorVv = 1.0;
        funcionDatos DatosF = new funcionDatos();
        //colecion.diferenciaAtras(ex, colecion.valorVv, 0.1);

        //h=0.2
        //x0=-0.4
/*        Double[][] DatosFuncion = {{-2.0,-4.0},{-1.0,-3.0},{0.0, -2.0},{1.0,-1.0},{2.0,0.0},{3.0,1.0},{4.0,2.0}};
        DatosF.setDatos(DatosFuncion);
        colecion.valorVv = -0.2;
        colecion.diferencia3Puntos(DatosF,2.0,1.0);*/

        f96 funcio9 = new f96();
        colecion.valorVv = (Math.PI / 2);
/*        colecion.diferenci5Puntos(funcio9, (Math.PI / 2), 0.1);
        colecion.diferencia3Puntos(funcio9, (Math.PI / 2), 0.1);*/

/*        colecion.calcularSegundaDerivada(x-> funcio9.f(x), colecion.valorVv, 0.1);
        colecion.calcularTerceraDerivada(x-> funcio9.f(x),colecion.valorVv,0.1);
        colecion.calcularCuartaDerivada(x->funcio9.f(x),colecion.valorVv,0.1);*/

       colecion.Richardson(x-> funcio9.f(x),Math.PI,Math.PI/2,10);

    }


}


