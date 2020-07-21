package HilosConParametros;

public class Proceso extends Thread {

    int variable;

    public Proceso(String nombre_hilo) {
        super(nombre_hilo);
    }

    
    
    @Override
    public void run() {//solo lo que este dentro del run sera el hilo
        for (int i = 0; i <= variable; i++) {
            System.out.println(i + this.getName()); //get name() te indica el nombre del hilo
        }
        System.out.println("");
    }

    public void Valor_Condicion(int valor) {//se envian los parametros por esta clase
        this.variable = valor;
    }

}
