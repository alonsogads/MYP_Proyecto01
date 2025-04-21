package modelo.fabricaabstracta;

/**
 * Clase que representa una Fuente de Alimentacion concreta, en particular, el modelo EVGA1000W.
 * Extiende la clase abstracta {@code FuenteAlimentacion} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class EVGA1000W extends FuenteAlimentacion {
    /**
     * Establece los valores propios de la Fuente de Alimentacion tipo EVGA1000W.
     */
    @Override
    public void crearFuenteAlimentacion() {
        nombre = "EVGA1000W";
        marca = "EVGA";
        precio = 5700.0f;
        tipoComponente = "Fuente de Alimentacion";
    }
}