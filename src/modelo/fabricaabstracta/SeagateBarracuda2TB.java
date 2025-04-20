package modelo.fabricaabstracta;

/**
 * Clase que representa una HDD concreta, en particular, el modelo SeagateBarracuda2TB.
 * Extiende la clase abstracta {@code HDD} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class SeagateBarracuda2TB extends HDD {
    /**
     * Establece los valores propios de la HDD tipo SeagateBarracuda2TB.
     */
    @Override
    public void crearHDD() {
        nombre = "Seagate Barracuda 2TB";
        marca = "Seagate";
        precio = 1500.0f;
        tipoComponente = "Disco Duro";
        capacidadAlmacenamiento = "2TB"
        tipoAlmacenamiento = "HDD"
    }
}