package modelo;

import java.util.List;
import java.util.Map;

/**
 * Clase que representa un pedido realizado por el usuario.
 * Contiene toda la informacion necesaria para ensamblar una PC:
 * Es utilizada por la clase CentralCDMX para construir la PC solicitada.
 */
public class Pedido {

    private String tipo;
    private String modeloPrearmado;
    private Map<String, List<String>> eleccionesComponentes;
    private List<String> software;
    private Sucursal sucursal;

    /**
     * Constructor por defecto.
     * Crea un pedido vacio que puede ser llenado posteriormente.
     */
    public Pedido() {}

    /**
     * Establece el tipo de compra. Puede ser "Prearmada" o "Personalizada".
     * 
     * @param tipo Tipo de compra seleccionada por el usuario.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Establece el modelo prearmado elegido por el usuario.
     * Solo se utiliza si el tipo de compra es "Prearmada".
     * 
     * @param modelo Nombre del modelo prearmado.
     */
    public void setModeloPrearmado(String modelo) {
        this.modeloPrearmado = modelo;
    }

    /**
     * Establece las elecciones de componentes realizadas por el usuario.
     * Solo se utiliza si el tipo de compra es "Personalizada".
     * 
     * @param elecciones Mapa con tipo de componente como clave y lista de modelos como valor.
     */
    public void setElecciones(Map<String, List<String>> elecciones) {
        this.eleccionesComponentes = elecciones;
    }

    /**
     * Establece la lista de programas de software adicionales que el usuario desea agregar.
     * 
     * @param software Lista con nombres de los programas.
     */
    public void setSoftware(List<String> software) {
        this.software = software;
    }

    /**
     * Establece la sucursal desde donde se realiza el pedido.
     * 
     * @param sucursal Objeto que representa la sucursal.
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * Retorna el tipo de compra.
     * 
     * @return Tipo como cadena.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Retorna el modelo prearmado seleccionado.
     * 
     * @return Nombre del modelo como cadena.
     */
    public String getModelo() {
        return modeloPrearmado;
    }

    /**
     * Retorna las elecciones de componentes del pedido.
     * 
     * @return Mapa con las elecciones personalizadas.
     */
    public Map<String, List<String>> getElecciones() {
        return eleccionesComponentes;
    }

    /**
     * Retorna la lista de software seleccionado por el usuario.
     * 
     * @return Lista de nombres de programas.
     */
    public List<String> getSoftware() {
        return software;
    }

    /**
     * Retorna la sucursal asociada al pedido.
     * 
     * @return Instancia de Sucursal.
     */
    public Sucursal getSucursal() {
        return sucursal;
    }
}