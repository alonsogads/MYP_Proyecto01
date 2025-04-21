package modelo.fabricaabstracta;

/**
 * Clase que representa una RAM concreta, en particular, el modelo Kingston16GB.
 * Extiende la clase abstracta {@code RAM} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Kingston16GB extends RAM {
    /**
     * Establece los valores propios de la RAM tipo Kingston16GB.
     */
    @Override
    public void crearRAM() {
        nombre = "Kingston 16GB";
        marca = "Kingston";
        precio = 1500.0f;
        tipoComponente = "RAM";
        capacidad = 16;
    }
}