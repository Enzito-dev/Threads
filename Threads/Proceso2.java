
package Threads;
//tenes q llamarlo a traves de la clase Thread
//segunda forma de implementar hilos
public class Proceso2 implements Runnable{
    
    @Override
    public void run (){
     for (int i = 0; i <= 5; i++) {
            System.out.println("proceso 2");
        }   
    }
    
}
