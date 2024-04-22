package Concurrencia_Sincronizacion.Buffer_De_Capacidad_Finita;

public class Semaphore{
    int value;
    public Semaphore(int initialValue){
        value = initialValue;
    }
    synchronized public void signal(){
        value= value+1;
        notify();
    }
    public synchronized void await() throws InterruptedException {
        while (value == 0) wait();
        value = value - 1;
    }
}