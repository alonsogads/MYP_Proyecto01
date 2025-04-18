package modelo.adaptador;

/**
 * Clase que representa un CPU AMD concreto: AMD Ryzen 5 5600G.
 * Implementa la interfaz {@code CPUAMD} y expone sus caracteristicas.
 * Esta clase es un componente concreto no compatible con {@code CPU}
 * y requiere un adaptador para integrarse con el sistema.
 * 
 * Es una clase 'Adaptado' del patron Adapter.
 */
public class AMDRyzen5_5600G implements CPUAMD {

    /**
     * Devuelve el nombre del CPU AMD concreto.
     * @return Nombre del componente
     */
    @Override
    public String getNombre() {
        return "AMD Ryzen 5 5600G";
    }

    /**
     * Devuelve el nombre del CPU AMD concreto.
     * @return Precio del componente
     */
    @Override
    public float getPrecio() {
        return 2600.0f;
    }

    /**
     * Devuelve el nombre del CPU AMD concreto.
     * @return Marca del componente
     */
    @Override
    public String getMarca() {
        return "AMD";
    }

    /**
     * Devuelve el tipo de componente del CPU AMD concreto.
     * @return Tipo del componente
     */
    @Override
    public String getTipoComponente() {
        return "CPU";
    }

    /**
     * Devuelve la cantidad de nucleos del CPU AMD concreto.
     * @return Cantidad de nucleos del CPU
     */
    @Override
    public short getCantidadNucleos() {
        return 6;
    }
}
