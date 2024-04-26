package Practico_Execpciones.Ejercicio2;

public abstract class Vehiculo {
    private double velocidad;

    public Vehiculo(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public abstract void acelera(double aceleracion) throws MiException;
    public abstract void frena();
}
