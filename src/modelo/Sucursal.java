package modelo;

/**
 * Interfaz que representa una sucursal de MonosChinos MX.
 * Toda sucursal concreta debe poder iniciar un pedido y tener un nombre.
 */
public interface Sucursal {

    /**
     * Inicia una vista al cliente para realizar un pedido.
     */
    public void realizarPedido();

    /**
     * Retorna el nombre de la sucursal.
     * 
     * @return Nombre de la sucursal como cadena.
     */
    public String getNombre();
}