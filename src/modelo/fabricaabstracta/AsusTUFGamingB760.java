package modelo.fabricaabstracta;

/**
 * Clase que representa una Placa Base concreta, en particular, el modelo AsusTUFGamingB760.
 * Extiende la clase abstracta {@code PlacaBase} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class AsusTUFGamingB760 extends PlacaBase {
    /**
     * Establece los valores propios de la Placa Base tipo AsusTUFGamingB760.
     */
    @Override
    public void crearPlacaBase() {
        nombre = "Asus TUF Gaming B760";
        marca = "Asus";
        precio = 5000.0f;
        tipoComponente = "Placa Base";
        chipset = "B760";
    }
}