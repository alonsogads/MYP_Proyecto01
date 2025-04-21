package modelo.fabricaabstracta;

/**
 * Clase que representa una SSD concreta, en particular, el modelo Kingston1TB.
 * Extiende la clase abstracta {@code SSD} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Kingston1TB extends SSD {
    /**
     * Establece los valores propios de la SSD tipo Kingston1TB.
     */
    @Override
    public void crearSSD() {
        nombre = "Kingston 1TB";
        marca = "Kingston";
        precio = 1800.0f;
        tipoComponente = "Disco de estado solido";
        capacidadAlmacenamiento = "1TB";
        tipoAlmacenamiento = "SSD";
    }
}