package modelo.decorador;

/**
 * Decorador que agrega TerminalWSL a una PC. Extiende {@code DecoradorSoftware}.
 * Es una clase 'DecoradorConcreto' del patron Decorator.
 */
public class TerminalWSL extends DecoradorSoftware{
    
    /**
     * Constructor que recibe una PC base o decorada y agrega TerminalWSL.
     * 
     * @param pc PC a la que se le agregara el software TerminalWSL.
     */
    public TerminalWSL(PC pc) {
        super(pc);
    }

    /**
     * Retorna el costo total de la PC incluyendo el software TerminalWSL.
     * 
     * @return Costo acumulado incluyendo este software.
     */
    @Override
    public float obtenerCosto() {
        return pc.obtenerCosto();
    }

    /**
     * Retorna la descripcion de la PC incluyendo el software añadido TerminalWSL.
     * 
     * @return Cadena descriptiva con el software agregado
     */
    @Override
    public String toString() {
        return pc.toString() + "\n\n\t>> Software: TerminalWSL.\n\t*** Precio: $0.00 MXN" ;
    }

}