package modelo.builder;

import modelo.fabricaabstracta.DirectorFabrica;
import java.util.List;

/**
 * Clase contructora que ensambla una PC prearmada con componentes pensados para el modelo "Punto de Venta". 
 * Utiliza {@code DirectorFabrica} para construir los componentes establecidos para este modelo.
 * 
 * Es una clase 'BuilderConcreto' del patron Builder.
 */
public class BuilderPCPuntoVenta extends BuilderPC {

    /**
     * Agrega un CPU especifico al mapa de componentes de la PC.
     */
    @Override
    public void agregarCPU() {
        Object cpu = DirectorFabrica.nuevoComponente("CPU", "AMDRyzen5_5600G");
        componentes.put("CPU", List.of(cpu));
    }

    /**
     * Agrega una RAM especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarRAM() {
        Object ram = DirectorFabrica.nuevoComponente("RAM", "Adata8GB");
        componentes.put("RAM", List.of(ram));
    }

    /**
     * Agrega una placa base especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarPlacaBase() {
        Object placa = DirectorFabrica.nuevoComponente("PlacaBase", "AsusTUFGamingB760");
        componentes.put("PlacaBase", List.of(placa));
    }

    /**
     * Agrega una HDD especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarHDD() {
        Object hdd = DirectorFabrica.nuevoComponente("HDD", "WesternDigitalBlue1TB");
        componentes.put("HDD", List.of(hdd));
    }

    /**
     * Agrega una SSD especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarSSD() {
        Object ssd = DirectorFabrica.nuevoComponente("SSD", "Kingston500GB");
        componentes.put("SSD", List.of(ssd));
    }

    /**
     * Agrega una fuente de alimentacion especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarFuente() {
        Object fuente = DirectorFabrica.nuevoComponente("Fuente", "EVGA800W");
        componentes.put("Fuente", List.of(fuente));
    }

    /**
     * Agrega una GPU especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarGPU() {
        Object gpu = DirectorFabrica.nuevoComponente("GPU", "NVIDIA_GTX1660");
        componentes.put("GPU", List.of(gpu));
    }

    /**
     * Agrega un gabinete especifico al mapa de componentes de la PC.
     */    
    @Override
    public void agregarGabinete() {
        Object gabinete = DirectorFabrica.nuevoComponente("Gabinete", "YeyianLancerATX");
        componentes.put("Gabinete", List.of(gabinete));
    }
}
