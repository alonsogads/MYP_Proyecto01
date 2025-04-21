import vista.VistaGeneral;

/**
 * Clase principal del sistema MonosChinos MX que inicia todo el programa.
 * Esta clase contiene el metodo main y lanza la vista general del programa.
 */
public class MonosChinosMX {

    /**
     * Metodo principal que lanza el sistema MonosChinos MX.
     */
    public static void main(String[] args) {
        VistaGeneral vista = new VistaGeneral();
        vista.mostrarMenuGeneral();
    }
}
