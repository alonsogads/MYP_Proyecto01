package modelo.fabricaabstracta;

/**
 * Clase que representa una Placa Base concreta, en particular, el modelo MSIMEGGodlike.
 * Extiende la clase abstracta {@code PlacaBase} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class MSIMAGB760 extends PlacaBase {
    /**
     * Establece los valores propios de la Placa Base tipo MSIMEGGodlike.
     */
    @Override
    public void crearPlacaBase() {
        nombre = "MSI MEG Godlike";
        marca = "MSI";
        precio = 30000.0f;
        tipoComponente = "Placa Base";
        chipset = "Intel Z790";
    }
}