package modelo.decorador;

/**
 * Clase abstracta que actua como base de los decoradores para agregar software a una PC. 
 * Implementa la interfaz {@code PC} y contiene una referencia a otra instancia de {@code PC}.
 * Es la clase 'DecoradorBase' del patron Decorator.
 */
public abstract class DecoradorSoftware implements PC {

    protected PC pc;

    /**
     * Constructor que recibe una instancia de {@code PC} a la cual se le agregara software.
     * @param pc El objeto tipo {@code PC} que se va a decorar.
     */
    public DecoradorSoftware(PC pc) {
        this.pc = pc;
    }

    /**
     * Retorna el costo total de la PC incluyendo el software agregado por el decorador.
     * @return Costo total de la PC con sus decoradores en float.
     */
    public abstract float obtenerCosto();

    /**
     * Retorna la descripcion completa de la PC con el software decorado.
     * @return Cadena descriptiva de la PC incluyendo el software aplicado.
     */
    public abstract String toString();
}