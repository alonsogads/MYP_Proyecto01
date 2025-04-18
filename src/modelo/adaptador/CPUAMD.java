package modelo.adaptador;


/**
 * Interfaz que modela la estructura de una diferente clase de procesadores: las CPUs AMD.
 * Es utilizada para representar CPUs incompatibles directamente con la jerarquia de {@code CPU}.
 * Las clases que implementen esta interfaz, son los objetos que se van a adaptar mediante el
 * adaptador {@code CPUAMD_Adaptador}, para que puedan comportarse como un objeto de {@code CPU}.
 * 
 * Esta interfaz define los objetos 'Adaptado' del patron Adapter.
 */
public interface CPUAMD {
    /**
     * Devuelve el nombre del modelo de la CPU AMD.
     * @return Nombre del componente
     */
    public String getNombre();

    /**
     * Devuelve el precio del modelo de la CPU AMD.
     * @return Precio del componente
     */
    public float getPrecio();

    /**
     * Devuelve la marca del modelo de la CPU AMD.
     * @return Marca del componente
     */
    public String getMarca();

    /**
     * Devuelve el tipo de componente de la CPU AMD.
     * @return Tipo del componente
     */
    public String getTipoComponente();

    /**
     * Devuelve la cantidad de nucleos de la CPU AMD.
     * @return Cantidad de nucleos del CPU
     */
    public short getCantidadNucleos();
}
