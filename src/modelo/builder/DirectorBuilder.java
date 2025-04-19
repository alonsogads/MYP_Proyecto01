package modelo.builder;

import modelo.decorador.PCBase;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Clase directora que coordina la construccion de una PC utilizando
 * distintas implementaciones concretas de {@code BuilderPC}.
 * La clase contiene solo metodos estaticos para simplificar su uso en todo el sistema.
 */
public class DirectorBuilder {
    
    /**
     * Construye una PC personalizada a partir de las elecciones del usuario.
     * 
     * @param elecciones Mapa con las elecciones del usuario por tipo de componente.
     * @return Una instancia de {@code PCBase} ensamblada segun las elecciones.
     */
    public static PCBase nuevaPCPersonalizada(Map<String, List<String>> elecciones) {
        BuilderPC builder = new BuilderPCPersonalizada(elecciones);
        return builder.montarPC();
    }

    /**
     * Construye una PC prearmada segun el modelo especificado.
     * 
     * @param modelo Nombre del modelo prearmado.
     * @return Una instancia de {@code PCBase} ensamblada segun el modelo.
     */
    public static PCBase nuevaPCPrearmada(String modelo) {

        BuilderPC builder;

        switch (modelo) {
            case "Estudiante":
                builder = new BuilderPCEstudiante();
                break;
            case "Gamer":
                builder = new BuilderPCGamer();
                break;
            case "Punto de Venta":
                builder = new BuilderPCPuntoVenta();
                break;
            default:
                return null;
        }

        return builder.montarPC();
    }
}
