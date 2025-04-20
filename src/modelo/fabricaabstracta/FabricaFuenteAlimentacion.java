package modelo.fabricaabstracta;

/**
 * Clase para la creacion de objetos (componentes) de tipo Fuente de Alimentacion.
 * Implementa el metodo {@code getComponente} definido en {@code FabricaAbstractaComponente}.
 * 
 * Esta es una clase 'FabricaConcreta' del patron AbstractFactory.
 */
public class FabricaFuenteAlimentacion extends FabricaAbstractaComponente{
    /**
     * Devuelve una instancia concreta de una Fuente Alimentacion en funcion del tipo pasado como parametro.
     * 
     * @param tipo Nombre del modelo de Fuente de Alimentacion solicitado (por ejemplo, "EVGA800W").
     * @return Una instancia del componente correspondiente o {@code null} si no coincide.
     */
    @Override
    public Object getComponente(String tipo) {
        switch (tipo) {
            case "EVGA800W":
                return new EVGA800W();
            case "EVGA1000W":
                return new EVGA1000W();
            case "EVGA1500W":
                return new EVGA1500W();
            case "Corsair800W":
                return new Corsair800W();
            case "Corsair1200W":
                return new Corsair1200W();
            case "Corsair1500W":
                return new Corsair1500W();
            case "XPG500W":
                return new XPG500W();
            case "XPG700W":
                return new XPG700W();
            case "XPG1000W":
                return new XPG1000W();
            default:
                return null;
        }
    }
}