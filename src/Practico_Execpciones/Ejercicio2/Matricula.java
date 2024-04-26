package Practico_Execpciones.Ejercicio2;

import java.time.LocalDate;


public class Matricula {
    private int numero;
    private LocalDate fechavto;


    public Matricula(int numero, LocalDate fechavto) {
        this.numero = numero;
        this.fechavto = fechavto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechavto() {
        return fechavto;
    }
    public void setFechavto(LocalDate fechavto) {
        this.fechavto = fechavto;
    }
    public boolean matriculaEstaVencida() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.isAfter(fechavto); // Devuelve true si la fecha actual es posterior a la fecha de vencimiento
    }
}
