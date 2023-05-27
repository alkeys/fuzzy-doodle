import funciones.funcionPadre;

public class tabla {
    private Double[][] datosTabla;

    public Double[][] datos(funcionPadre f, Double h, Double x1) {
        Double[][] datosAux = new Double[3][2];
        //valores para x
        datosAux[0][0] = x1;
        datosAux[0][1] = f.f(x1);
        for (int i = 1; i < datosAux.length; ++i) {
            x1 += h;
            datosAux[i][0] = x1;
            datosAux[i][1] = f.f(x1);
        }

        return datosAux;
    }


}
