package modelo.fabricaabstracta;

/**
 * Clase que representa una HDD concreta, en particular, el modelo WesternDigitalBlue500GB.
 * Extiende la clase abstracta {@code HDD} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class WesternDigitalBlue500GB extends HDD {
    /**
     * Establece los valores propios de la HDD tipo WesternDigitalBlue500GB.
     */
    @Override
    public void crearHDD() {
        nombre = "Western Digital Blue 500GB";
        marca = "WD Blue";
        precio = 550.0f;
        tipoComponente = "Disco Duro";
        capacidadAlmacenamiento = "500GB"
        tipoAlmacenamiento = "HDD"
    }
}