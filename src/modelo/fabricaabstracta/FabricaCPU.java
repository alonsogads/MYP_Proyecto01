package modelo.fabricaabstracta;

/**
 * Clase para la creacion de objetos (componentes) de tipo CPU.
 * Implementa el metodo {@code getComponente} definido en {@code FabricaAbstractaComponente}.
 * 
 * Esta es una clase 'FabricaConcreta' del patron AbstractFactory.
 */
public class FabricaCPU extends FabricaAbstractaComponente{
    /**
     * Devuelve una instancia concreta de una CPU en funcion del tipo pasado como parametro.
     * 
     * @param tipo Nombre del modelo de CPU solicitado (por ejemplo, "IntelCorei5_13600K").
     * @return Una instancia del componente correspondiente o {@code null} si no coincide.
     */
    @Override
    public Object getComponente(String tipo) {
        switch (tipo) {
            case "IntelCorei3_13100":
                return new IntelCorei3_13100();
                break;
            case "IntelCorei5_13600K":
                return new IntelCorei5_13600K();
                break;
            case "IntelCorei7_13700K":
                return new IntelCorei7_13700K();
                break;
            case "IntelCorei9_13900K":
                return new IntelCorei9_13900K();
                break;
            default:
                return null;
        }
    }
}
