package modelo.fabricaabstracta;

/**
 * Clase para la creacion de objetos (componentes) de tipo Gabinete.
 * Implementa el metodo {@code getComponente} definido en {@code FabricaAbstractaComponente}.
 * 
 * Esta es una clase 'FabricaConcreta' del patron AbstractFactory.
 */
public class FabricaGabinete extends FabricaAbstractaComponente{
    /**
     * Devuelve una instancia concreta de Gabinete en funcion del tipo pasado como parametro.
     * 
     * @param tipo Nombre del modelo del Gabinete solicitado (por ejemplo, YeyianLancerATX).
     * @return Una instancia del componente correspondiente o {@code null} si no coincide.
     */
    @Override
    public Object getComponente(String tipo) {
        Gabinete gabinete;
        switch (tipo) {
            case "NZXTH6FlowATX":
                gabinete = new NZXTH6FlowATX();
                gabinete.crearGabinete();
                return gabinete;
            case "YeyianLancerATX":
                gabinete = new YeyianLancerATX();
                gabinete.crearGabinete();
                return gabinete;
            default:
                return null;
        }
    }
}