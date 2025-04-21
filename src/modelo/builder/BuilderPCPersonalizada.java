package modelo.builder;

import modelo.fabricaabstracta.DirectorFabrica;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/**
 * Clase contructora que permite armar una PC personalizada a partir de las elecciones especificadas por el usuario.
 * Utiliza {@code DirectorFabrica} para construir los componentes seleccionados.
 * 
 * Es una clase 'BuilderConcreto' del patron Builder.
 */
public class BuilderPCPersonalizada extends BuilderPC {

    // Mapa con las elecciones elegidas por el usuario (en String) para enamblar su PC personalizada.
    // Los metodos de esta clase, convertiran las cadenas en objetos de los componentes correspondientes.
    // y se guardaran en el mapa de componentes.
    private Map<String, List<String>> elecciones;
    
    /**
     * Constructor que recibe el mapa de elecciones del usuario.
     * 
     * @param elecciones Es el mapa con clave tipo de componente y su lista del modelo (o modelos segun corresponda).
     */
    public BuilderPCPersonalizada(Map<String, List<String>> elecciones) {
        this.elecciones = elecciones;
    }

    /**
     * Convierte la eleccion del usuario en un componente {@code CPU} (casteado como {@code Object}) y lo agrega al mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC esta limitada a un solo componente CPU.
     */
    @Override
    public void agregarCPU() {

        // Obtenemos la lista con el modelo (en cadena) que eligio el usuario para el CPU.
        List<String> listaModelos = elecciones.get("CPU");

        // Comprobamos que la lista no es nula y que no es vacía.
        if (listaModelos!= null && !listaModelos.isEmpty()) {

            // Obtenemos el unico modelo del CPU.
            String eleccionModelo = listaModelos.get(0);

            // Invocamos el metodo de la clase directora fabrica para obtener el componente deseado.
            Object nuevoCPU = DirectorFabrica.nuevoComponente("CPU", eleccionModelo);

            // Guardamos el componente en una lista.
            List<Object> listaComponentes = new ArrayList<>();
            listaComponentes.add(nuevoCPU);

            // Actualizamos nuestro mapa de componentes.
            componentes.put("CPU",listaComponentes);
        }
    }

    /**
     * Convierte la eleccion del usuario en un componente {@code RAM} (casteado como {@code Object}) y lo agrega al mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC puede tener uno o mas componentes RAM.
     */
    @Override
    public void agregarRAM() {

        // Obtenemos la lista con los modelos (en cadena) que eligio el usuario para la RAM.
        List<String> listaModelos = elecciones.get("RAM");

        // Comprobamos que la lista no es nula y que no es vacía.
        if (listaModelos!= null && !listaModelos.isEmpty()) {

            // Inicializamos una lista vacia para los componentes.
            List<Object> listaComponentes = new ArrayList<>();

            // Obtenemos cada modelo de la RAM
            for (String eleccionModelo : listaModelos) {

                // Invocamos el metodo de la clase directora fabrica para obtener el componente deseado.
                Object nuevaRAM = DirectorFabrica.nuevoComponente("RAM", eleccionModelo);

                // Agregamos el modelo a la lista de componentes.
                listaComponentes.add(nuevaRAM);
            }

            // Actualizamos nuestro mapa de componentes.
            componentes.put("RAM",listaComponentes);
        }
    }

    /**
     * Convierte la eleccion del usuario en un componente {@code PlacaBase} (casteado como {@code Object}) y lo agrega al mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC esta limitada a un solo componente PlacaBase.
     */
    @Override
    public void agregarPlacaBase() {

        // Obtenemos la lista con el modelo (en cadena) que eligio el usuario para la PlacaBase.
        List<String> listaModelos = elecciones.get("PlacaBase");

        // Comprobamos que la lista no es nula y que no es vacía.
        if (listaModelos!= null && !listaModelos.isEmpty()) {

            // Obtenemos el unico modelo de la PlacaBase.
            String eleccionModelo = listaModelos.get(0);

            // Invocamos el metodo de la clase directora fabrica para obtener el componente deseado.
            Object nuevaPlacaBase = DirectorFabrica.nuevoComponente("PlacaBase", eleccionModelo);

            // Guardamos el componente en una lista.
            List<Object> listaComponentes = new ArrayList<>();
            listaComponentes.add(nuevaPlacaBase);

            // Actualizamos nuestro mapa de componentes.
            componentes.put("PlacaBase",listaComponentes);
        }
    }

    /**
     * Convierte la eleccion del usuario en un componente {@code HDD} (casteado como {@code Object}) y lo agrega al mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC puede tener uno o mas componentes HDD.
     */
    @Override
    public void agregarHDD() {

        // Obtenemos la lista con los modelos (en cadena) que eligio el usuario para la HDD.
        List<String> listaModelos = elecciones.get("HDD");

        // Comprobamos que la lista no es nula y que no es vacía.
        if (listaModelos!= null && !listaModelos.isEmpty()) {

            // Inicializamos una lista vacia para los componentes.
            List<Object> listaComponentes = new ArrayList<>();

            // Obtenemos cada modelo de la HDD.
            for (String eleccionModelo : listaModelos) {

                // Invocamos el metodo de la clase directora fabrica para obtener el componente deseado.
                Object nuevaHDD = DirectorFabrica.nuevoComponente("HDD", eleccionModelo);

                // Agregamos el modelo a la lista de componentes.
                listaComponentes.add(nuevaHDD);
            }

            // Actualizamos nuestro mapa de componentes.
            componentes.put("HDD",listaComponentes);
        }
    }

