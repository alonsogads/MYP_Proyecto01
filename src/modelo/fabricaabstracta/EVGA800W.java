package modelo.fabricaabstracta;

/**
 * Clase que representa una Fuente de Alimentacion concreta, en particular, el modelo EVGA800W.
 * Extiende la clase abstracta {@code FuenteAlimentacion} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class EVGA800W extends FuenteAlimentacion {
    /**
     * Establece los valores propios de la Fuente de Alimentacion tipo EVGA800W.
     */
    @Override
    public void crearFuenteAlimentacion() {
        nombre = "EVGA800W";
        marca = "EVGA";
        precio = 2500.0f;
        tipoComponente = "Fuente de Alimentacion";
    }
}