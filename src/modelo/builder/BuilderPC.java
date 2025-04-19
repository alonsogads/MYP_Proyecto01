package modelo.builder;

import modelo.decorador.PCBase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Clase abstracta que define la estructura general para ensamblar una PC paso a paso.
 * Cada subclase concreta debera implementar la construccion de los diferentes componentes.
 * 
 * Esta es la clase plantilla 'Builder' del mismo patron.
 */
public abstract class BuilderPC {

    // Mapa con los componentes para construir la PC. Se inicializa con un HashMap vacio.
    protected Map<String, List<Object>> componentes = new HashMap<>();
  
    /**
     * Agrega el CPU al mapa de componentes de la PC.
     */
    public abstract void agregarCPU();

    /**
     * Agrega una o mas memorias RAM al mapa de componentes de la PC.
     */
    public abstract void agregarRAM();

    /**
     * Agrega la placa base al mapa de componentes de la PC.
     */
    public abstract void agregarPlacaBase();

    /**
     * Agrega uno o mas HDD al mapa de componentes de la PC.
     */
    public abstract void agregarHDD();

    /**
     * Agrega uno o mas SSD al mapa de componentes de la PC.
     */
    public abstract void agregarSSD();

    /**
     * Agrega la fuente de alimentacion al mapa de componentes de la PC.
     */
    public abstract void agregarFuente();

    /**
     * Agrega la GPU al mapa de componentes de la PC.
     */
    public abstract void agregarGPU();


    /**
     * Agrega el gabinete al mapa de componentes de la PC.
     */
    public abstract void agregarGabinete();

    /**
     * Retorna un objeto {@code PCBase} que representa la PC ensamblada a partir de la 
     * de todos los componentes en el mapa obtenidos por los demas metodos de la clase.
     * 
     * @return Una instancia de {@code PCBase} construida con los componentes agregados.
     */
    public PCBase montarPC() {
        agregarCPU();
        agregarRAM();
        agregarPlacaBase();
        agregarHDD();
        agregarSSD();
        agregarFuente();
        agregarGPU();
        agregarGabinete();
        return new PCBase(componentes);
    }
}
