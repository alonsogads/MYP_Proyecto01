package modelo.fabricaabstracta;

/**
 * Clase que representa una Fuente de Alimentacion concreta, en particular, el modelo XPG1000W.
 * Extiende la clase abstracta {@code FuenteAlimentacion} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class XPG1000W extends FuenteAlimentacion {
    /**
     * Establece los valores propios de la Fuente de Alimentacion tipo XPG1000W.
     */
    @Override
    public void crearFuenteAlimentacion() {
        nombre = "XPG 1000W";
        marca = "XPG";
        precio = 4500.0f;
        tipoComponente = "Fuente de Alimentacion";
    }
}