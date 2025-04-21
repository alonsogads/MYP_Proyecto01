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
        PlacaBase placaBase;
        switch (tipo) {
            case "AsusROGMaximusZ790":
                placaBase = new AsusROGMaximusZ790();
                placaBase.crearPlacaBase();
                return placaBase;
            case "AsusTUFGamingB760":
                placaBase = new AsusTUFGamingB760();
                placaBase.crearPlacaBase();
                return placaBase;
            case "MSIMEGGodlike":
                placaBase = new MSIMEGGodlike();
                placaBase.crearPlacaBase();
                return placaBase;();
            case "MSIMAGB760":
                placaBase = new MSIMAGB760();
                placaBase.crearPlacaBase();
                return placaBase;
            default:
                return null;
        }
    }
}