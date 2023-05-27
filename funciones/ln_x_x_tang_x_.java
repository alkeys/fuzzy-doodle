package funciones;

public class ln_x_x_tang_x_ extends funcionPadre{
    @Override
    public Double f(Double x) {
        return Math.exp(x*x)*Math.sin(x);
    }
}
