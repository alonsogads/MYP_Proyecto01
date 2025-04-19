package modelo.decorador;

/**
 * Decorador que agrega AutoCad a una PC. Extiende {@code DecoradorSoftware}.
 * Es una clase 'DecoradorConcreto' del patron Decorator.
 */
public class AutoCad extends DecoradorSoftware{
    
    /**
     * Constructor que recibe una PC base o decorada y agrega AutoCad.
     * 
     * @param pc PC a la que se le agregara el software AutoCad.
     */
    public AutoCad(PC pc) {
        super(pc);
    }

    /**
     * Retorna el costo total de la PC incluyendo el software AutoCad.
     * 
     * @return Costo acumulado incluyendo este software.
     */
    @Override
    public float obtenerCosto() {
        return pc.obtenerCosto() + 29999.99f;
    }

    /**
     * Retorna la descripcion de la PC incluyendo el software añadido AutoCad.
     * 
     * @return Cadena descriptiva con el software agregado
     */
    @Override
    public String toString() {
        return pc.toString() + "\n\n\t>> Software: AutoCad.\n\t*** Precio: $29999.99 MXN" ;
    }

}