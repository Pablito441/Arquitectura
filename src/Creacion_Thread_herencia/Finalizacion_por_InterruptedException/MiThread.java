package Creacion_Thread_herencia.Finalizacion_por_InterruptedException;

public class MiThread extends Thread{
    public void run(){
        while (true) {
            System.out.println("Ejecuto");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Termino en sleep");
                return;
            }
        }
    }
}
