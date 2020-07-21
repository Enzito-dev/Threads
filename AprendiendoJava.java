
import HilosConParametros.*;
import Threads.*;
import Estados_hilo.*;
import Hilos_Sincronizados.*;

/**
 *
 * @author Enzo avena
 */
public class AprendiendoJava {

    public static void main(String[] args) {

        //Hilos Sincronizados
        Clase1 hilo1 = new Clase1();
        Clase2 hilo2 = new Clase2();
        Clase3 hilo3 = new Clase3();
        Clase4 hilo4 = new Clase4();

        hilo1.start();
        try {
            hilo1.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("error hilo1 : " + e);
        }
        hilo2.start();
        try {
            hilo2.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("error hilo2 : " + e);
        }
        hilo3.start();
        try {
            hilo3.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("error hilo3 : " + e);
        }
        hilo4.start();
        try {
            hilo4.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("error hilo4 : " + e);
        }

        /*
        //Estados de un hilo
        Hilo_Proceso hilo1 = new Hilo_Proceso();//hilo sin ejecutar pero creado
        Hilo_Proceso hilo2 = new Hilo_Proceso();// estado ejecutable

        hilo1.start();//hilo en el segundo estado, arrancar hilo

        try {//bloqueo dormido por tiempo definido
            hilo1.sleep(1000);// dormido por 1 seg
            //runnable o no ejecutado, el hilo esta en ejecucion pero una tarea en el hilo lo impide 
            //bloquearlo con tiempo definido
            //1 seg = 1000 miliseg
        } catch (InterruptedException e) {
            System.out.println("error: hilo1 " + e);
        }

        hilo2.start();
        //hilo2.stop();//matamos el proceso del hilo2
        try {
            hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("error : hilo2 " + e);
        }

        //estado muerto o finalizado, termina normalmente o es obligado a terminar
         */
 /*
        //Procesos de hilos con parametros
        Proceso hilo1 = new Proceso(" Proceso 1");
        Proceso hilo2 = new Proceso(" Proceso 2");
        Proceso hilo3 = new Proceso(" Proceso 3");
        
        hilo1.Valor_Condicion(5);
        hilo2.Valor_Condicion(10);
        hilo3.Valor_Condicion(6);
        
       hilo1.start();
       hilo2.start();
       hilo3.start();
         */
 /*
       //Proceso con Hilos
       //Hilos h = new Hilos ();
       Proceso1 hilo1 = new Proceso1(); //se usa si utilizas el extends
       Thread hilo2 = new Thread(new Proceso2()); //se crea un objeto de la clase Thread , ya que utiliza una intefaz de hilos
       // lo que ejecuta esta en la clase proceso 2 (new Proceso2())
       
       //se pueden llamar de una misma clase, no es necesario tener clases distintas
       Proceso1 hilo3 = new Proceso1();
       
       //se llaman despues de crear todas las instancias, asi arrancan a la par
       hilo3.start();
       hilo2.start();//arranca el proceso2
       hilo1.start();//arranca el proceso1
         */
    }

}
