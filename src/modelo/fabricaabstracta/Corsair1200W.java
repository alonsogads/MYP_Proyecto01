package modelo.fabricaabstracta;

/**
 * Clase que representa una Fuente de Alimentacion concreta, en particular, el modelo Cosair1200W.
 * Extiende la clase abstracta {@code FuenteAlimentacion} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Cosair1200W extends FuenteAlimentacion {
    /**
     * Establece los valores propios de la Fuente de Alimentacion tipo Cosair1200W.
     */
    @Override
    public void crearFuenteAlimentacion() {
        nombre = "Cosair 1200W";
        marca = "Cosair";
        precio = 8800.0f;
        tipoComponente = "Fuente de Alimentacion";
    }
}