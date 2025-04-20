package modelo.fabricaabstracta;

/**
 * Clase que representa un GPU concreto, en particular, el modelo NVIDIA RTX3060.
 * Extiende la clase abstracta {@code GPU} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class NVIDIA_RTX3060 extends GPU {
    /**
     * Establece los valores propios del GPU tipo NVIDIA RTX3060.
     */
    @Override
    public void crearGPU() {
        nombre = "NVIDIA RTX3060";
        marca = "NVIDIA";
        precio = 8500.0f;
        tipoComponente = "GPU";
        tipoMemoriaGPU = "GDDR6";
    }
}