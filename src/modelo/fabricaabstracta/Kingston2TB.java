package modelo.fabricaabstracta;

/**
 * Clase que representa una SSD concreta, en particular, el modelo Kingston2TB.
 * Extiende la clase abstracta {@code SSD} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Kingston2TB extends SSD {
    /**
     * Establece los valores propios de la SSD tipo Kingston2TB.
     */
    @Override
    public void crearSSD() {
        nombre = "Kingston 2TB";
        marca = "Kingston";
        precio = 3000.0f;
        tipoComponente = "Disco de estado solido";
        capacidadAlmacenamiento = "2TB";
        tipoAlmacenamiento = "SSD";
    }
}