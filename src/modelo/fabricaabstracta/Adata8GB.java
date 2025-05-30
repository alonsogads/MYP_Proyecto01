package modelo.fabricaabstracta;

/**
 * Clase que representa una RAM concreta, en particular, el modelo Adata8GB.
 * Extiende la clase abstracta {@code RAM} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Adata8GB extends RAM {
    /**
     * Establece los valores propios de la RAM tipo Adata8GB.
     */
    @Override
    public void crearRAM() {
        nombre = "Adata 8GB";
        marca = "Adata";
        precio = 550.0f;
        tipoComponente = "RAM";
        capacidad = 8;
    }
}
