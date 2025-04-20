package modelo.fabricaabstracta;

/**
 * Clase que representa una RAM concreta, en particular, el modelo Adata16GB.
 * Extiende la clase abstracta {@code RAM} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Adata16GB extends RAM {
    /**
     * Establece los valores propios de la RAM tipo Adata16GB.
     */
    @Override
    public void crearRAM() {
        nombre = "Adata 16GB";
        marca = "Adata";
        precio = 1200.0f;
        tipoComponente = "RAM";
        capacidad = 16;
    }
}