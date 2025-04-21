package modelo.fabricaabstracta;

/**
 * Clase para la creacion de objetos (componentes) de tipo SSD.
 * Implementa el metodo {@code getComponente} definido en {@code FabricaAbstractaComponente}.
 * 
 * Esta es una clase 'FabricaConcreta' del patron AbstractFactory.
 */
public class FabricaSSD extends FabricaAbstractaComponente{
    /**
     * Devuelve una instancia concreta de un disco duro SSD en funcion del tipo pasado como parametro.
     * 
     * @param tipo Nombre del modelo del SSD solicitado (por ejemplo, Kingston500GB).
     * @return Una instancia del componente correspondiente o {@code null} si no coincide.
     */
    @Override
    public Object getComponente(String tipo) {
        SSD ssd;
        switch (tipo) {
            case "Kingston500GB":
                ssd = new Kingston500GB();
                ssd.crearSSD();
                return ssd;
            case "Kingston1TB":
                ssd = new Kingston1TB();
                ssd.crearSSD();
                return ssd;
            case "Kingston2TB":
                ssd = new Kingston2TB();
                ssd.crearSSD();
                return ssd;
            case "Kingston4TB":
                ssd = new Kingston4TB();
                ssd.crearSSD();
                return ssd;
            default:
                return null;
        }
    }
}