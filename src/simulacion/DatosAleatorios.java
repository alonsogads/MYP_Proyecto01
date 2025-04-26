package simulacion;

import java.util.*;
import modelo.Sucursal;

/**
 * Clase auxiliar que proporciona metodos estaticos para generar datos aleatorios.
 * Estos datos son utilizados por la clase ClienteSimulado para construir pedidos ficticios.
 * Contiene constantes y metodos estaticos.
 */
public class DatosAleatorios {

    private static final Random random = new Random();

    private static final List<String> modelosPrearmados = List.of("Estudiante", "Gamer", "Punto de Venta");
    
    private static final List<String> modelosCPU = List.of("IntelCorei3_13100", "IntelCorei5_13600K", "IntelCorei7_13700K", "IntelCorei9_13900K",
                                                           "AMDRyzen5_5600G", "AMDRyzen5_7600X", "AMDRyzen7_7700X", "AMDRyzen9_7950X3D");

    private static final List<String> modelosRAM = List.of("Adata8GB", "Adata16GB", "Adata32GB",
                                                           "Kingston8GB", "Kingston16GB", "Kingston32GB");

    private static final List<String> modelosPlacaBase = List.of("AsusROGMaximusZ790", "AsusTUFGamingB760",
                                                                  "MSIMEGGodlike", "MSIMAGB760");

    private static final List<String> modelosHDD = List.of("WesternDigitalBlue500GB", "WesternDigitalBlue1TB",
                                                           "SeagateBarracuda1TB", "SeagateBarracuda2TB");

    private static final List<String> modelosSSD = List.of("Kingston500GB", "Kingston1TB", "Kingston2TB", "Kingston4TB");

    private static final List<String> modelosFuente = List.of("EVGA800W", "EVGA1000W", "EVGA1500W",
                                                              "Corsair800W", "Corsair1200W", "Corsair1500W",
                                                              "XPG500W", "XPG700W", "XPG1000W");

    private static final List<String> modelosGPU = List.of("NVIDIA_GTX1660", "NVIDIA_RTX3060",
                                                           "NVIDIA_RTX4070", "NVIDIA_RTX4080", "NVIDIA_RTX4090");

    private static final List<String> modelosGabinete = List.of("NZXTH6FlowATX", "YeyianLancerATX");

    private static final List<String> modelosSoftware = List.of("Windows10", "Windows11", "Office365",
                                                                "Photoshop", "AutoCad", "TerminalWSL");

    /**
     * Retorna aleatoriamente el tipo de compra ("Personalizada" o "Prearmada").
     * 
     * @return Tipo de compra como cadena.
     */
    public static String obtenerTipoCompra() {
        return random.nextBoolean() ? "Personalizada" : "Prearmada";
    }

    /**
     * Devuelve un modelo prearmado aleatorio.
     * 
     * @return Nombre de modelo prearmado.
     */
    public static String obtenerModeloPrearmado() {
        return modelosPrearmados.get(random.nextInt(modelosPrearmados.size()));
    }

    /**
     * Genera un mapa con componentes seleccionados aleatoriamente.
     * 
     * @return Mapa de tipo componente a lista de modelos.
     */
    public static Map<String, List<String>> obtenerComponentesAleatorios() {
        Map<String, List<String>> componentes = new HashMap<>();

        componentes.put("CPU", seleccionarUno(modelosCPU));
        componentes.put("RAM", seleccionarVarios(modelosRAM, 1 + random.nextInt(4)));
        componentes.put("PlacaBase", seleccionarUno(modelosPlacaBase));
        componentes.put("HDD", seleccionarVarios(modelosHDD, 1 + random.nextInt(4)));
        componentes.put("SSD", seleccionarVarios(modelosSSD, 1 + random.nextInt(4)));
        componentes.put("Fuente", seleccionarUno(modelosFuente));
        componentes.put("GPU", seleccionarUno(modelosGPU));
        componentes.put("Gabinete", seleccionarUno(modelosGabinete));
        return componentes;
    }

    /**
     * Devuelve una lista aleatoria de programas de software (sin repetir).
     * 
     * @return Lista de nombres de software seleccionados.
     */
    public static List<String> obtenerSoftwareAleatorio() {
        List<String> copia = new ArrayList<>(modelosSoftware);
        Collections.shuffle(copia);
        int cantidad = random.nextInt(copia.size() + 1);
        return new ArrayList<>(copia.subList(0, cantidad));
    }

    /**
     * Elige una sucursal aleatoriamente de la lista disponible.
     * 
     * @param sucursales Lista de instancias de sucursales concretas.
     * @return Una sucursal aleatoria.
     */
    public static Sucursal obtenerSucursalAleatoria(List<Sucursal> sucursales) {
        return sucursales.get(random.nextInt(sucursales.size()));
    }

    // Metodos auxiliares interno para seleccionar un elemento de la lista
    private static List<String> seleccionarUno(List<String> lista) {
        String modelo = lista.get(random.nextInt(lista.size()));
        List<String> resultado = new ArrayList<>();
        resultado.add(modelo);
        return lista;
    }

    // Metodo auxiliar interno para seleccionar uno o mas elementos de la lista
    private static List<String> seleccionarVarios(List<String> lista, int cantidad) {
        List<String> copia = new ArrayList<>(lista);
        Collections.shuffle(copia);
        return new ArrayList<>(copia.subList(0, Math.min(cantidad, copia.size())));
    }
}
