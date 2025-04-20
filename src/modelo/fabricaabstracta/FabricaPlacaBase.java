package modelo.fabricaabstracta;

/**
 * Clase para la creacion de objetos (componentes) de tipo Placa Base.
 * Implementa el metodo {@code getComponente} definido en {@code FabricaAbstractaComponente}.
 * 
 * Esta es una clase 'FabricaConcreta' del patron AbstractFactory.
 */
public class FabricaPlacaBase extends FabricaAbstractaComponente{
    /**
     * Devuelve una instancia concreta de una Placa Base en funcion del tipo pasado como parametro.
     * 
     * @param tipo Nombre del modelo de la Placa Base solicitada (por ejemplo, AsusROGMaximusZ790).
     * @return Una instancia del componente correspondiente o {@code null} si no coincide.
     */
    @Override
    public Object getComponente(String tipo) {
        switch (tipo) {
            case "AsusROGMaximusZ790":
                return new AsusROGMaximusZ790();
            case "AsusTUFGamingB760":
                return new AsusTUFGamingB760();
            case "MSIMEGGodlike":
                return new MSIMEGGodlike();
            case "MSIMAGB760":
                return new MSIMAGB760();
            default:
                return null;
        }
    }
}