package Creacion_Thread_herencia.Interrupcion_Pendiente_Y_Sleep;

public class PendingInterrupt {
    public static void main(String[] args) {
        if (args.length>0){ Thread.currentThread().interrupt();} //manera de interrumpir el hilo
        long tiempoInicial=System.currentTimeMillis();
        try{
            Thread.sleep(2000);
            System.out.println("No es interrumpida");
        }catch (InterruptedException e){
            System.out.println("Es interrumpida");
        }
        System.out.println("Tiempo gastado: "+
                (System.currentTimeMillis()-tiempoInicial));
    }
}