    /**
     * Convierte la eleccion del usuario en un componente {@code SSD} (casteado como {@code Object}) y lo agrega al mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC puede tener uno o mas componentes SSD.
     */
    @Override
    public void agregarSSD() {

        // Obtenemos la lista con los modelos (en cadena) que eligio el usuario para la SSD.
        List<String> listaModelos = elecciones.get("SSD");

        // Comprobamos que la lista no es nula y que no es vacía.
        if (listaModelos!= null && !listaModelos.isEmpty()) {

            // Inicializamos una lista vacia para los componentes.
            List<Object> listaComponentes = new ArrayList<>();

            // Obtenemos cada modelo de la SSD.
            for (String eleccionModelo : listaModelos) {

                // Invocamos el metodo de la clase directora fabrica para obtener el componente deseado.
                Object nuevaSSD = DirectorFabrica.nuevoComponente("SSD", eleccionModelo);

                // Agregamos el modelo a la lista de componentes.
                listaComponentes.add(nuevaSSD);
            }

            // Actualizamos nuestro mapa de componentes.
            componentes.put("SSD",listaComponentes);
        }
    }

    /**
     * Convierte la eleccion del usuario en un componente {@code Fuente} (casteado como {@code Object}) y lo agrega al mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC esta limitada a un solo componente Fuente.
     */
    @Override
    public void agregarFuente() {

        // Obtenemos la lista con el modelo (en cadena) que eligio el usuario para la Fuente.
        List<String> listaModelos = elecciones.get("Fuente");

        // Comprobamos que la lista no es nula y que no es vacía.
        if (listaModelos!= null && !listaModelos.isEmpty()) {

            // Obtenemos el unico modelo de la Fuente.
            String eleccionModelo = listaModelos.get(0);

            // Invocamos el metodo de la clase directora fabrica para obtener el componente deseado.
            Object nuevaFuente = DirectorFabrica.nuevoComponente("Fuente", eleccionModelo);

            // Guardamos el componente en una lista.
            List<Object> listaComponentes = new ArrayList<>();
            listaComponentes.add(nuevaFuente);

            // Actualizamos nuestro mapa de componentes.
            componentes.put("Fuente",listaComponentes);
        }
    }

    /**
     * Convierte la eleccion del usuario en un componente {@code GPU} (casteado como {@code Object}) y lo agrega al mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC esta limitada a un solo componente GPU.
     */
    @Override
    public void agregarGPU() {

        // Obtenemos la lista con el modelo (en cadena) que eligio el usuario para la GPU.
        List<String> listaModelos = elecciones.get("GPU");

        // Comprobamos que la lista no es nula y que no es vacía.
        if (listaModelos!= null && !listaModelos.isEmpty()) {

            // Obtenemos el unico modelo de la GPU.
            String eleccionModelo = listaModelos.get(0);

            // Invocamos el metodo de la clase directora fabrica para obtener el componente deseado.
            Object nuevaGPU = DirectorFabrica.nuevoComponente("GPU", eleccionModelo);

            // Guardamos el componente en una lista.
            List<Object> listaComponentes = new ArrayList<>();
            listaComponentes.add(nuevaGPU);

            // Actualizamos nuestro mapa de componentes.
            componentes.put("GPU",listaComponentes);
        }
    }

    /**
     * Convierte la eleccion del usuario en un componente {@code Gabinete} (casteado como {@code Object}) y lo agrega al mapa de componentes.
     * De acuerdo a los requerimientos del proyecto, la PC esta limitada a un solo componente Gabinete.
     */
    @Override
    public void agregarGabinete() {

        // Obtenemos la lista con el modelo (en cadena) que eligio el usuario para el Gabinete.
        List<String> listaModelos = elecciones.get("Gabinete");

        // Comprobamos que la lista no es nula y que no es vacía.
        if (listaModelos!= null && !listaModelos.isEmpty()) {

            // Obtenemos el unico modelo del Gabinete.
            String eleccionModelo = listaModelos.get(0);

            // Invocamos el metodo de la clase directora fabrica para obtener el componente deseado.
            Object nuevoGabinete = DirectorFabrica.nuevoComponente("Gabinete", eleccionModelo);

            // Guardamos el componente en una lista.
            List<Object> listaComponentes = new ArrayList<>();
            listaComponentes.add(nuevoGabinete);

            // Actualizamos nuestro mapa de componentes.
            componentes.put("Gabinete",listaComponentes);
        }
    }
}
