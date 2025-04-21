package modelo.fabricaabstracta;

/**
 * Clase que representa un Gabinete concreto, en particular, el modelo YeyianLancerATX.
 * Extiende la clase abstracta {@code Gabinete} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class YeyianLancerATX extends Gabinete {
    /**
     * Establece los valores propios del gabinete tipo YeyianLancerATX.
     */
    @Override
    public void crearGabinete() {
        nombre = "Yeyian Lancer ATX";
        marca = "Yeyian";
        precio = 3300.0f;
        tipoComponente = "Gabinete";
    }
}