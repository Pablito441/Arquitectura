package Creacion_Thread_herencia.Metodo_currentThread;

public class Main {
    public static void main(String[] args) {
        Cliente juan = new Cliente();
        juan.setName("Juan López");
        Cliente ines = new Cliente();
        ines.setName("Inés García");
        juan.start();
        ines.start();
    }
}
