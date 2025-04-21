package modelo.fabricaabstracta;

/**
 * Clase que representa un GPU concreto, en particular, el modelo NVIDIA GTX1660.
 * Extiende la clase abstracta {@code GPU} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class NVIDIA_GTX1660 extends GPU {
    /**
     * Establece los valores propios del GPU tipo NVIDIA GTX1660.
     */
    @Override
    public void crearGPU() {
        nombre = "NVIDIA GTX1660";
        marca = "NVIDIA";
        precio = 5500.0f;
        tipoComponente = "GPU";
        tipoMemoriaGPU = "GDDR5";
    }
}
