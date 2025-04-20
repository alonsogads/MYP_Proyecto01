package modelo.singleton;

import modelo.builder.*;
import modelo.decorador.*;
import modelo.fabricaabstracta.*;
import modelo.adaptador.*;
import modelo.Pedido;
import modelo.ComponenteIncompatibleException;
import java.util.List;
import java.util.Map;

/**
 * Clase que representa la sede central CDMX de MonosChinos MX, encargada de la linea de ensamble y distribucion.
 * Se encarga de ensamblar las PCs usando los directores de construccion y fabrica.
 * Maneja la verificacion de compatibilidad de CPU AMD y realiza su adaptacion si es necesario.
 * 
 * Esta es una clase 'Singleton' para garantizar una unica instancia (sede central).
 */
public class CentralCDMX {

    /**
     * Instancia unica (estatica) de la central CDMX. Debido a que el programa tiene la posibilidad de trabajar con hilos,
     * la declaramos volatil para establecer que es una variable compartida entre todos los hilos.
     * De esta forma, es posible que diferentes sucursales puedan realizar pedidos al mismo tiempo a una unica central CDMX.
     */
    private static volatile CentralCDMX instancia = null;


    /**
     * Constructor privado que asegura no instanciar objetos de esta clase externamente.
     */
    private CentralCDMX() {
    }

    /**
     * Metodo estatico para obtener la unica instancia de CentralCDMX.
     * Este metodo es sincronizado en caso de que dos o mas hilos accedan a este metodo a la vez.
     * @return La unica instancia sincronizada de CentralCDMX.
     */
    public static CentralCDMX getInstancia() {
        if (instancia == null) {
            synchronized(instancia.class){
                if(instancia == null){
                    instancia = new CentralCDMX();
                }
            }
        }
        return instancia;
    }

    /**
     * Ensambla una nueva PC completa a partir de los datos especificados en un pedido.
     * Este metodo realiza el proceso de construccion, verificacion y decoracion de la PC.
     * 
     * @param pedido Objeto que contiene toda la informacion necesaria para construir la PC.
     * @return Una instancia de PC ensamblada y lista para entrega.
     */
    public PC nuevaPC(Pedido pedido) {
        PC nuevaPC = null;
        nuevaPC = ensamblarPC(nuevaPC, pedido);
        verificarCPU(nuevaPC, pedido);
        nuevaPC = agregarSoftware(nuevaPC, pedido);
        return nuevaPC;
    }

    /**
     * Ensambla la PC base a partir de un pedido, utilizando el director Builder.
     * Dependiendo del tipo de pedido, se construye una PC personalizada o una prearmada.
     * 
     * @param pc Es el objeto PC sobre el cual se construyen sus componentes.
     * @param pedido Pedido con la configuracion que eligio el usuario.
     * @return Una instancia de PC ensamblada con los componentes seleccinados.
     */
    public PC ensamblarPC(PC pc, Pedido pedido){
        if (pedido.getTipo().equals("Personalizada")) {
            pc = DirectorBuilder.nuevaPCPersonalizada(pedido.getElecciones());
        } else if (pedido.getTipo().equals("Prearmada")) {
            pc = DirectorBuilder.nuevaPCPrearmada(pedido.getModelo());
        }

        return pc;
    }

    /**
     * Verifica si la PC contiene una CPU compatible.
     * Si no lo es, detecta un calor nulos para el componente CPU y 
     * se lanza una excepcion que permite adaptar el CPU a uno compatible.
     * 
     * @param pc Es el objeto PC sobre el cual se verifica y adapta el CPU incompatible.
     * @param pedido Pedido que contiene el modelo del CPU que eligio el usuario.
     */
    public void verificarCPU(PC pc, Pedido pedido){
        PCBase pcBase = (PCBase) pc;

        try { // Intenta acceder al CPU, si no encuentra uno, lanza la excepcion.
            pcBase.getCPU();
        } catch (ComponenteIncompatibleException e) {
            System.out.println("[Alerta de compatibilidad] " + e.getMessage());

            // Proceso de adaptacion de CPU incompatible
            CPUAMD cpuAMD;
            String modeloCPU = pedido.getElecciones().get("CPU").get(0);

            switch (modeloCPU) {
                case "AMDRyzen5_5600G":
                    cpuAMD = new AMDRyzen5_5600G();
                    break;
                case "AMDRyzen5_7600X":
                    cpuAMD = new AMDRyzen5_7600X();
                    break;
                case "AMDRyzen7_7700X":
                    cpuAMD = new AMDRyzen7_7700X();
                    break;
                case "AMDRyzen9_7950X3D":
                    cpuAMD = new AMDRyzen9_7950X3D();
                    break;
                default:
                    break;
            }

            CPUAMD_Adaptador cpuAdaptado = new CPUAMD_Adaptador(cpuAMD);
            pcBase.setCPU(cpuAdaptado);
        }
    }

    /**
     * Agrega software adicional a una PC usando el patron Decorator.
     * Cada entrada en la lista representa un software que se aplicara como un decorador.
     * 
     * @param pc La PC a la que se le agregaran los programas.
     * @param pedido Pedido que contiene el software seleccionado para agregar a la PC.
     * @return Una instancia de PC con el software elegido por el usuario.
     */
    public PC agregarSoftware(PC pc, Pedido pedido){
        List<String> listaSoftware = pedido.getSoftware();

        if(listaSoftware!=null && !listaSoftware.isEmpty()){
            for (String software : listaSoftware) {
                switch (software) {
                    case "Windows10":
                        pc = new Windows10(pc);
                        break;
                    case "Windows11":
                        pc = new Windows11(pc);
                        break;
                    case "Office365":
                        pc = new Office365(pc);
                        break;
                    case "Photoshop":
                        pc = new Photoshop(pc);
                        break;
                    case "AutoCad":
                        pc = new AutoCad(pc);
                        break;
                    case "TerminalWSL":
                        pc = new TerminalWSL(pc);
                        break;
                    default:
                        break;
                }
            }
        }

        return pc;
    }

}
