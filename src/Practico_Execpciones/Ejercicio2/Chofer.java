package Practico_Execpciones.Ejercicio2;

public class Chofer {
    private String nombre;
    private Matricula matricula;

    public Chofer(String nombre, Matricula matricula) throws MatriculaVencidaException{
        this.nombre = nombre;
        this.matricula = matricula;
        if (matricula.matriculaEstaVencida()) {
            throw new MatriculaVencidaException("La matrícula está vencida");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
