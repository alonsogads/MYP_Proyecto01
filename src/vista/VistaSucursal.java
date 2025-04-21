package vista;

import modelo.Sucursal;
import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Clase que representa la vista de interaccion con el cliente desde una sucursal concreta.
 * Contiene metodos que exclusivamente muestran menus y capturan las entradas del usuario.
 * No dirige el flujo de compra, ni crea objetos complejos.
 * 
 * Esta clase es una 'vista' del patron MVC.
 */
public class VistaSucursal {

    private final Sucursal sucursal;
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Constructor que inicializa la vista con la sucursal correspondiente.
     * 
     * @param sucursal Sucursal concreta desde la que se realiza el pedido.
     */
    public VistaSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * Muestra un menu al cliente para elegir el tipo de compra.
     * 
     * @return "Personalizada" o "Prearmada" segun la seleccion del usuario.
     */
    public String solicitarTipoCompra() {
        while (true) {
            System.out.println("\n========== Tipo de compra ==========");
            System.out.println("Selecciona el tipo de PC:");
            System.out.println("1. Personalizada");
            System.out.println("2. Prearmada");
            System.out.print("Selecciona una opcion: ");
            
            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1: return "Personalizada";
                case 2: return "Prearmada";
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }
    }

    /**
     * Muestra un menu al cliente con los modelos prearmados disponibles.
     * 
     * @return Cadena con el nombre del modelo seleccionado.
     */
    public String solicitarModeloPrearmado() {
        while (true) {
            System.out.println("\n========== Modelos de PC ==========");
            System.out.println("Selecciona el modelo prearmado de tu PC:");
            System.out.println("1. Estudiante");
            System.out.println("2. Gamer");
            System.out.println("3. Punto de Venta");
            System.out.print("\n\tEleccion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1: return "Estudiante";
                case 2: return "Gamer";
                case 3: return "Punto de Venta";
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }
    }

    /**
     * Solicita al cliente seleccionar uno o mas modelos para cada tipo de componente.
     * Construye un mapa con la informacion recolectada.
     * 
     * @return Mapa con claves "CPU", "RAM", etc., con valores con listas de modelos seleccionados.
     */
    public Map<String, List<String>> solicitarComponentes() {
        Map<String, List<String>> eleccionesComponentes = new HashMap<>();

        eleccionesComponentes.put("CPU", List.of(this.solicitarCPU()));
        eleccionesComponentes.put("RAM", this.solicitarRAM());
        eleccionesComponentes.put("PlacaBase", List.of(this.solicitarPlacaBase()));
        eleccionesComponentes.put("HDD", this.solicitarHDD());
        eleccionesComponentes.put("SSD", this.solicitarSSD());
        eleccionesComponentes.put("Fuente", List.of(this.solicitarFuente()));
        eleccionesComponentes.put("GPU", List.of(this.solicitarGPU()));
        eleccionesComponentes.put("Gabinete", List.of(this.solicitarGabinete()));

        return eleccionesComponentes;
    }

    /**
     * Metodo auxiliar de {@code solicitarComponentes()}. Solicita al cliente elegir un modelo de CPU.
     * Solo se puede elegir un modelo.
     * 
     * @return Nombre del modelo seleccionado.
     */
    public String solicitarCPU() {
        while (true) {
            System.out.println("\n========== Modelos de CPU ==========");
            System.out.println("Selecciona el modelo tu CPU:");
            System.out.println("1. Intel Core i3-13100");
            System.out.println("2. Intel Core i5-13600K");
            System.out.println("3. Intel Core i7-13700K");
            System.out.println("4. Intel Core i9-13900K");
            System.out.println("5. AMD Ryzen 5 5600G");
            System.out.println("6. AMD Ryzen 5 7600X");
            System.out.println("7. AMD Ryzen 7 7700X");
            System.out.println("8. AMD Ryzen 9 7950X3D");
            System.out.print("\n\tEleccion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1: return "IntelCorei3_13100";
                case 2: return "IntelCorei5_13600K";
                case 3: return "IntelCorei7_13700K";
                case 4: return "IntelCorei9_13900K";
                case 5: return "AMDRyzen5_5600G";
                case 6: return "AMDRyzen5_7600X";
                case 7: return "AMDRyzen7_7700X";
                case 8: return "AMDRyzen9_7950X3D";
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }
    }

    /**
     * Metodo auxiliar de {@code solicitarComponentes()}. Solicita al cliente seleccionar uno o mas modelos de RAM.
     * El cliente puede elegir como minimo 1 modelo y como maximo hasta 4 modelos.
     * 
     * @return Lista con los modelos seleccionados.
     */
    public List<String> solicitarRAM() {
        List<String> modelosSeleccionados = new ArrayList<>();
        int cantidad = 0;

        while (cantidad < 4) {
            System.out.println("\n========== Modelos de RAM ==========");
            System.out.println("Selecciona el modelo de las memorias RAM. ¡Puedes elegir hasta 4!");
            System.out.println("1. Adata 8GB");
            System.out.println("2. Adata 16GB");
            System.out.println("3. Adata 32GB");
            System.out.println("4. Kingston 8GB");
            System.out.println("5. Kingston 16GB");
            System.out.println("6. Kingston 32GB");

            // Le muestra al usuario la opcion para finalizar, si ya ha seleccionado al menos un modelo.
            if(cantidad > 0){
                System.out.println("0. Finalizar seleccion");
            }
            System.out.print("\n\tEleccion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1: 
                    modelosSeleccionados.add("Adata8GB");
                    cantidad ++;
                    break;
                case 2: 
                    modelosSeleccionados.add("Adata16GB");
                    cantidad ++;
                    break;               
                case 3: 
                    modelosSeleccionados.add("Adata32GB");
                    cantidad ++;
                    break;
                case 4: 
                    modelosSeleccionados.add("Kingston8GB");
                    cantidad ++;
                    break;
                case 5: 
                    modelosSeleccionados.add("Kingston16GB");
                    cantidad ++;
                    break;
                case 6: 
                    modelosSeleccionados.add("Kingston32GB");
                    cantidad ++;
                    break;
                case 0: 
                    if (cantidad > 0){
                        // Si el usuario elige finalizar y el ciclo ya se ha ejecutado al menos una vez
                        // (es decir que el usuario eligio exitosamente al menos un modelo), devuelve la lista.
                        return modelosSeleccionados;
                    } else{
                        System.out.println("Debes seleccionar al menos un componente.");
                    }
                    break;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }
        return modelosSeleccionados;
    }

    /**
     * Metodo auxiliar de {@code solicitarComponentes()}. Solicita al cliente elegir un modelo de placa base (motherboard).
     * Solo se puede elegir un modelo.
     * 
     * @return Nombre del modelo seleccionado.
     */
    public String solicitarPlacaBase() {
        while (true) {
            System.out.println("\n========== Modelos de Placa Base ==========");
            System.out.println("Selecciona el modelo de tu motherboard:");
            System.out.println("1. ASUS ROG Maximus Z790 Hero");
            System.out.println("2. ASUS TUF Gaming B760-Plus WIFI D4");
            System.out.println("3. MSI MEG Godlike");
            System.out.println("4. MSI MAG B760 Tomahawk WIFI DDR4");
            System.out.print("\n\tEleccion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1: return "AsusROGMaximusZ790";
                case 2: return "AsusTUFGamingB760";
                case 3: return "MSIMEGGodlike";
                case 4: return "MSIMAGB760";
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }
    }

    /**
     * Metodo auxiliar de {@code solicitarComponentes()}. Solicita al cliente seleccionar uno o mas modelos de HDD.
     * El cliente puede elegir como minimo 1 modelo y como maximo hasta 4 modelos.
     * 
     * @return Lista con los modelos seleccionados.
     */
    public List<String> solicitarHDD() {
        List<String> modelosSeleccionados = new ArrayList<>();
        int cantidad = 0;

        while (cantidad < 4) {
            System.out.println("\n========== Modelos de HDD ==========");
            System.out.println("Selecciona el modelo de tus discos HDD. ¡Puedes elegir hasta 4!");
            System.out.println("1. Western Digital Blue 500GB");
            System.out.println("2. Western Digital Blue 1TB");
            System.out.println("3. Seagate Barracuda 1TB");
            System.out.println("4. Seagate Barracuda 2TB");

            if (cantidad > 0) {
                System.out.println("0. Finalizar seleccion");
            }

            System.out.print("\n\tEleccion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    modelosSeleccionados.add("WesternDigitalBlue500GB");
                    cantidad++;
                    break;
                case 2:
                    modelosSeleccionados.add("WesternDigitalBlue1TB");
                    cantidad++;
                    break;
                case 3:
                    modelosSeleccionados.add("SeagateBarracuda1TB");
                    cantidad++;
                    break;
                case 4:
                    modelosSeleccionados.add("SeagateBarracuda2TB");
                    cantidad++;
                    break;
                case 0:
                    if (cantidad > 0) {
                        return modelosSeleccionados;
                    } else {
                        System.out.println("Debes seleccionar al menos un componente.");
                    }
                    break;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }

        return modelosSeleccionados;
    }

    /**
     * Metodo auxiliar de {@code solicitarComponentes()}. Solicita al cliente seleccionar uno o mas modelos de SSD.
     * El cliente puede elegir como minimo 1 modelo y como maximo hasta 4 modelos.
     * 
     * @return Lista con los modelos seleccionados.
     */
    public List<String> solicitarSSD() {
        List<String> modelosSeleccionados = new ArrayList<>();
        int cantidad = 0;

        while (cantidad < 4) {
            System.out.println("\n========== Modelos de SSD ==========");
            System.out.println("Selecciona el modelo de tus discos SSD. ¡Puedes elegir hasta 4!");
            System.out.println("1. Kingston 500GB");
            System.out.println("2. Kingston 1TB");
            System.out.println("3. Kingston 2TB");
            System.out.println("4. Kingston 4TB");

            if (cantidad > 0) {
                System.out.println("0. Finalizar seleccion");
            }
            System.out.print("\n\tEleccion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    modelosSeleccionados.add("Kingston500GB");
                    cantidad++;
                    break;
                case 2:
                    modelosSeleccionados.add("Kingston1TB");
                    cantidad++;
                    break;
                case 3:
                    modelosSeleccionados.add("Kingston2TB");
                    cantidad++;
                    break;
                case 4:
                    modelosSeleccionados.add("Kingston4TB");
                    cantidad++;
                    break;
                case 0:
                    if (cantidad > 0) {
                        return modelosSeleccionados;
                    } else {
                        System.out.println("Debes seleccionar al menos un componente.");
                    }
                    break;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }

        return modelosSeleccionados;
    }

    /**
     * Metodo auxiliar de {@code solicitarComponentes()}. Solicita al cliente elegir un modelo de fuente de alimentacion.
     * Solo se puede elegir un modelo.
     * 
     * @return Nombre del modelo seleccionado.
     */
    public String solicitarFuente() {
        while (true) {
            System.out.println("\n========== Modelos de Fuente de Alimentacion ==========");
            System.out.println("Selecciona el modelo de tu fuente:");
            System.out.println("1. EVGA 800W");
            System.out.println("2. EVGA 1000W");
            System.out.println("3. EVGA 1500W");
            System.out.println("4. Corsair 800W");
            System.out.println("5. Corsair 1200W");
            System.out.println("6. Corsair 1500W");
            System.out.println("7. XPG 500W");
            System.out.println("8. XPG 700W");
            System.out.println("9. XPG 1000W");

            System.out.print("\n\tEleccion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1: return "EVGA800W";
                case 2: return "EVGA1000W";
                case 3: return "EVGA1500W";
                case 4: return "Corsair800W";
                case 5: return "Corsair1200W";
                case 6: return "Corsair1500W";
                case 7: return "XPG500W";
                case 8: return "XPG700W";
                case 9: return "XPG1000W";
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }
    }

    /**
     * Metodo auxiliar de {@code solicitarComponentes()}. Solicita al cliente elegir un modelo de tarjeta grafica (GPU).
     * Solo se puede elegir un modelo.
     * 
     * @return Nombre del modelo de GPU seleccionado.
     */
    public String solicitarGPU() {
        while (true) {
            System.out.println("\n========== Modelos de GPU ==========");
            System.out.println("Selecciona el modelo de tu tarjeta grafica:");
            System.out.println("1. NVIDIA GTX 1660");
            System.out.println("2. NVIDIA RTX 3060");
            System.out.println("3. NVIDIA RTX 4070");
            System.out.println("4. NVIDIA RTX 4080");
            System.out.println("5. NVIDIA RTX 4090");

            System.out.print("\n\tEleccion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1: return "NVIDIA_GTX1660";
                case 2: return "NVIDIA_RTX3060";
                case 3: return "NVIDIA_RTX4070";
                case 4: return "NVIDIA_RTX4080";
                case 5: return "NVIDIA_RTX4090";
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }
    }

    /**
     * Metodo auxiliar de {@code solicitarComponentes()}. Solicita al cliente elegir un modelo de gabinete.
     * Solo se puede elegir un modelo.
     * 
     * @return Nombre del modelo de gabinete seleccionado.
     */
    public String solicitarGabinete() {
        while (true) {
            System.out.println("\n========== Modelos de Gabinete ==========");
            System.out.println("Selecciona el modelo de tu gabinete:");
            System.out.println("1. NZXT H6 Flow ATX");
            System.out.println("2. Yeyian Lancer ATX");

            System.out.print("\n\tEleccion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1: return "NZXTH6FlowATX";
                case 2: return "YeyianLancerATX";
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }
    }

    /**
     * Solicita al cliente seleccionar uno o mas programas de software adicional para instalar en la PC.
     * Solo se puede elegir una vez cada software. Si el cliente no desea agregar software, puede finalizar sin seleccionar ninguno.
     * 
     * @return Lista con los nombres de software seleccionados. Si no selecciona ninguno, se devuelve una lista vacia.
     */
    public List<String> solicitarSoftware() {
        List<String> seleccionados = new ArrayList<>();
        List<String> opcionesDisponibles = List.of(
            "Windows10",
            "Windows11",
            "Office365",
            "Photoshop",
            "AutoCad",
            "TerminalWSL"
        );

        while (true) {
            System.out.println("\n========== Seleccion de Software Adicional ==========");
            System.out.println("Selecciona los programas que deseas instalar.");
            for (int i = 0; i < opcionesDisponibles.size(); i++) {
                String software = opcionesDisponibles.get(i);
                if (!seleccionados.contains(software)) {
                    System.out.println((i + 1) + ". " + software);
                }
            }
            System.out.println("0. Finalizar seleccion");

            System.out.print("\n\tEleccion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
                continue;
            }

            if (opcion == 0) {
                return seleccionados;
            }

            if (opcion >= 1 && opcion <= opcionesDisponibles.size()) {
                String softwareElegido = opcionesDisponibles.get(opcion - 1);
                if (!seleccionados.contains(softwareElegido)) {
                    seleccionados.add(softwareElegido);
                } else {
                    System.out.println("Ya seleccionaste este software.");
                }
            } else {
                System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }
    }

    /**
     * Muestra un mensaje en consola.
     * Este metodo es utilizado por el controlador para comunicar informacion al cliente.
     * 
     * @param mensaje Cadena a imprimir.
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}