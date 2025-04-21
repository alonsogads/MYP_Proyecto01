package modelo.fabricaabstracta;

/**
 * Clase para la creacion de objetos (componentes) de tipo CPU.
 * Implementa el metodo {@code getComponente} definido en {@code FabricaAbstractaComponente}.
 * 
 * Esta es una clase 'FabricaConcreta' del patron AbstractFactory.
 */
public class FabricaCPU extends FabricaAbstractaComponente{
    /**
     * Devuelve un objeto CPU en funcion del tipo pasado como parametro.
     * 
     * @param tipo Nombre del modelo de CPU solicitado (por ejemplo, "IntelCorei5_13600K").
     * @return Una instancia {@code Object} del componente concreto o {@code null} si no coincide.
     */
    @Override
    public Object getComponente(String tipo) {

        CPU cpu;

        switch (tipo) {
            case "IntelCorei3_13100":
                cpu = new IntelCorei3_13100();
                cpu.crearCPU();
                return cpu;
            case "IntelCorei5_13600K":
                cpu = new IntelCorei5_13600K();
                cpu.crearCPU();
                return cpu;
            case "IntelCorei7_13700K":
                cpu = new IntelCorei7_13700K();
                cpu.crearCPU();
                return cpu;
            case "IntelCorei9_13900K":
                cpu = new IntelCorei9_13900K();
                cpu.crearCPU();
                return cpu;
            default:
                return null;
        }
    }
}
