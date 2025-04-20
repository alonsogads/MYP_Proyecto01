package modelo.fabricaabstracta;

/**
 * Clase que representa una HDD concreta, en particular, el modelo SeagateBarracuda1TB.
 * Extiende la clase abstracta {@code HDD} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class SeagateBarracuda1TB extends HDD {
    /**
     * Establece los valores propios del HDD tipo SeagateBarracuda1TB.
     */
    @Override
    public void crearHDD() {
        nombre = "Seagate Barracuda 1TB";
        marca = "Seagate";
        precio = 1000.0f;
        tipoComponente = "Disco Duro";
        capacidadAlmacenamiento = "1TB"
        tipoAlmacenamiento = "HDD"
    }
}