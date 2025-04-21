package modelo.fabricaabstracta;

/**
 * Clase abstracta que representa un componente tipo HDD.
 * Contiene los atributos comunes de todos los componentes y tambien cuenta con
 * los atributos especificos de los HDDs. Ademas implementa los metodos comunes de 
 * los HDDs concretos para evitar la duplicacion de codigo en cada HDD concreto.
 * 
 * Esta clase abstracta (en lugar de una interfaz) es una de las plantillas 'ProductoConcreto' del patron AbstractFactory.
 */
public abstract class HDD {
    
    /* Por convencion de AbstractFactory, no se cuenta con un metodo constructor explicito, por lo que
    inicializarremos los atributos con valores predeterminados para poder crear de manera segura
    nuevas instancias de los HDDs concretas. Las subclases estableceran sus valores correspondientes 
    en la implementacion del metodo {@code crearHDD()}. */
    protected String nombre = "";
    protected float precio = 0.0f;
    protected String marca = "";
    protected String tipoComponente = "";
    protected String capacidadAlmacenamiento = "";
    protected String tipoAlmacenamiento = "";

    /**
     * Retorna el nombre del HDD.
     * @return Nombre del componente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio del HDD.
     * @return Precio como valor decimal del componente
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca del HDD.
     * @return Marca del componente
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, es decir HDD.
     * @return Tipo del componente
     */
    public String getTipoComponente() {
        return tipoComponente;
    }


    /**
     * Retorna la capacidad del almacenamiento.
     * @return Capacidad del HDD
     */
    public String getCapacidadAlmacenamiento(){
        return capacidadAlmacenamiento;
    }

    /**
     * Retorna el tipo del almacenamiento.
     * @return Tipo del HDD
     */
    public String getTipoAlmacenamiento(){
        return tipoAlmacenamiento;
    }

    /**
     * Devuelve una descripcion completa de la HDD.
     * @return Cadena que describe las caracteristicas del componente
     */
    @Override
    public String toString() {
        return tipoComponente + ": " + nombre + ". Marca " + marca + ". " + capacidadAlmacenamiento + " capacidad de almacenamiento" + tipoAlmacenamiento + " tipo del almacenamiento."
                + "\n\t*** Precio: $" + precio + " MXN";
    }

    /**
     * Metodo abstracto que cada subclase concreta debe implementar
     * para definir su configuracion interna.
     */
    public abstract void crearHDD();

}
