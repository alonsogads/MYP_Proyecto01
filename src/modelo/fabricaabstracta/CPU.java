package modelo.fabricaabstracta;

/**
 * Clase abstracta que representa un componente tipo CPU.
 * Contiene los atributos comunes de todos los componentes y tambien cuenta con
 * los atributos especificos de las CPUs. Ademas implementa los metodos comunes de 
 * los CPUs concretos para evitar la duplicacion de codigo en cada CPU concreto.
 * 
 * Esta clase abstracta (en lugar de una interfaz) es una de las plantillas 'ProductoConcreto' del patron AbstractFactory.
 */
public abstract class CPU {
    
    /* Por convencion de AbstractFactory, no se cuenta con un metodo constructor explicito, por lo que
    inicializarremos los atributos con valores predeterminados para poder crear de manera segura
    nuevas instancias de las CPUs concretas. Las subclases estableceran sus valores correspondientes 
    en la implementacion del metodo {@code crearCPU()}. */
    protected String nombre = "";
    protected float precio = 0.0f;
    protected String marca = "";
    protected String tipoComponente = "";
    protected short cantidadNucleos = 0; // Atributo especifico de las CPUs

    /**
     * Retorna el nombre de la CPU.
     * @return Nombre del componente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio de la CPU.
     * @return Precio como valor decimal del componente
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca de la CPU.
     * @return Marca del componente
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, es decir "CPU".
     * @return Tipo del componente
     */
    public String getTipoComponente() {
        return tipoComponente;
    }


    /**
     * Retorna la cantidad de nucleos de la CPU.
     * @return Cantidad de nucleos del CPU
     */
    public short getCantidadNucleos() {
        return cantidadNucleos;
    }

    /**
     * Devuelve una descripcion completa de la CPU.
     * @return Cadena que describe las caracteristicas del componente
     */
    @Override
    public String toString() {
        return tipoComponente + ": " + nombre + ". Marca " + marca + ". " + cantidadNucleos + " nucleos."
                + "\n*** Precio: $" + precio + " MXN";
    }

    /**
     * Metodo abstracto que cada subclase concreta debe implementar
     * para definir su configuracion interna.
     */
    public abstract void crearCPU();

}
