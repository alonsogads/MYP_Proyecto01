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
        GPU gpu;
        switch (tipo) {
            case "NVIDIA_GTX1660":
                gpu = new NVIDIA_GTX1660();
                gpu.crearGPU();
                return gpu;
            case "NVIDIA_RTX3060":
                gpu = new NVIDIA_RTX3060();
                gpu.crearGPU();
                return gpu;
            case "NVIDIA_RTX4070":
                gpu = new NVIDIA_RTX4070();
                gpu.crearGPU();
                return gpu;
            case "NVIDIA_RTX4080":
                gpu = new NVIDIA_RTX4080();
                gpu.crearGPU();
                return gpu;
            case "NVIDIA_RTX4090":
                gpu = new NVIDIA_RTX4090();
                gpu.crearGPU();
                return gpu;
            default:
                return null;
        }
    }
}