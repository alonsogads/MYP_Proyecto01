package modelo.decorador;

import modelo.fabricaabstracta.*;
import modelo.ComponenteIncompatibleException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/**
 * Clase que representa una PC ensamblada a partir de sus componentes individuales.
 * Implementa la interfaz {@code PC} definiendo su costo e informacion descriptiva.
 * 
 * Es la clase 'ComponenteConcreto' del patron Decorator.
 * Es la clase 'Producto' del patron Builder.
 */
public class PCBase implements PC {

    private Map<String, List<Object>> componentes;

    /**
     * Constructor que recibe el mapa de componentes de la PC.
     * 
     * @param componentes Mapa con clave tipo de componente y lista de objetos (modelos del componente).
     */
    public PCBase(Map<String, List<Object>> componentes) {
        this.componentes = componentes;
    }

    /**
     * Devuelve un modelo concreto de la CPU obtenido desde el mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC esta limitada a un solo componente CPU.
     * @return El modelo del componente {@code CPU}.
     */
    public CPU getCPU() throws ComponenteIncompatibleException {
        List<Object> listaCPU = componentes.get("CPU");

        // Si el modelo elegido del CPU no es un modelo compatible, listaCPU contiene un null ya que no obtuvo un componente compatible.
        // Por lo tanto, se lanzara la excepcion personalizada.
        if(listaCPU.contains(null)){
            throw new ComponenteIncompatibleException("Modelo de CPU incompatible. Se procede a realizar una adaptacion manual.");
        }

        return (CPU) componentes.get("CPU").get(0);
    }

    /**
     * Devuelve una lista de modelos concretos de la RAM obtenido desde el mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC puede tener uno o mas componentes RAM.
     * @return Una lista de modelos del componente {@code RAM}.
     */
    public List<RAM> getRAM(){
        List<Object> listaObjetos = componentes.get("RAM");
        List<RAM> listaRAM = new ArrayList<>();
        if (listaObjetos!= null && !listaObjetos.isEmpty()) {
            for (Object objeto : listaObjetos) {
                listaRAM.add((RAM) objeto); // Casteamos correctamente el componente.
            }
        }
        return listaRAM;
    }

    /**
     * Devuelve un modelo concreto de la placa base obtenido desde el mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC esta limitada a un solo componente placa base.
     * @return El modelo del componente {@code PlacaBase}.
     */
    public PlacaBase getPlacaBase() {
        return (PlacaBase) componentes.get("PlacaBase").get(0);
    }

    /**
     * Devuelve una lista de modelos concretos de la HDD obtenido desde el mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC puede tener uno o mas componentes HDD.
     * @return Una lista de modelos del componente {@code HDD}.
     */
    public List<HDD> getHDD() {
        List<Object> listaObjetos = componentes.get("HDD");
        List<HDD> listaHDD = new ArrayList<>();
        if (listaObjetos != null && !listaObjetos.isEmpty()) {
            for (Object objeto : listaObjetos) {
                listaHDD.add((HDD) objeto);
            }
        }
        return listaHDD;
    }

    /**
     * Devuelve una lista de modelos concretos de la SSD obtenido desde el mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC puede tener uno o mas componentes SSD.
     * @return Una lista de modelos del componente {@code SSD}.
     */
    public List<SSD> getSSD() {
        List<Object> listaObjetos = componentes.get("SSD");
        List<SSD> listaSSD = new ArrayList<>();
        if (listaObjetos != null && !listaObjetos.isEmpty()) {
            for (Object objeto : listaObjetos) {
                listaSSD.add((SSD) objeto);
            }
        }
        return listaSSD;
    }

    /**
     * Devuelve un modelo concreto de la fuente de alimentacion obtenido desde el mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC esta limitada a un solo componente fuente.
     * @return El modelo del componente {@code Fuente}.
     */
    public FuenteAlimentacion getFuente() {
        return (FuenteAlimentacion) componentes.get("Fuente").get(0);
    }
    
    /**
     * Devuelve un modelo concreto de la GPU obtenido desde el mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC esta limitada a un solo componente GPU.
     * @return El modelo del componente {@code GPU}.
     */
    public GPU getGPU() {
        return (GPU) componentes.get("GPU").get(0);
    }

    /**
     * Devuelve un modelo concreto del gabinete obtenido desde el mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC esta limitada a un solo componente gabinete.
     * @return El modelo del componente {@code Gabinete}.
     */
    public Gabinete getGabinete() {
        return (Gabinete) componentes.get("Gabinete").get(0);
    }

    /**
     * Agrega o reemplaza un modelo conreto de CPU al mapa de componentes. 
     * Util para agregar posteriormente una CPU incompatible despues del proceso de adaptacion.
     * @param nuevoCPU Un {@code CPU} concreto que se agrega a la lista de modelos del mismo componente.
     */
    public void setCPU(CPU nuevoCPU) {
        componentes.put("CPU", List.of((Object) nuevoCPU));
    }
    
    /**
     * Retorna el costo total de la PC sumando el precio de todos sus componentes.
     * 
     * @return El costo total como valor decimal.
     */
    @Override
    public float obtenerCosto() {
        float costo = this.getCPU().getPrecio() +
                      this.getPlacaBase().getPrecio() +
                      this.getFuente().getPrecio() +
                      this.getGPU().getPrecio() +
                      this.getGabinete().getPrecio();

        for (RAM ram : this.getRAM()) {
            costo += ram.getPrecio();
        }

        for (HDD hdd : this.getHDD()) {
            costo += hdd.getPrecio();
        }

        for (SSD ssd : this.getSSD()) {
            costo += ssd.getPrecio();
        }

        return costo;
    }

    /**
     * Devuelve una descripcion detallada de todos los componentes de la PC.
     * 
     * @return Cadena con la descripcion de componentes y precios de la PC.
     */
    @Override
    public String toString() {
        StringBuilder detalles = new StringBuilder("========== Descripcion de la PC ==========");

        detalles.append("\n\n\t>> ").append(this.getCPU().toString());
        
        detalles.append("\n");
        for(RAM ram : this.getRAM()){
            detalles.append("\n\t>> ").append(ram.toString());
        }

        detalles.append("\n\n\t>> ").append(this.getPlacaBase().toString());

        detalles.append("\n")
        for(HDD hdd : this.getHDD()){
            detalles.append("\n\t>> ").append(hdd.toString());
        }

        detalles.append("\n")
        for(SSD ssd : this.getSSD()){
            detalles.append("\n\t>> ").append(ssd.toString());
        }

        detalles.append("\n\n\t>> ").append(this.getFuente().toString());
        detalles.append("\n\n\t>> ").append(this.getGPU().toString());
        detalles.append("\n\n\t>> ").append(this.getGabinete().toString());

        detalles.append("\n\n\t---------- *** Costo PC: $").append(this.obtenerCosto()).append(" MXN.");

        return detalles.toString();
    }
}