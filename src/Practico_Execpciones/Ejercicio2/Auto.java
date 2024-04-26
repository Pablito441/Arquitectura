package Practico_Execpciones.Ejercicio2;

public class Auto extends Vehiculo{
    public Auto(double velocidad) {
        super(velocidad);
    }

    @Override
    public void acelera(double aceleracion) throws MiException {
        double nuevaVelocidad = super.getVelocidad() + aceleracion;
        if (nuevaVelocidad > 120) {
            throw new MiException("El auto no puede acelerar más de 120 km/h");
        }
        System.out.println("El auto aceleró a " + nuevaVelocidad + " km/h.");
        super.setVelocidad(nuevaVelocidad);
    }
    @Override
    public void frena() {
        System.out.println("El auto frenó");
    }
}
