package modelo.fabricaabstracta;

/**
 * Clase que representa una Placa Base concreta, en particular, el modelo AsusROGMaximusZ790.
 * Extiende la clase abstracta {@code PlacaBase} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class AsusROGMaximusZ790 extends PlacaBase {
    /**
     * Establece los valores propios de la Placa Base tipo AsusROGMaximusZ790.
     */
    @Override
    public void crearPlacaBase() {
        nombre = "Asus ROG Maximus Z790";
        marca = "Asus";
        precio = 13000.0f;
        tipoComponente = "Placa Base";
        chipset = "Z790";
    }
}
