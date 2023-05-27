import funciones.funcionPadre;
import util.derivada;

import javax.swing.*;

public class imprimirDatos {
    Double valorVv;
    double cont=0;
    public void diferenciaAdelante(funcionPadre f, Double x0, Double h) {
        Double datostemp;
        tabla datosTabla = new tabla();
        diferencias_numericas metodos = new diferencias_numericas();
        derivada der = new derivada();
        Double[][] datos = datosTabla.datos(f, h, x0);
        Double diferencia = metodos.primeraDiferenciaHaciaDelante(x0, h, f);
        Double diferencia2 = metodos.segundaDiferenciaHaciaDelante(x0, h, f);
        Double VV = der.derivada(f, valorVv);
        Double Ev = metodos.Ev(VV, diferencia);
        Double Er = metodos.Er(VV, Ev);
        Double Ep=Er*100;
        datostemp=Ep;
        String imprimir = "Tabla de datos" + "\n" +
                "x = " + datos[0][0] + " \t " + datos[1][0] + " \t " + datos[2][0] + "\n" +
                "_____________________________________________________" + "\n" +
                "Y = " + datos[0][1] + " \t " + datos[1][1] + " \t " + datos[2][1] + "\n" +
                "_____________________________________________________"
                + "\n" +
                "La primere diferencia = " + diferencia + "\n" +
                "valor verdadero = " + VV + "\n" +
                "Error Verdadero = " + Ev + "\n" +
                "Error real = " + Er + "\n" +
                "Error % = "+Ep+"%"+"\n"+
                "_____________________________________________________" + "\n";
        VV = der.derivada(f, valorVv);
        Ev = metodos.Ev(VV, diferencia2);
        Er = metodos.Er(VV, Ev);
        Ep=Er*100;
        imprimir +=
                "La segunda diferencia = " + diferencia2 + "\n" +
                        "valor verdadero = " + VV + "\n" +
                        "Error Verdadero = " + Ev + "\n" +
                        "Error real =" + Er + "\n" +
                        "Error % = "+Ep+"%"+"\n";

        if(datostemp<Ep){
            imprimir+="\n"+"La primera diferencia es mas cercana";
        }else {
            imprimir+="\n"+"La segunda diferencia es mas cercana";
        }


        JOptionPane.showMessageDialog(null, imprimir);
         if (cont==2){
             return;
         }
         cont++;
        //diferenciaAdelante(f,x0+h,h);

    }

    public void diferenciaAtras(funcionPadre f, Double x0, Double h) {
        Double datostemp;
        tabla datosTabla = new tabla();
        diferencias_numericas metodos = new diferencias_numericas();
        derivada der = new derivada();
        Double[][] datos = datosTabla.datos(f, h, x0);
        Double diferencia = metodos.primeraDiferenciaHaciaAtras(x0, h, f);
        Double diferencia2 = metodos.segundaDiferenciaHaciaAtras(x0, h, f);
        Double VV = der.derivada(f, valorVv);
        Double Ev = metodos.Ev(VV, diferencia);
        Double Er = metodos.Er(VV, Ev);
        Double Ep=Er*100;
        datostemp=Ep;
        String imprimir = "Tabla de datos" + "\n" +
                "x = " + datos[0][0] + " \t " + datos[1][0] + " \t " + datos[2][0] + "\n" +
                "_____________________________________________________" + "\n" +
                "Y = " + datos[0][1] + " \t " + datos[1][1] + " \t " + datos[2][1] + "\n" +
                "_____________________________________________________"
                + "\n" +
                "La primera diferencia hacia atras = " + diferencia + "\n" +
                "valor verdadero = " + VV + "\n" +
                "Error Verdadero = " + Ev + "\n" +
                "Error real = " + Er + "\n" +
                "Error % = "+Ep+"%"+"\n"+
                "_____________________________________________________" + "\n";
        VV = der.derivada(f, valorVv);
        Ev = metodos.Ev(VV, diferencia2);
        Er = metodos.Er(VV, Ev);
        Ep=Er*100;
        imprimir +=
                "La segunda diferencia hacia atras = " + diferencia2 + "\n" +
                        "valor verdadero = " + VV + "\n" +
                        "Error Verdadero = " + Ev + "\n" +
                        "Error real =" + Er + "\n" +
                        "Error % = "+Ep+"%"+"\n";

        if(datostemp<Ep){
            imprimir+="\n"+"La primera diferencia es mas cercana";
        }else {
            imprimir+="\n"+"La segunda diferencia es mas cercana";
        }


        JOptionPane.showMessageDialog(null, imprimir);
        if (cont==3){
            return;
        }
        cont++;
       // diferenciaAdelante(f,x0+h,h);

    }
    public void diferenciaCentradas(funcionPadre f, Double x0, Double h) {
        Double datostemp;
        tabla datosTabla = new tabla();
        diferencias_numericas metodos = new diferencias_numericas();
        derivada der = new derivada();
        Double[][] datos = datosTabla.datos(f, h, x0);
        Double diferencia = metodos.diferenciaCentradaOrdenDos(x0, h, f);
        Double diferencia2 = metodos.diferenciaCentradaOrdenCuatro(x0, h, f);
        Double VV = der.derivada(f, x0);
        Double Ev = metodos.Ev(VV, diferencia);
        Double Er = metodos.Er(VV, Ev);
        Double Ep=Er*100;
        datostemp=Ep;
        String imprimir = "Tabla de datos" + "\n" +
                "x = " + datos[0][0] + " \t " + datos[1][0] + " \t " + datos[2][0] + "\n" +
                "_____________________________________________________" + "\n" +
                "Y = " + datos[0][1] + " \t " + datos[1][1] + " \t " + datos[2][1] + "\n" +
                "_____________________________________________________"
                + "\n" +
                "La  diferencia centrada orden 2 = " + diferencia + "\n" +
                "valor verdadero = " + VV + "\n" +
                "Error Verdadero = " + Ev + "\n" +
                "Error real = " + Er + "\n" +
                "Error % = "+Ep+"%"+"\n"+
                "_____________________________________________________" + "\n";
        VV = der.derivada(f, x0);
        Ev = metodos.Ev(VV, diferencia2);
        Er = metodos.Er(VV, Ev);
        Ep=Er*100;
        imprimir +=
                "La  diferencia centrada orden 4 = " + diferencia2 + "\n" +
                        "valor verdadero = " + VV + "\n" +
                        "Error Verdadero = " + Ev + "\n" +
                        "Error real =" + Er + "\n" +
                        "Error % = "+Ep+"%"+"\n";

        if(datostemp<Ep){
            imprimir+="\n"+"La primera diferencia es mas cercana";
        }else {
            imprimir+="\n"+"La segunda diferencia es mas cercana";
        }


        JOptionPane.showMessageDialog(null, imprimir);

    }

