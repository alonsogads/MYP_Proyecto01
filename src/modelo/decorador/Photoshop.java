package modelo.decorador;

/**
 * Decorador que agrega Photoshop a una PC. Extiende {@code DecoradorSoftware}.
 * Es una clase 'DecoradorConcreto' del patron Decorator.
 */
public class Photoshop extends DecoradorSoftware{
    
    /**
     * Constructor que recibe una PC base o decorada y agrega Photoshop.
     * 
     * @param pc PC a la que se le agregara el software Photoshop.
     */
    public Photoshop(PC pc) {
        super(pc);
    }

    /**
     * Retorna el costo total de la PC incluyendo el software Photoshop.
     * 
     * @return Costo acumulado incluyendo este software.
     */
    @Override
    public float obtenerCosto() {
        return pc.obtenerCosto() + 3499.99f;
    }

    /**
     * Retorna la descripcion de la PC incluyendo el software añadido Photoshop.
     * 
     * @return Cadena descriptiva con el software agregado
     */
    @Override
    public String toString() {
        return pc.toString() + "\n\n\t>> Software: Photoshop.\n\t*** Precio: $3499.99 MXN" ;
    }

}