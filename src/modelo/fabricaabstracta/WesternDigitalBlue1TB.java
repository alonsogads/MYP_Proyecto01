package modelo.fabricaabstracta;

/**
 * Clase que representa una HDD concreta, en particular, el modelo WesternDigitalBlue1TB.
 * Extiende la clase abstracta {@code HDD} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class WesternDigitalBlue1TB extends HDD {
    /**
     * Establece los valores propios de la HDD tipo WesternDigitalBlue1TB.
     */
    @Override
    public void crearHDD() {
        nombre = "Western Digital Blue 1TB";
        marca = "WD Blue";
        precio = 1000.0f;
        tipoComponente = "Disco Duro";
        capacidadAlmacenamiento = "1TB";
        tipoAlmacenamiento = "HDD";
    }
}