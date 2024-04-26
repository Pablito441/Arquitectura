package Practico_Execpciones.Ejercicio4;

public class StackTraceExample {

    public static void main(String[] args) {
        try {
            metodoA();
        } catch (Exception e) {
            System.out.println("Excepción capturada en el método principal: " + e.getMessage());
        }
    }

    public static void metodoA() throws Exception {
        System.out.println("Dentro de método A");
        metodoB();
    }

    public static void metodoB() throws Exception {
        System.out.println("Dentro de método B");
        metodoC();
    }

    public static void metodoC() throws Exception {
        System.out.println("Dentro de método C");
        metodoD();
    }

    public static void metodoD() throws Exception {
        System.out.println("Dentro de método D - Lanzando excepción...");
        throw new Exception("Excepción lanzada desde método D");
    }
}

