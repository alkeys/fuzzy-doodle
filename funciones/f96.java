package funciones;

public class f96 extends funcionPadre {
    @Override
    public Double f(Double x) {
        //return (x*x*x)*Math.exp(x*x)+Math.cos(x);
        //return 3*(x*x)*(Math.exp(x*x))+2*(x*x*x*x)*(Math.exp(x*x))-Math.sin(x);
        // return 2*(x*x)*Math.sin(x);
        // return  4*x*Math.sin(x)+2*(x*x)*Math.cos(x);
        //  return Math.pow(3,x)*Math.cos(x);
        // return 3*(x*x)*Math.exp(x);
        return 6*x*Math.exp(x)+3*(x*x)*Math.exp(x);
    }
}
