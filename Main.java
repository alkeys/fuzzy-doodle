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

        f96 funcio9=new f96();
/*      colecion.diferenciaCentradas(funcio9,0.5,0.1);*/




    }
}
