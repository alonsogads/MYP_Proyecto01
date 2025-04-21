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
        RAM ram;
        switch (tipo) {
            case "Adata8GB":
                ram = new Adata8GB();
                ram.crearRAM();
                return ram;
            case "Adata16GB":
                ram = new Adata16GB();
                ram.crearRAM();
                return ram;
            case "Adata32GB":
                ram = new Adata32GB();
                ram.crearRAM();
                return ram;
            case "Kingston8GB":
                ram = new Kingston8GB();
                ram.crearRAM();
                return ram;
            case "Kingston16GB":
                ram = new Kingston16GB();
                ram.crearRAM();
                return ram;
            case "Kingston32GB":
                ram = new Kingston32GB();
                ram.crearRAM();
                return ram;
            default:
                return null;
        }
    }
}