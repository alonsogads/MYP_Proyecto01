package modelo.fabricaabstracta;

/**
 * Clase abstracta que representa un componente tipo GPU.
 * Contiene los atributos comunes de todos los componentes y tambien cuenta con
 * los atributos especificos de las GPUs. Ademas implementa los metodos comunes de 
 * los GPUs concretos para evitar la duplicacion de codigo en cada CPU concreto.
 * 
 * Esta clase abstracta (en lugar de una interfaz) es una de las plantillas 'ProductoConcreto' del patron AbstractFactory.
 */
public abstract class GPU {
    
    /* Por convencion de AbstractFactory, no se cuenta con un metodo constructor explicito, por lo que
    inicializarremos los atributos con valores predeterminados para poder crear de manera segura
    nuevas instancias de las GPUs concretas. Las subclases estableceran sus valores correspondientes 
    en la implementacion del metodo {@code crearGPU()}. */
    protected String nombre = "";
    protected float precio = 0.0f;
    protected String marca = "";
    protected String tipoComponente = "";
    protected String tipoMemoriaGPU = "";

    /**
     * Retorna el nombre de la GPU.
     * @return Nombre del componente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el precio de la GPU.
     * @return Precio como valor decimal del componente
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Retorna la marca de la GPU.
     * @return Marca del componente
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el tipo de componente, es decir "GPU".
     * @return Tipo del componente
     */
    public String getTipoComponente() {
        return tipoComponente;
    }


    /**
     * Retorna el tipo de memoria de la GPU
     * @return Tipo de memoria de la GPU
     */
    public String getTipoMemoriaGPU() {
        return tipoMemoriaGPU;
    }

    /**
     * Devuelve una descripcion completa de la CPU.
     * @return Cadena que describe las caracteristicas del componente
     */
    @Override
    public String toString() {
        return tipoComponente + ": " + nombre + ". Marca " + marca + ". " + tipoMemoriaGPU + " el tipo de memoria de la GPU."
                + "\n\t*** Precio: $" + precio + " MXN";
    }

    /**
     * Metodo abstracto que cada subclase concreta debe implementar
     * para definir su configuracion interna.
     */
    public abstract void crearGPU();

}