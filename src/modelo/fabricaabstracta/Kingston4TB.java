package modelo.fabricaabstracta;

/**
 * Clase que representa una SSD concreta, en particular, el modelo Kingston4TB.
 * Extiende la clase abstracta {@code SSD} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Kingston4TB extends SSD {
    /**
     * Establece los valores propios de la SSD tipo Kingston4TB.
     */
    @Override
    public void crearHDD() {
        nombre = "Kingston 4TB";
        marca = "Kingston";
        precio = 7000.0f;
        tipoComponente = "Disco Duro";
        capacidadAlmacenamiento = "4TB";
        tipoAlmacenamiento = "SSD";
    }
}