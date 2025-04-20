package modelo.fabricaabstracta;

/**
 * Clase que representa un CPU concreto, en particular, el modelo Intel Core i5-13600K.
 * Extiende la clase abstracta {@code CPU} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class IntelCorei5_13600K extends CPU{
    /**
     * Establece los valores propios del CPU tipo Intel Core i5-13600K.
     */
    @Override
    public void crearCPU(){
        nombre = "Intel Core i5-13600K";
        marca = "Intel";
        precio = 5500.0f;
        tipoComponente = "CPU";
        cantidadNucleos = 6;
    }
}