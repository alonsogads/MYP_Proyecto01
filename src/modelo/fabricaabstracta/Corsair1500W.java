package modelo.fabricaabstracta;

/**
 * Clase que representa una Fuente de Alimentacion concreta, en particular, el modelo Cosair1500W.
 * Extiende la clase abstracta {@code FuenteAlimentacion} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Corsair1500W extends FuenteAlimentacion {
    /**
     * Establece los valores propios de la Fuente de Alimentacion tipo Cosair1500W.
     */
    @Override
    public void crearFuenteAlimentacion() {
        nombre = "Cosair 1500W";
        marca = "Cosair";
        precio = 11500.0f;
        tipoComponente = "Fuente de Alimentacion";
    }
}