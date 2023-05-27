package util;

import funciones.funcionPadre;

public class derivada extends funcionPadre {
    double h = 0.00000001;
    public double derivada(funcionPadre f, double x) {
        return (f.f(x + h) - f.f(x)) / h;
    }
}
