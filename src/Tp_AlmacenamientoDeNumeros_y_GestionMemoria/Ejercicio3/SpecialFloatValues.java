package Tp_AlmacenamientoDeNumeros_y_GestionMemoria.Ejercicio3;

public class SpecialFloatValues {
    public static void main(String[] args) {
        // Valores especiales
        double nanValue = Double.NaN;
        double posInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;
        double posZero = 0.0;
        double negZero = -0.0;

        // Array de valores especiales
        double[] values = {nanValue, posInf, negInf, posZero, negZero};

        // Manipulación y salida de valores especiales
        for (double val : values) {
            System.out.println("Value: " + val
                    + ", Is NaN: " + Double.isNaN(val)
                    + ", Is Infinite: " + Double.isInfinite(val));
        }

        // Comparaciones especiales
        System.out.println("Comparing NaN with NaN: " + (nanValue == Double.NaN));
        System.out.println("Comparing NaN using Double.isNaN: " + Double.isNaN(nanValue));
        System.out.println("Comparing 0.0 with -0.0: " + (posZero == negZero));
    }
}

