package Tp_AlmacenamientoDeNumeros_y_GestionMemoria.Ejercicio1;

import java.math.BigDecimal;

public class DecimalSum {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        BigDecimal c = new BigDecimal("0.4");
        BigDecimal d = new BigDecimal("0.3");

        System.out.println(a.add(b));
        System.out.println(a.add(c));
        System.out.println(a.add(d));
    }
}

