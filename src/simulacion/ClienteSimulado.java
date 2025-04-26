package simulacion;

import modelo.Pedido;
import modelo.Sucursal;
import modelo.SucursalChihuahua;
import modelo.SucursalJalisco;
import modelo.SucursalYucatan;
import modelo.singleton.CentralCDMX;
import modelo.decorador.PC;
import java.util.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que simula un cliente virtual enviando pedidos aleatorios a MonosChinos MX.
 * Se ejecuta como un hilo independiente y usa datos ficticios para las ordenes. 
 * Util para probar la clase Singleton 'CentralCDMX' bajo casos de concurrencia.
 */
public class ClienteSimulado implements Runnable {

    private boolean activa;
    private final java.util.List<Sucursal> sucursalesDisponibles;

    /**
     * Constructor por defecto que inicializa sus atributos por defecto.
     */
    public ClienteSimulado() {
        this.activa = true;
        this.sucursalesDisponibles = List.of(new SucursalJalisco(), new SucursalChihuahua(), new SucursalYucatan());
    }

    /**
     * Metodo principal que ejecuta el hilo. Genera pedidos aleatorios y los envia a la central.
     */
    @Override
    public void run() {
        while (activa) {
            try {
                // Simular tiempo aleatorio entre pedidos
                Thread.sleep(8000 + (int)(Math.random() * 10000));

                Pedido pedido = generarPedidoAleatorio();
                PC pc = CentralCDMX.getInstancia().nuevaPC(pedido);

                // Realizamos el ticket completo
                String clave = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
                StringBuilder ticket = new StringBuilder("\n========== Ticket de Compra ==========\n");
                ticket.append("\n\tPedido: " + clave);
                ticket.append("\n\tSucursal de origen: " + pedido.getSucursal().getNombre() + "\n\n");
                ticket.append(pc.toString());
                ticket.append("\n\n\t***** Costo total: $" + pc.obtenerCosto() + " MXN.");

                // Guarda el archivo el .txt
                try (FileWriter archivo = new FileWriter("pedidos.txt", true);
                PrintWriter escritor = new PrintWriter(archivo)) {
                
                    // Escribimos el contenido
                    escritor.write("\n" + ticket.toString());
                    escritor.close();

                } catch (IOException e) {
                    System.out.println("Ocurrio un error al guardar el ticket en archivo.");
                    e.printStackTrace();
                }

                System.err.println("\n\t[ClienteSimulado] ha realizado un pedido desde " + pedido.getSucursal().getNombre());
                System.out.println("\n\t");

            } catch (InterruptedException e) {
                System.err.println("\n\t[ClienteSimulado] Interrumpido.");
                System.out.println("\n\t");
                Thread.currentThread().interrupt();
            } catch (Exception e) {
                System.err.println("\n\t[ClienteSimulado] Error inesperado al generar pedido.");
                System.out.println("\n\t");
                e.printStackTrace();
            }
        }
    }

    /**
     * Genera un pedido aleatorio usando la clase DatosAleatorios.
     * 
     * @return Pedido con datos aleatorios.
     */
    public Pedido generarPedidoAleatorio() {
        Pedido pedido = new Pedido();

        String tipo = DatosAleatorios.obtenerTipoCompra();
        pedido.setTipo(tipo);

        if (tipo.equals("Personalizada")) {
            pedido.setElecciones(DatosAleatorios.obtenerComponentesAleatorios());
        } else {
            pedido.setModeloPrearmado(DatosAleatorios.obtenerModeloPrearmado());
        }

        pedido.setSoftware(DatosAleatorios.obtenerSoftwareAleatorio());
        pedido.setSucursal(DatosAleatorios.obtenerSucursalAleatoria(sucursalesDisponibles));

        return pedido;
    }

    /**
     * Detiene la ejecucion del cliente simulado.
     */
    public void detener() {
        this.activa = false;
    }
}
