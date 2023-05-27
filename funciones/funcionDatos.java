package funciones;

public class funcionDatos extends funcionPadre {
    Double[][] Datos;

    public Double f(Double x) {
        Double xd;
        for (int i=0;i<Datos.length;++i){
            xd=Datos[i][0];
         if(xd.equals(x)){
             return Datos[i][1];
         }
        }
        return 0.0;
    }

    public void setDatos(Double[][] datos) {
        Datos = datos;
    }
}
