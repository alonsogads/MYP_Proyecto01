package controlador;

import vista.VistaSucursal;
import modelo.*;
import modelo.singleton.CentralCDMX;
import modelo.decorador.PC;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Thread;

/**
 * Clase que coordina la interaccion entre la vista de una sucursal
 * y las clases modelo utilez para el ensamblado de una PC a partir de un pedido.
 * Se encarga de dirigir el flujo de compra, procesar el pedido y mostrar el ticket.
 * 
 * Esta clase es un 'controlador' del patron MVC.
 */
public class ControladorPC {

    private VistaSucursal vista;

    /**
     * Constructor del controlador que recibe la vista de una sucursal concreta.
     * 
     * @param vista Instancia de VistaSucursal desde la cual se controla la interaccion con el cliente.
     */
    public ControladorPC(VistaSucursal vista) {
        this.vista = vista;
    }

    /**
     * Metodo principal que dirige todo el flujo de compra.
     * Solicita al usuario los datos necesarios y genera la PC correspondiente.
     */
    public void iniciar() {
        // Crear nuevo pedido
        Pedido pedido = new Pedido();
        pedido.setSucursal(vista.getSucursal());

        // Solicitar tipo de compra
        String tipo = vista.solicitarTipoCompra();
        pedido.setTipo(tipo);

        if (tipo.equals("Personalizada")) {
            // Solicitar componentes seleccionados
            pedido.setElecciones(vista.solicitarComponentes());
        } else if (tipo.equals("Prearmada")) {
            // Solicitar modelo prearmado
            pedido.setModeloPrearmado(vista.solicitarModeloPrearmado());
        }

        // Solicitar software adicional
        pedido.setSoftware(vista.solicitarSoftware());

        // Procesar el pedido y generar la PC
        PC pc = procesarPedido(pedido);

        // Bloque que simula un tiempo de espera.
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }

        // Imprimir ticket
        String ticket = this.obtenerTicket(pc,pedido);
        vista.mostrarMensaje(ticket);

        // Guadamos el pedido en el archivo
        this.guardarPedidoEnArchivo(ticket);
    }

    /**
     * Metodo auxiliar que envia el pedido a la CentralCDMX para construir la PC.
     * 
     * @param pedido Pedido con las elecciones del cliente.
     * @return PC ensamblada y personalizada.
     */
    public PC procesarPedido(Pedido pedido) {

        vista.mostrarMensaje("\n Enviando pedido a la sede central CDMX...");

        // Bloque que simula un tiempo de espera.
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }

        vista.mostrarMensaje("\n ¡Pedido exitoso!");

        return CentralCDMX.getInstancia().nuevaPC(pedido);
    }

    /**
     * Obtiene el ticket detallado del pedido de la PC.
     * Incluye todos los componentes seleccionados, software agregado y costo total.
     * 
     * @param pc El objeto PC el cual se le genera el ticket.
     * @param pedido El pedido original del cliente.
     * @return Cadena que representa el ticket descriptivo del pedido del usuario.
     */
    public String obtenerTicket(PC pc, Pedido pedido) {

        String clave = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

        StringBuilder ticket = new StringBuilder("\n========== Ticket de Compra ==========\n");
        ticket.append("\n\tPedido: " + clave);
        ticket.append("\n\tSucursal de origen: " + pedido.getSucursal().getNombre() + "\n\n");
        ticket.append(pc.toString());
        ticket.append("\n\n\t***** Costo total: $" + pc.obtenerCosto() + " MXN.");
        return ticket.toString();
    }

    /**
    * Guarda el contenido actual en un archivo de texto.
    * @param contenido La cadena a guardar en el archivo de texto.
    */
    private void guardarPedidoEnArchivo(String contenido) {

        try (FileWriter archivo = new FileWriter("pedidos.txt", true); // Permite agregar pedidos al final del archivo, no lo sobreescribe
        PrintWriter escritor = new PrintWriter(archivo)) {
        
            // Escribimos el contenido
            escritor.write("\n" + contenido);
            escritor.close();

        } catch (IOException e) {
            vista.mostrarMensaje("Ocurrio un error al guardar el ticket en archivo.");
            e.printStackTrace();
        }
    }

}