package Threads;

//forma heredando a traves de una clase de hilos
public class Proceso1 extends Thread {
    //mas facil de llamar en el main
    //se usa un metodo de la clase padre
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("proceso 1");
        }
    }

}
