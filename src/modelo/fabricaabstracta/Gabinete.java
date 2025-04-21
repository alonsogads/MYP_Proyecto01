package modelo.fabricaabstracta;

/**
 * Clase abstracta que representa un componente tipo Gabinete.
 * Contiene los atributos comunes de todos los componentes y tambien cuenta con
 * los atributos especificos de los Gabinetes. Ademas implementa los metodos comunes de 
 * los Gabinetes concretos para evitar la duplicacion de codigo en cada Gabinete concreto.
 * 
 * Esta clase abstracta (en lugar de una interfaz) es una de las plantillas 'ProductoConcreto' del patron AbstractFactory.
 */
public abstract class Gabinete {
    
    /* Por convencion de AbstractFactory, no se cuenta con un metodo constructor explicito, por lo que
    inicializarremos los atributos con valores predeterminados para poder crear de manera segura
    nuevas instancias de las Gabinetes concretas. Las subclases estableceran sus valores correspondientes 
    en la implementacion del metodo {@code crearGabinete()}. */
    protected String nombre = "";
    protected float precio = 0.0f;
    protected String marca = "";
    protected String tipoComponente = "";

    /**
     * Retorna el nombre de la Gabinete.
     * @return Nombre del componente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio de la Gabinete.
     * @return Precio como valor decimal del componente
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca de la Gabinete.
     * @return Marca del componente
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, es decir "Gabinete".
     * @return Tipo del componente
     */
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Devuelve una descripcion completa del Gabinete.
     * @return Cadena que describe las caracteristicas del componente
     */
    @Override
    public String toString() {
        return tipoComponente + ": " + nombre + ". Marca " + marca + ". "
                + "\n\t*** Precio: $" + precio + " MXN";
    }

    /**
     * Metodo abstracto que cada subclase concreta debe implementar
     * para definir su configuracion interna.
     */
    public abstract void crearGabinete();

}