    public void diferencia3Puntos(funcionPadre f, Double x0, Double h) {
        Double datostemp;
        tabla datosTabla = new tabla();
        diferencias_numericas metodos = new diferencias_numericas();
        derivada der = new derivada();
        Double[][] datos = datosTabla.datos(f, h, x0);
        Double diferencia = metodos.diferencia3Puntoscentrada(x0, h, f);
        Double diferencia2 = metodos.diferencia3Puntos(x0, h, f);
        String imprimir = "Tabla de datos" + "\n" +
                "x = " + datos[0][0] + " \t " + datos[1][0] + " \t " + datos[2][0] + "\n" +
                "_____________________________________________________" + "\n" +
                "Y = " + datos[0][1] + " \t " + datos[1][1] + " \t " + datos[2][1] + "\n" +
                "_____________________________________________________"
                + "\n" +
                "La  primera diferencia 3 puntos centrada  = " + diferencia + "\n" +
                "_____________________________________________________" + "\n";
        imprimir +=
                "La  segunda diferencia 3 puntos = " + diferencia2 ;



        JOptionPane.showMessageDialog(null, imprimir);
        if (cont==5){
            return;
        }
        cont++;
        //diferencia3Puntos(f,x0+h,h);
    }

    public void diferenci5Puntos(funcionPadre f, Double x0, Double h) {
        Double datostemp;
        tabla datosTabla = new tabla();
        diferencias_numericas metodos = new diferencias_numericas();
        derivada der = new derivada();
        Double[][] datos = datosTabla.datos(f, h, x0);
        Double diferencia = metodos.diferenciaDe5PuntosPrimera(x0, h, f);
        Double diferencia2 = metodos.diferenciaDe5Puntossegunda(x0, h, f);
        Double VV = der.derivada(f, valorVv);
        Double Ev = metodos.Ev(VV, diferencia);
        Double Er = metodos.Er(VV, Ev);
        Double Ep=Er*100;
        datostemp=Ep;
        String Datosim="";
        for (int i=0;i<datos.length;++i){
            Datosim+=datos[i][0]+"    \t";
        }

        String imprimir = "Tabla de datos" + "\n" +
                "x = " + Datosim +"\n";
        Datosim="";
        for (int i=0;i<datos.length;++i){
            Datosim+=datos[i][1]+"     \t";
        }
        imprimir+=
                "_____________________________________________________" + "\n" +
                "Y = " + Datosim +"\n"+
                "_____________________________________________________"
                + "\n" ;

        imprimir+=
                "La deferencia de 5 puntos 1 = " + diferencia + "\n" +
                "valor verdadero = " + VV + "\n" +
                "Error Verdadero = " + Ev + "\n" +
                "Error real = " + Er + "\n" +
                "Error % = "+Ep+"%"+"\n"+
                "_____________________________________________________" + "\n";
        VV = der.derivada(f, valorVv);
        Ev = metodos.Ev(VV, diferencia2);
        Er = metodos.Er(VV, Ev);
        Ep=Er*100;
        imprimir +=
                "La deferencia de 5 puntos 2 = " + diferencia2 + "\n" +
                        "valor verdadero = " + VV + "\n" +
                        "Error Verdadero = " + Ev + "\n" +
                        "Error real =" + Er + "\n" +
                        "Error % = "+Ep+"%"+"\n";

        if(datostemp<Ep){
            imprimir+="\n"+"La primera diferencia es mas cercana";
        }else {
            imprimir+="\n"+"La segunda diferencia es mas cercana";
        }


        JOptionPane.showMessageDialog(null, imprimir);
        if (cont==6){
            return;
        }
        cont++;
        diferenci5Puntos(f,x0+h,h);

    }



}
