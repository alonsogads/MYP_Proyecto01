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
        FuenteAlimentacion fuenteAlimentacion;

        switch (tipo) {
            case "EVGA800W":
                fuenteAlimentacion = new EVGA800W();
                fuenteAlimentacion.crearFuenteAlimentacion();
                return fuenteAlimentacion;
            case "EVGA1000W":
                fuenteAlimentacion = new EVGA1000W();
                fuenteAlimentacion.crearFuenteAlimentacion();
                return fuenteAlimentacion;
            case "EVGA1500W":
                fuenteAlimentacion = new EVGA1500W();
                fuenteAlimentacion.crearFuenteAlimentacion();
                return fuenteAlimentacion;
            case "Corsair800W":
                fuenteAlimentacion = new Corsair800W();
                fuenteAlimentacion.crearFuenteAlimentacion();
                return fuenteAlimentacion;
            case "Corsair1200W":
                fuenteAlimentacion = new Corsair1200W();
                fuenteAlimentacion.crearFuenteAlimentacion();
                return fuenteAlimentacion;
            case "Corsair1500W":
                fuenteAlimentacion = new Corsair1500W();
                fuenteAlimentacion.crearFuenteAlimentacion();
                return fuenteAlimentacion;
            case "XPG500W":
                fuenteAlimentacion = new XPG500W();
                fuenteAlimentacion.crearFuenteAlimentacion();
                return fuenteAlimentacion;
            case "XPG700W":
                fuenteAlimentacion = new XPG700W();
                fuenteAlimentacion.crearFuenteAlimentacion();
                return fuenteAlimentacion;
            case "XPG1000W":
                fuenteAlimentacion = new XPG1000W();
                fuenteAlimentacion.crearFuenteAlimentacion();
                return fuenteAlimentacion;
            default:
                return null;
        }
    }
}