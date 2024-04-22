package Concurrencia_Sincronizacion.Ejemplo_Lectores_Y_Escritores;

//public class ReadWriteController {
//    Recurso elRecurso;
//    int writerWaiting = 0;
//    int readerInside = 0;
//    int writerInside = 0;
//
//    public Recurso get() {
//        goInReader(); // Obtiene acceso
//        return elRecurso;
//    }
//
//    public void write(Recurso newValue) {
//        goInWriter(); // Obtiene acceso
//        elRecurso = newValue;
//        goOutWriter(); // Libera recurso
//    }
//
//    public synchronized void goInReader() {
//        try {
//            while ((writerWaiting + writerInside) != 0) wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        readerInside++;
//    }
//
//    public synchronized void goOutReader() {
//        readerInside--;
//        notifyAll();
//    }
//
//    public synchronized void goInWriter() {
//        writerWaiting++;
//        try {
//            while ((writerInside + readerInside) != 0) wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        writerWaiting--;
//        writerInside++;
//    }
//
//    public synchronized void goOutWriter() {
//        writerInside--;
//        notifyAll();
//    }
//}
