package Concurrencia_Sincronizacion.Buffer_De_Capacidad_Finita;
import java.util.concurrent.Semaphore;

class FixedSemaphoreBuffer implements Buffer {
    protected Object[] buf;
    protected int in = 0;
    protected int out = 0;
    protected int count = 0;
    protected int size;
    Semaphore full = new Semaphore(0);
    Semaphore empty;

    public FixedSemaphoreBuffer(int size) {
        this.size = size;
        buf = new Object[size];
        empty = new Semaphore(size); // Inicializa el semáforo con el número máximo de permisos
    }

    public void put(Object obj) throws InterruptedException {
        empty.acquire(); // Adquiere un permiso del semáforo empty
        synchronized (this) {
            buf[in] = obj;
            count++;
            in = (in + 1) % size;
        }
        full.release(); // Libera un permiso al semáforo full
    }

    public Object get() throws InterruptedException {
        full.acquire(); // Adquiere un permiso del semáforo full
        Object obj;
        synchronized (this) {
            obj = buf[out];
            buf[out] = null;
            count--;
            out = (out + 1) % size;
        }
        empty.release(); // Libera un permiso al semáforo empty
        return obj;
    }
}
