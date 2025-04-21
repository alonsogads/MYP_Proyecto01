package modelo.fabricaabstracta;

/**
 * Clase que representa una SSD concreta, en particular, el modelo Kingston500GB.
 * Extiende la clase abstracta {@code SSD} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Kingston500GB extends SSD {
    /**
     * Establece los valores propios de la SSD tipo Kingston500GB.
     */
    @Override
    public void crearSSD() {
        nombre = "Kingston 500GB";
        marca = "Kingston";
        precio = 1000.0f;
        tipoComponente = "Disco de estado solido";
        capacidadAlmacenamiento = "500GB";
        tipoAlmacenamiento = "SSD";
    }
}