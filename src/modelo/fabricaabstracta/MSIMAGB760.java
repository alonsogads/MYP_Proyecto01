package modelo.fabricaabstracta;

/**
 * Clase que representa una Placa Base concreta, en particular, el modelo MSIMAGB760.
 * Extiende la clase abstracta {@code PlacaBase} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class MSIMAGB760 extends PlacaBase {
    /**
     * Establece los valores propios de la Placa Base tipo MSIMAGB760.
     */
    @Override
    public void crearPlacaBase() {
        nombre = "MSI MAG B760";
        marca = "MSI";
        precio = 4800.0f;
        tipoComponente = "Placa Base";
        chipset = "B760";
    }
}