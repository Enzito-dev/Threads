package Threads;

public class Hilos {

    public Hilos() {
        
        
        //formato sin hilo, imprime 6 veces proceso 1 y luegos 6 veces proceso 2
        for (int i = 0; i <= 5; i++) {
            System.out.println("proceso 1");
        }
        
        System.out.println("");
        
        for (int i = 0; i <= 5; i++) {
            System.out.println("proceso 2");
        }
        
    }
}
