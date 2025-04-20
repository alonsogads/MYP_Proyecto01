package modelo.fabricaabstracta;

/**
 * Clase para la creacion de objetos (componentes) de tipo HDD.
 * Implementa el metodo {@code getComponente} definido en {@code FabricaAbstractaComponente}.
 * 
 * Esta es una clase 'FabricaConcreta' del patron AbstractFactory.
 */
public class FabricaPlacaBase extends FabricaAbstractaComponente{
    /**
     * Devuelve una instancia concreta de un HDD en funcion del tipo pasado como parametro.
     * 
     * @param tipo Nombre del modelo del HDD solicitado (por ejemplo, WesternDigitalBlue1TB).
     * @return Una instancia del componente correspondiente o {@code null} si no coincide.
     */
    @Override
    public Object getComponente(String tipo) {
        switch (tipo) {
            case "WesternDigitalBlue500GB":
                return new WesternDigitalBlue500GB();
            case "WesternDigitalBlue1TB":
                return new WesternDigitalBlue1TB();
            case "SeagateBarracuda1TB":
                return new SeagateBarracuda1TB();
            case "SeagateBarracuda2TB":
                return new SeagateBarracuda2TB();
            default:
                return null;
        }
    }
}