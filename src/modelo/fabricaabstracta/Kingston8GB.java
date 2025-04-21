package modelo.fabricaabstracta;

/**
 * Clase que representa una RAM concreta, en particular, el modelo Kingston8GB.
 * Extiende la clase abstracta {@code RAM} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Kingston8GB extends RAM {
    /**
     * Establece los valores propios de la RAM tipo Kingston8GB.
     */
    @Override
    public void crearRAM() {
        nombre = "Kingston 8GB";
        marca = "Kingston";
        precio = 700.0f;
        tipoComponente = "RAM";
        capacidad = 8;
    }
}