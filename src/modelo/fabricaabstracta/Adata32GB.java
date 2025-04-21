package modelo.fabricaabstracta;

/**
 * Clase que representa una RAM concreta, en particular, el modelo Adata32GB.
 * Extiende la clase abstracta {@code RAM} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class Adata32GB extends RAM {
    /**
     * Establece los valores propios de la RAM tipo Adata32GB.
     */
    @Override
    public void crearRAM() {
        nombre = "Adata 32GB";
        marca = "Adata";
        precio = 2500.0f;
        tipoComponente = "RAM";
        capacidad = 32;
    }
}