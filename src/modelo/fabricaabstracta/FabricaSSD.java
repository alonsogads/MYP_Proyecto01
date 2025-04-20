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
        switch (tipo) {
            case "Kingston500GB":
                return new Kingston500GB();
            case "Kingston1TB":
                return new Kingston1TB();
            case "Kingston2TB":
                return new Kingston2TB();
            case "Kingston4TB":
                return new Kingston4TB();
            default:
                return null;
        }
    }
}