
package Hilos_Sincronizados;


public class Clase3 extends Thread{
     @Override
    public void run (){
        for(int i= 0 ; i <= 5; i++){
            System.out.print("e");
            try{
                Clase3.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("error dentro hilo3"+ e);
            }
        }
    }
}
