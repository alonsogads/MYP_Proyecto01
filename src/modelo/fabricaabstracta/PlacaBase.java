package modelo.fabricaabstracta;

/**
 * Clase abstracta que representa un componente tipo Placa Base.
 * Contiene los atributos comunes de todos los componentes y tambien cuenta con
 * los atributos especificos de la Placa Base. Ademas implementa los metodos comunes de 
 * las Placas Base concretos para evitar la duplicacion de codigo en cada Placa Base concreto.
 * 
 * Esta clase abstracta (en lugar de una interfaz) es una de las plantillas 'ProductoConcreto' del patron AbstractFactory.
 */
public abstract class PlacaBase {
    
    /* Por convencion de AbstractFactory, no se cuenta con un metodo constructor explicito, por lo que
    inicializarremos los atributos con valores predeterminados para poder crear de manera segura
    nuevas instancias de las RAMs concretas. Las subclases estableceran sus valores correspondientes 
    en la implementacion del metodo {@code crearPlacaBase()}. */
    protected String nombre = "";
    protected float precio = 0.0f;
    protected String marca = "";
    protected String tipoComponente = "";
    protected String chipset = ""; 

    /**
     * Retorna el nombre de la Placa Base.
     * @return Nombre del componente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio de la Placa Base.
     * @return Precio como valor decimal del componente
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca de la Placa Base.
     * @return Marca del componente
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, es decir Placa Base.
     * @return Tipo del componente
     */
    public String getTipoComponente() {
        return tipoComponente;
    }


    /**
     * Retorna el chipset de la Placa Base.
     * @return El chipset del Placa Base
     */
    public String getChipset() {
        return chipset;
    }

    /**
     * Devuelve una descripcion completa de la Placa Base.
     * @return Cadena que describe las caracteristicas del componente
     */
    @Override
    public String toString() {
        return tipoComponente + ": " + nombre + ". Marca " + marca + ". " + chipset + " chipset."
                + "\n\t*** Precio: $" + precio + " MXN";
    }

    /**
     * Metodo abstracto que cada subclase concreta debe implementar
     * para definir su configuracion interna.
     */
    public abstract void crearPlacaBase();

}
