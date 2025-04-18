package modelo.fabricaabstracta;

/**
 * Clase abstracta que representa la plantilla de todas las fabricas de componentes de las PC.
 * 
 * Cada subclase concreta debe implementar el metodo {@code getComponente}
 * para devolver una instancia del componente solicitado.
 * 
 * Esta es la clase 'FabricaAbstracta' del patron AbstractFactory.
 */
public abstract class FabricaAbstractaComponente {

    /**
     * Metodo abstracto que devuelve un componente en funcion del tipo solicitado.
     * 
     * @param tipo El nombre del componente deseado.
     * @return La instancia del componente correspondiente como {@code Object}.
     */
    public abstract Object getComponente(String tipo);
}