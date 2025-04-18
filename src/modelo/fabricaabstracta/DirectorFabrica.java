package modelo.fabricaabstracta;

/**
 * Clase directora que centraliza la creacion de componentes individuales
 * usando las distintas fabricas concretas de AbstractFactory.
 * 
 * Proporciona un metodo unico para obtener instancias de cualquier componente
 * sin exponer al cliente la logica de seleccion de fabrica.
 * 
 * Todas las fabricas concretas son creadas internamente.
 * 
 * @author
 */
public class DirectorFabrica {
    private FabricaCPU fabricaCPU;
    private FabricaRAM fabricaRAM;
    private FabricaPlacaBase fabricaPlacaBase;
    private FabricaHDD fabricaHDD;
    private FabricaSSD fabricaSSD;
    private FabricaFuenteAlimentacion fabricaFuente;
    private FabricaGPU fabricaGPU;
    private FabricaGabinete fabricaGabinete;

    /**
     * Constructor que inicializa todas las fabricas concretas.
     */
    public DirectorFabrica() {
        fabricaCPU = new FabricaCPU();
        fabricaRAM = new FabricaRAM();
        fabricaPlacaBase = new FabricaPlacaBase();
        fabricaHDD = new FabricaHDD();
        fabricaSSD = new FabricaSSD();
        fabricaFuente = new FabricaFuenteAlimentacion();
        fabricaGPU = new FabricaGPU();
        fabricaGabinete = new FabricaGabinete();
    }

    /**
     * Metodo que delega la creacion de un componente a la fabrica correspondiente.
     * Devuelve un componente en funcion del tipo de componente y modelo deseado.
     * 
     * @param componente El tipo de componente (por ejemplo, "CPU", "RAM", "GPU")
     * @param tipo El identificador del modelo (por ejemplo, "IntelCorei5_13600K")
     * @return el objeto componente correspondiente o {@code null} si no es reconocido.
     */
    public Object nuevoComponente(String componente, String tipo) {
        switch (componente) {
            case "CPU":
                return fabricaCPU.getComponente(tipo);
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
