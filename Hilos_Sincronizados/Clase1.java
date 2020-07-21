
package Hilos_Sincronizados;


public class Clase1 extends Thread{
    
    @Override
    public void run (){
        for(int i= 0 ; i <= 5; i++){
            System.out.print(i + ": G");
            try{
                Clase1.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("error dentro hilo1"+ e);
            }
        }
        
    }
    
}
