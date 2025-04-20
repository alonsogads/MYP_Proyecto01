package modelo.fabricaabstracta;

/**
 * Clase para la creacion de objetos (componentes) de tipo GPU.
 * Implementa el metodo {@code getComponente} definido en {@code FabricaAbstractaComponente}.
 * 
 * Esta es una clase 'FabricaConcreta' del patron AbstractFactory.
 */
public class FabricaGPU extends FabricaAbstractaComponente{
    /**
     * Devuelve una instancia concreta de una GPU en funcion del tipo pasado como parametro.
     * 
     * @param tipo Nombre del modelo de GPU solicitado (por ejemplo, "NVIDIA_GTX1660").
     * @return Una instancia del componente correspondiente o {@code null} si no coincide.
     */
    @Override
    public Object getComponente(String tipo) {
        switch (tipo) {
            case "NVIDIA_GTX1660":
                return new NVIDIA_GTX1660();
            case "NVIDIA_RTX3060":
                return new NVIDIA_RTX3060();
            case "NVIDIA_RTX4070":
                return new NVIDIA_RTX4070();
            case "NVIDIA_RTX4080":
                return new NVIDIA_RTX4080();
            case "NVIDIA_RTX4090":
                return new NVIDIA_RTX4090();
            default:
                return null;
        }
    }
}