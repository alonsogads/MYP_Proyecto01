package modelo.fabricaabstracta;

/**
 * Clase que representa un CPU concreto, en particular, el modelo Intel Core i7 13700K.
 * Extiende la clase abstracta {@code CPU} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class IntelCorei7_13700K extends CPU {
    /**
     * Establece los valores propios del CPU tipo Intel Core i7-13700K.
     */
    @Override
    public void crearCPU() {
        nombre = "Intel Core i7-13700K";
        marca = "Intel";
        precio = 7000.0f;
        tipoComponente = "CPU";
        cantidadNucleos = 8;
    }
}