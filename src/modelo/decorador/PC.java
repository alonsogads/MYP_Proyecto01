package modelo.decorador;

/**
 * Interfaz que define el comportamiento de una PC ensamblada.
 * Define los metodos que deberan ser implementados por las PCs y sus decoradores.
 * 
 * Es la interfaz 'Componente' del patron Decorator.
 */
public interface PC {

    /**
     * Devuelve el costo total de la PC incluyendo cualquier software adicional aplicado si el caso.
     * 
     * @return El costo total como valor decimal.
     */
    public float obtenerCosto();

    /**
     * Devuelve una descripcion completa de la PC, incluyendo el software añadido si aplica.
     * 
     * @return Cadena que desglosa la informacion de la PC.
     */
    String toString();

}