package modelo.fabricaabstracta;

/**
 * Clase que representa un CPU concreto, en particular, el modelo Intel Core i9 13900K.
 * Extiende la clase abstracta {@code CPU} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class IntelCorei9_13900K extends CPU {
    /**
     * Establece los valores propios del CPU tipo Intel Core i9-13900K.
     */
    @Override
    public void crearCPU() {
        nombre = "Intel Core i9-13900K";
        marca = "Intel";
        precio = 10000.0f;
        tipoComponente = "CPU";
        cantidadNucleos = 8;
    }
}