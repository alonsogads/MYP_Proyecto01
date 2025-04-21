package modelo.fabricaabstracta;

/**
 * Clase que representa una Fuente de Alimentacion concreta, en particular, el modelo EVGA1500W.
 * Extiende la clase abstracta {@code FuenteAlimentacion} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class EVGA1500W extends FuenteAlimentacion {
    /**
     * Establece los valores propios de la Fuente de Alimentacion tipo EVGA1500W.
     */
    @Override
    public void crearFuenteAlimentacion() {
        nombre = "EVGA1500W";
        marca = "EVGA";
        precio = 12000.0f;
        tipoComponente = "Fuente de Alimentacion";
    }
}