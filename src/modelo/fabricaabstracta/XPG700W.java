package modelo.fabricaabstracta;

/**
 * Clase que representa una Fuente de Alimentacion concreta, en particular, el modelo XPG700W.
 * Extiende la clase abstracta {@code FuenteAlimentacion} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class XPG700W extends FuenteAlimentacion {
    /**
     * Establece los valores propios de la Fuente de Alimentacion tipo XPG700W.
     */
    @Override
    public void crearFuenteAlimentacion() {
        nombre = "XPG 700W";
        marca = "XPG";
        precio = 2500.0f;
        tipoComponente = "Fuente de Alimentacion";
    }
}