package modelo.fabricaabstracta;

/**
 * Clase que representa una Fuente de Alimentacion concreta, en particular, el modelo Cosair800W.
 * Extiende la clase abstracta {@code FuenteAlimentacion} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Corsair800W extends FuenteAlimentacion {
    /**
     * Establece los valores propios de la Fuente de Alimentacion tipo Cosair800W.
     */
    @Override
    public void crearFuenteAlimentacion() {
        nombre = "Cosair 800W";
        marca = "Cosair";
        precio = 3200.0f;
        tipoComponente = "Fuente de Alimentacion";
    }
}