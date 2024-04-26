package Practico_Execpciones.Ejercicio2;

public class Camion extends Vehiculo{

    private Chofer chofer;

    public Camion(double velocidad, Chofer chofer) {
        super(velocidad);
        this.chofer = chofer;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    @Override
    public void acelera(double aceleracion) throws MiException {
        double nuevaVelocidad = super.getVelocidad() + aceleracion;
        if (nuevaVelocidad > 120) {
            throw new MiException("El camión no puede acelerar más de 120 km/h");
        }
        System.out.println("El camión aceleró a " + nuevaVelocidad + " km/h.");
        super.setVelocidad(nuevaVelocidad);
    }
    @Override
    public void frena() {
        System.out.println("El Camion frenó");
    }
}
