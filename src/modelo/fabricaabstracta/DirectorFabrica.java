package modelo.fabricaabstracta;

import modelo.ComponenteIncompatibleException;

/**
 * Clase directora que centraliza la creacion de componentes individuales
 * usando las distintas fabricas concretas de AbstractFactory.
 * 
 * Proporciona un metodo unico para obtener instancias de cualquier componente
 * sin exponer al cliente la logica de seleccion de fabrica.
 * 
 * Los atributos y metodo son estaticos, debido a que solo es necesario una instancia
 * de cada fabrica para todo el programa, evitando inicializar cada fabrica cada vez
 * que el programa necesite crear constantemente nuevas fabricas para usar el metodo.
 */
public class DirectorFabrica {

    // Se inicializan todas las fabricas y se declaran estaticas
    private static FabricaCPU fabricaCPU = new FabricaCPU();
    private static FabricaRAM fabricaRAM = new FabricaRAM();
    private static FabricaPlacaBase fabricaPlacaBase = new FabricaPlacaBase();
    private static FabricaHDD fabricaHDD = new FabricaHDD();
    private static FabricaSSD fabricaSSD = new FabricaSSD();
    private static FabricaFuenteAlimentacion fabricaFuente = new FabricaFuenteAlimentacion();
    private static FabricaGPU fabricaGPU = new FabricaGPU();
    private static FabricaGabinete fabricaGabinete = new FabricaGabinete();

    /**
     * Metodo estatico que delega la creacion de un componente a la fabrica correspondiente.
     * Devuelve un componente en funcion del tipo de componente y modelo deseado.
     * 
     * @param componente El tipo de componente (por ejemplo, "CPU", "RAM", "GPU")
     * @param tipo El identificador del modelo (por ejemplo, "IntelCorei5_13600K")
     * @return el objeto componente correspondiente o {@code null} si no es reconocido.
     */
    public static Object nuevoComponente(String componente, String tipo) {
        switch (componente) {
            case "CPU":
                Object cpu = fabricaCPU.getComponente(tipo); // Obtenemos el CPU concreto

                // Si el CPU es un modelo AMD, no adaptamos aun, en su lugar lanzamos una excepcion.
                //  Por lo tanto, simularemos la "adaptacion" en {@code CentralCDMX}.
                if (cpu instanceof modelo.adaptador.CPUAMD) {
                    throw new ComponenteIncompatibleException(
                        "CPU AMD detectada: \"" + tipo + "\" requiere una adptacion.");
                }

                return cpu;
            case "RAM":
                return fabricaRAM.getComponente(tipo);
            case "PlacaBase":
                return fabricaPlacaBase.getComponente(tipo);
            case "HDD":
                return fabricaHDD.getComponente(tipo);
            case "SSD":
                return fabricaSSD.getComponente(tipo);
            case "Fuente":
                return fabricaFuente.getComponente(tipo);
            case "GPU":
                return fabricaGPU.getComponente(tipo);
            case "Gabinete":
                return fabricaGabinete.getComponente(tipo);
            default:
                return null;
        }
    }

}
