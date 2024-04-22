package Concurrencia_Sincronizacion.Ejercicio_Filosofo;

public class CenaFilosofos {
    public static void main(String[] args) {
        // Crear los cubiertos
        Cubierto[] cubiertos = new Cubierto[5];
        for (int i = 0; i < 5; i++) {
            cubiertos[i] = new Cubierto(i);
        }

        // Crear los filósofos
        Filosofo[] filosofos = new Filosofo[5];
        for (int i = 0; i < 5; i++) {
            Cubierto izquierdo = cubiertos[i];
            Cubierto derecho = cubiertos[(i + 1) % 5]; // El cubierto a la derecha del filósofo
            filosofos[i] = new Filosofo(i + 1, izquierdo, derecho);
        }

        // Iniciar los hilos de los filósofos
        for (Filosofo filosofo : filosofos) {
            filosofo.start();
        }
    }
}
