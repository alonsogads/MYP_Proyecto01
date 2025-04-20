package modelo;

/**
 * Excepcion que notifica al usuario que un componente es incompatible con una PC corazon Intel
 * y el sistema requerira el uso de un adaptador para una correcta compatibilidad.
 */
public class ComponenteIncompatibleException extends Exception {

    /**
     * Constructor que crea una nueva excepcion con un mensaje personalizado.
     * 
     * @param mensaje La descripcion que avisa al usuario.
     */
    public ComponenteIncompatibleException(String mensaje) {
        super(mensaje);
    }
}