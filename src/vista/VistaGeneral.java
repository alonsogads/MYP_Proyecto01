package vista;

import modelo.*;
import controlador.ControladorPC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
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
            this.limpiarPantalla();

            System.out.println("\n========== MonosChinos MX: Sucursales ==========");
            System.out.println("0. Central CDMX (consultar pedidos)");
            System.out.println("1. Sucursal Jalisco (realizar pedidos)");
            System.out.println("2. Sucursal Chihuahua (realizar pedidos)");
            System.out.println("3. Sucursal Yucatan (realizar pedidos)");
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
                case 0:
                    this.consultarPedidos();
                    break;
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

            System.out.println("Presione enter para regresar al menu...");
            scanner.nextLine(); // Espera que el usuario presione Enter
        }
    }

    /**
     * Inicia la vista interactiva de la sucursal seleccionada por el usuario.
     * Crea una instancia de VistaSucursal y lanza el controlador correspondiente.
     * 
     * @param sucursal Instancia concreta de la sucursal seleccionada.
     */
    public void iniciarVistaSucursal(Sucursal sucursal) {
        VistaSucursal vista = new VistaSucursal(sucursal);
        ControladorPC controlador = new ControladorPC(vista);
        controlador.iniciar();
    }

    /**
     * Muestra el contenido del archivo de pedidos guardados.
     * Si el archivo no existe, muestra un mensaje informativo.
     */
    public void consultarPedidos() {
        this.limpiarPantalla();

        File archivo = new File("pedidos.txt");

        if (!archivo.exists() || archivo.length() == 0) {
            System.out.println("\n[Consulta de Pedidos] No hay pedidos guardados aun.");
            return;
        }

        System.out.println("\n********** Pedidos de Central CDMX **********\n");

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de pedidos.");
            e.printStackTrace();
        }

        System.out.println("\n*******************************************\n");
        System.out.println("Presione enter para regresar al menu...");
        scanner.nextLine(); // Espera que el usuario presione Enter

    }

    /**
     * Metodo que limpia la pantalla de la terminal
     */
    private void limpiarPantalla() {
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla.");
        }
    }
}

