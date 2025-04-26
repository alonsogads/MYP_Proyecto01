import simulacion.ClienteSimulado;
import vista.VistaGeneral;
import java.lang.Thread;

/**
 * Clase principal del sistema MonosChinos MX que inicia todo el programa.
 * Esta clase contiene el metodo main y lanza la vista general del programa.
 */
public class MonosChinosMX {

    /**
     * Metodo principal que lanza el sistema MonosChinos MX.
     */
    public static void main(String[] args) {

        // Creamos un cliente simulado que realiza pedidos ficticios a la par nuestra
        ClienteSimulado cliente = new ClienteSimulado();
        new Thread(cliente).start();

        // Iniciamos la vista para el cliente real.
        VistaGeneral vista = new VistaGeneral();
        vista.mostrarMenuGeneral();
    }
}
