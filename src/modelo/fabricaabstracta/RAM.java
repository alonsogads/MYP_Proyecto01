package modelo.fabricaabstracta;

/**
 * Clase abstracta que representa un componente tipo RAM.
 * Contiene los atributos comunes de todos los componentes y tambien cuenta con
 * los atributos especificos de las RAMs. Ademas implementa los metodos comunes de 
 * las RAMs concretos para evitar la duplicacion de codigo en cada RAM concreto.
 * 
 * Esta clase abstracta (en lugar de una interfaz) es una de las plantillas 'ProductoConcreto' del patron AbstractFactory.
 */
public abstract class RAM {
    
    /* Por convencion de AbstractFactory, no se cuenta con un metodo constructor explicito, por lo que
    inicializarremos los atributos con valores predeterminados para poder crear de manera segura
    nuevas instancias de las RAMs concretas. Las subclases estableceran sus valores correspondientes 
    en la implementacion del metodo {@code crearRAM()}. */
    protected String nombre = "";
    protected float precio = 0.0f;
    protected String marca = "";
    protected String tipoComponente = "";
    protected short capacidad = 0; // Atributo especifico de las CPUs

    /**
     * Retorna el nombre de la RAM.
     * @return Nombre del componente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio de la RAM.
     * @return Precio como valor decimal del componente
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca de la RAM.
     * @return Marca del componente
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, es decir RAM.
     * @return Tipo del componente
     */
    public String getTipoComponente() {
        return tipoComponente;
    }


    /**
     * Retorna la cantidad de nucleos de la RAM.
     * @return Cantidad de nucleos del RAM
     */
    public short getCapacidad() {
        return capacidad;
    }

    /**
     * Devuelve una descripcion completa de la CPU.
     * @return Cadena que describe las caracteristicas del componente
     */
    @Override
    public String toString() {
        return tipoComponente + ": " + nombre + ". Marca " + marca + ". " + capacidad + " capacidad."
                + "\n\t*** Precio: $" + precio + " MXN";
    }

    /**
     * Metodo abstracto que cada subclase concreta debe implementar
     * para definir su configuracion interna.
     */
    public abstract void crearRAM();

}
