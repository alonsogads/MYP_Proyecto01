package modelo.fabricaabstracta;

/**
 * Clase que representa un GPU concreto, en particular, el modelo NVIDIA RTX4080.
 * Extiende la clase abstracta {@code GPU} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class NVIDIA_RTX4080 extends GPU {
    /**
     * Establece los valores propios del GPU tipo NVIDIA RTX4080.
     */
    @Override
    public void crearGPU() {
        nombre = "NVIDIA RTX4080";
        marca = "NVIDIA";
        precio = 30000.0f;
        tipoComponente = "GPU";
        tipoMemoriaGPU = "GDDR6X";
    }
}