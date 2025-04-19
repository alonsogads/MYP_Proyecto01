package modelo.decorador;

/**
 * Decorador que agrega Windows 11 a una PC. Extiende {@code DecoradorSoftware}.
 * Es una clase 'DecoradorConcreto' del patron Decorator.
 */
public class Windows11 extends DecoradorSoftware{
    
    /**
     * Constructor que recibe una PC base o decorada y agrega Windows 11.
     * 
     * @param pc PC a la que se le agregara el software Windows 11.
     */
    public Windows11(PC pc) {
        super(pc);
    }

    /**
     * Retorna el costo total de la PC incluyendo el software Windows 11.
     * 
     * @return Costo acumulado incluyendo este software.
     */
    @Override
    public float obtenerCosto() {
        return pc.obtenerCosto() + 4999.99f;
    }

    /**
     * Retorna la descripcion de la PC incluyendo el software añadido Windows 11.
     * 
     * @return Cadena descriptiva con el software agregado
     */
    @Override
    public String toString() {
        return pc.toString() + "\n\n\t>> Software: Windows 11.\n\t*** Precio: $4999.99 MXN" ;
    }

}