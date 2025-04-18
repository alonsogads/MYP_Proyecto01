package modelo.adaptador;

import modelo.fabricaabstracta.CPU;

/**
 * Clase que funciona como adaptador, permitiendo usar un objeto de tipo {@code CPUAMD}
 * como si fuera un objeto del tipo {@code CPU}. Implementa los metodos abstractos de
 * {@code CPUAMD}. Adicionalmente, le indica al usuario que el componente fue adaptado
 * con una nueva implementacion del metodo {@code toString()}.
 * 
 * Esta es la clase 'Adaptador' del patron Adapter.
 * Por convencion de Adapter, la clase adaptador implementa la interfaz a la que el objeto 
 * se va a adaptar, pero al tratarse la clase {@code CPU} de una clase abstracta, simplemente
 * extendemos dicha clase, manteniendo el objetivo de Adapter.
 */
public class CPUAMD_Adaptador extends CPU {

    private CPUAMD cpuAMD; // CPU AMD (incompatible a adaptar)

    /**
     * Constructor que recibe un objeto {@code CPUAMD} para adaptar a {@code CPU}
     * 
     * @param cpuAMD El objeto de tipo AMD a ser adaptado.
     */
    public CPUAMD_Adaptador(CPUAMD cpuAMD) {
        this.cpuAMD = cpuAMD;
    }

    /**
     * Adapta los datos del objeto {@code CPUAMD} mediante sus metodos para establecer 
     * los atributos definidos en {@code CPU}. De esta manera se implementam el unico 
     * metodo abstracto de la clase {@code CPU}.
     */
    @Override
    public void crearCPU() {
        this.nombre = cpuAMD.getNombre();
        this.precio = cpuAMD.getPrecio();
        this.marca = cpuAMD.getMarca();
        this.tipoComponente = cpuAMD.getTipoComponente();
        this.cantidadNucleos = cpuAMD.getCantidadNucleos();
    }

    /**
     * Devuelve una nueva cadena que describe las caracteristicas del componente, en
     * la que se le informa al usuario que el componente fue adaptado.
     * 
     * @return Cadena que describe las caracteristicas del componente adaptado
     */
    @Override
    public String toString() {
        return tipoComponente + " (Adaptado): " + nombre + ". Marca " + marca + ". " + cantidadNucleos 
                + " nucleos." + "\n*** Precio: $" + precio + " MXN";
    }

}