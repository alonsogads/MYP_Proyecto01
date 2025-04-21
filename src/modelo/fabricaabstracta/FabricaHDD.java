package modelo.fabricaabstracta;

/**
 * Clase para la creacion de objetos (componentes) de tipo HDD.
 * Implementa el metodo {@code getComponente} definido en {@code FabricaAbstractaComponente}.
 * 
 * Esta es una clase 'FabricaConcreta' del patron AbstractFactory.
 */
public class FabricaHDD extends FabricaAbstractaComponente{
    /**
     * Devuelve una instancia concreta de un HDD en funcion del tipo pasado como parametro.
     * 
     * @param tipo Nombre del modelo del HDD solicitado (por ejemplo, WesternDigitalBlue1TB).
     * @return Una instancia del componente correspondiente o {@code null} si no coincide.
     */
    @Override
    public Object getComponente(String tipo) {
        HDD hdd;
        switch (tipo) {
            case "WesternDigitalBlue500GB":
                hdd = new WesternDigitalBlue500GB();
                hdd.crearHDD();
                return hdd;
            case "WesternDigitalBlue1TB":
                hdd = new WesternDigitalBlue1TB();
                hdd.crearHDD();
                return hdd;
            case "SeagateBarracuda1TB":
                hdd = new SeagateBarracuda1TB();
                hdd.crearHDD();
                return hdd;
            case "SeagateBarracuda2TB":
                hdd = new SeagateBarracuda2TB();
                hdd.crearHDD();
                return hdd;
            default:
                return null;
        }
    }
}