package Concurrencia_Sincronizacion.Buffer_De_Capacidad_Finita;

public interface Buffer {
    void put(Object obj) throws InterruptedException;

    Object get() throws InterruptedException;
}
