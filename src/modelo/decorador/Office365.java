package modelo.decorador;

/**
 * Decorador que agrega Office365 a una PC. Extiende {@code DecoradorSoftware}.
 * Es una clase 'DecoradorConcreto' del patron Decorator.
 */
public class Office365 extends DecoradorSoftware{
    
    /**
     * Constructor que recibe una PC base o decorada y agrega Office365.
     * 
     * @param pc PC a la que se le agregara el software Office365.
     */
    public Office365(PC pc) {
        super(pc);
    }

    /**
     * Retorna el costo total de la PC incluyendo el software Office365.
     * 
     * @return Costo acumulado incluyendo este software.
     */
    @Override
    public float obtenerCosto() {
        return pc.obtenerCosto() + 1799.99f;
    }

    /**
     * Retorna la descripcion de la PC incluyendo el software añadido Office365.
     * 
     * @return Cadena descriptiva con el software agregado
     */
    @Override
    public String toString() {
        return pc.toString() + "\n\n\t>> Software: Office365.\n\t*** Precio: $1799.99 MXN" ;
    }

}