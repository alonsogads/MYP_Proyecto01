package modelo;

import controlador.ControladorPC;
import vista.VistaSucursal;

/**
 * Clase que representa la sucursal de MonosChinos MX ubicada en Yucatan. Implementa {@code Sucursal}.
 * Al invocar realizarPedido(), se crea la vista y controlador asociados y se inicia el flujo de compra.
 */
public class SucursalYucatan implements Sucursal {

    /**
     * Inicia el proceso de compra al cliente desde la sucursal Yucatan.
     * Crea la vista parametrizada con esta sucursal y lanza el controlador correspondiente.
     */
    @Override
    public void realizarPedido() {
        VistaSucursal vista = new VistaSucursal(this);
        ControladorPC controlador = new ControladorPC(vista);
        controlador.iniciar();
    }

    /**
     * Retorna el nombre identificador de esta sucursal.
     * 
     * @return El nombre de la sucursal que realiza el pedido.
     */
    @Override
    public String getNombre() {
        return "Yucatan";
    }
}