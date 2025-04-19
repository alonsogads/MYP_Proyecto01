package modelo.decorador;

/**
 * Decorador que agrega Windows 10 a una PC. Extiende {@code DecoradorSoftware}.
 * Es una clase 'DecoradorConcreto' del patron Decorator.
 */
public class Windows10 extends DecoradorSoftware{
    
    /**
     * Constructor que recibe una PC base o decorada y agrega Windows 10.
     * 
     * @param pc PC a la que se le agregara el software Windows 10.
     */
    public Windows10(PC pc) {
        super(pc);
    }

    /**
     * Retorna el costo total de la PC incluyendo el software Windows 10.
     * 
     * @return Costo acumulado incluyendo este software.
     */
    @Override
    public float obtenerCosto() {
        return pc.obtenerCosto() + 2499.99f;
    }

    /**
     * Retorna la descripcion de la PC incluyendo el software añadido Windows 10.
     * 
     * @return Cadena descriptiva con el software agregado
     */
    @Override
    public String toString() {
        return pc.toString() + "\n\n\t>> Software: Windows 10.\n\t*** Precio: $2499.99 MXN" ;
    }

}