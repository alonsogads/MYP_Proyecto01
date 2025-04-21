package controlador;

import vista.VistaSucursal;
import modelo.*;
import modelo.singleton.CentralCDMX;
import modelo.decorador.PC;

import java.util.List;
import java.util.Map;
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

        // Mostrar resumen final
        imprimirTicket(pc);
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
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {            
            e.printStackTrace();
        }

        vista.mostrarMensaje("\n ¡Pedido exitoso!");

        return CentralCDMX.getInstancia().nuevaPC(pedido);
    }

    /**
     * Imprime el ticket detallado de la PC ensamblada.
     * Incluye todos los componentes seleccionados, software agregado y costo total.
     * 
     * @param pc Objeto PC ensamblado.
     */
    public void imprimirTicket(PC pc) {
        vista.mostrarMensaje("\n========== Ticket de Compra ==========");
        vista.mostrarMensaje(pc.toString());
    }
}