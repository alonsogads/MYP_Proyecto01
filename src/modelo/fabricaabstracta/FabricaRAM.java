package modelo.fabricaabstracta;

/**
 * Clase para la creacion de objetos (componentes) de tipo RAM.
 * Implementa el metodo {@code getComponente} definido en {@code FabricaAbstractaComponente}.
 * 
 * Esta es una clase 'FabricaConcreta' del patron AbstractFactory.
 */
public class FabricaRAM extends FabricaAbstractaComponente{
    /**
     * Devuelve una instancia concreta de una RAM en funcion del tipo pasado como parametro.
     * 
     * @param tipo Nombre del modelo de RAM solicitado (por ejemplo, Adata8GB).
     * @return Una instancia del componente correspondiente o {@code null} si no coincide.
     */
    @Override
    public Object getComponente(String tipo) {
        switch (tipo) {
            case "Adata8GB":
                return new Adata8GB();
            case "Adata16GB":
                return new Adata16GB();
            case "Adata32GB":
                return new Adata32GB();
            case "Kingston8GB":
                return new Kingston8GB();
            case "Kingston16GB":
                return new Kingston16GB();
            case "Kingston32GB":
                return new Kingston32GB();
            default:
                return null;
        }
    }
}