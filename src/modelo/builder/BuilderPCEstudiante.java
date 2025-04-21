package modelo.builder;

import modelo.fabricaabstracta.DirectorFabrica;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase contructora que ensambla una PC prearmada con componentes pensados para el modelo "Estudiante". 
 * Utiliza {@code DirectorFabrica} para construir los componentes establecidos para este modelo.
 * 
 * Es una clase 'BuilderConcreto' del patron Builder.
 */
public class BuilderPCEstudiante extends BuilderPC {
    
    /**
     * Agrega un CPU especifico al mapa de componentes de la PC.
     */
    @Override
    public void agregarCPU() {
        Object cpu = DirectorFabrica.nuevoComponente("CPU", "IntelCorei5_13600K");
        List<Object> lista = new ArrayList<>();
        lista.add(cpu);
        componentes.put("CPU",lista);
    }

    /**
     * Agrega una RAM especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarRAM() {
        Object ram = DirectorFabrica.nuevoComponente("RAM", "Adata16GB");
        List<Object> lista = new ArrayList<>();
        lista.add(ram);
        componentes.put("RAM",lista);
    }

    /**
     * Agrega una placa base especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarPlacaBase() {
        Object placa = DirectorFabrica.nuevoComponente("PlacaBase", "MSIMEGGodlike");
        List<Object> lista = new ArrayList<>();
        lista.add(placa);
        componentes.put("PlacaBase",lista);
    }

    /**
     * Agrega una HDD especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarHDD() {
        Object hdd = DirectorFabrica.nuevoComponente("HDD", "WesternDigitalBlue500GB");
        List<Object> lista = new ArrayList<>();
        lista.add(hdd);
        componentes.put("HDD",lista);
    }

    /**
     * Agrega una SSD especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarSSD() {
        Object ssd = DirectorFabrica.nuevoComponente("SSD", "Kingston500GB");
        List<Object> lista = new ArrayList<>();
        lista.add(ssd);
        componentes.put("SSD",lista);
    }

    /**
     * Agrega una fuente de alimentacion especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarFuente() {
        Object fuente = DirectorFabrica.nuevoComponente("Fuente", "XPG500W");
        List<Object> lista = new ArrayList<>();
        lista.add(fuente);
        componentes.put("Fuente",lista);
    }

    /**
     * Agrega una GPU especifica al mapa de componentes de la PC.
     */
    @Override
    public void agregarGPU() {
        Object gpu = DirectorFabrica.nuevoComponente("GPU", "NVIDIA_GTX1660");
        List<Object> lista = new ArrayList<>();
        lista.add(gpu);
        componentes.put("GPU",lista);
    }

    /**
     * Agrega un gabinete especifico al mapa de componentes de la PC.
     */    
    @Override
    public void agregarGabinete() {
        Object gabinete = DirectorFabrica.nuevoComponente("Gabinete", "YeyianLancerATX");
        List<Object> lista = new ArrayList<>();
        lista.add(gabinete);
        componentes.put("Gabinete",lista);
    }
}
