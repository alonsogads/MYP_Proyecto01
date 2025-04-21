package modelo.fabricaabstracta;

/**
 * Clase que representa un Gabinete concreto, en particular, el modelo NZXTH6FlowATX.
 * Extiende la clase abstracta {@code Gabinete} y define su configuracion interna.
 * 
 * Esta es una de las clases 'ProductoConcreto' del patron AbstractFactory.
 */
public class NZXTH6FlowATX extends Gabinete {
    /**
     * Establece los valores propios del Gabinete tipo NZXTH6FlowATX.
     */
    @Override
    public void crearGabinete() {
        nombre = "NZXT H6 Flow ATX";
        marca = "NZXT";
        precio = 4000.0f;
        tipoComponente = "Gabinete";
    }
}