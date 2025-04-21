package vista;

import modelo.*;
import java.util.Scanner;

/**
 * Clase que representa la vista inicial del programa.
 * Esta clase permite al usuario seleccionar una sucursal para realizar su pedido.
 * Tambien puede consultar funcionalidades generales como visualizar pedidos.
 * 
 * Esta clase es una 'vista' del patron MVC.
 */
public class VistaGeneral {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Muestra el menu al cliente para la seleccion de una sucursal concreta.
     * Posteriormente, inicia la vista al cliente de la sucursal seleccionada.
     */
    public void mostrarMenuGeneral() {
        while (true) {
            System.out.println("\n========== MonosChinos MX: Sucursales ==========");
            System.out.println("1. Sucursal Jalisco");
            System.out.println("2. Sucursal Chihuahua");
            System.out.println("3. Sucursal Yucatan");
            System.out.println("4. Salir");
            System.out.print("\n\tEleccion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opcion invalida. Intenta de nuevo.");
                continue;
            }

            Sucursal sucursal;

            switch (opcion) {
                case 1:
                    sucursal = new SucursalJalisco();
                    this.iniciarVistaSucursal(sucursal);
                    break;
                case 2:
                    sucursal = new SucursalChihuahua();
                    this.iniciarVistaSucursal(sucursal);
                    break;
                case 3:
                    sucursal = new SucursalYucatan();
                    this.iniciarVistaSucursal(sucursal);
                    break;
                case 4:
                    System.out.println("Gracias por visitar MonosChinos MX.");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida. Intenta nuevamente.");
            }
        }
    }

    /**
     * Inicia la vista interactiva de la sucursal seleccionada por el usuario.
     * Crea una instancia de VistaSucursal y lanza la interaccion.
     * 
     * @param sucursal Instancia concreta de la sucursal seleccionada.
     */
    public void iniciarVistaSucursal(Sucursal sucursal) {
        VistaSucursal vista = new VistaSucursal(sucursal);
        vista.interactuarConCliente();
    }

    /**
     * Permite consultar pedidos anteriores o estadisticas generales del sistema.
     * Este metodo puede ser implementado si se desea extender la funcionalidad.
     */
    public void consultarPedidos() {
        System.out.println("[Funcion en desarrollo] Consulta de pedidos no disponible por el momento.");
    }
}

