
package Hilos_Sincronizados;


public class Clase4 extends Thread{
     @Override
    public void run (){
        for(int i= 0 ; i <= 5; i++){
            System.out.println("k");// hace el salto de linea por ser la ultima
            try{
                Clase4.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("error dentro hilo4"+ e);
            }
        }
    }
}
