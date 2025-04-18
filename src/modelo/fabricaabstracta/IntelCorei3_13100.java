package modelo.fabricaabstracta;

/**
 * Clase que representa un CPU concreto, en particular, el modelo Intel Core i3-13100.
 * Extiende la clase abstracta {@code CPU} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class IntelCorei3_13100 extends CPU {
    /**
     * Establece los valores propios del CPU tipo Intel Core i3-13100.
     */
    @Override
    public void crearCPU() {
        nombre = "Intel Core i3-13100";
        marca = "Intel";
        precio = 2900.0f;
        tipoComponente = "CPU";
        cantidadNucleos = 4;
    }
}
