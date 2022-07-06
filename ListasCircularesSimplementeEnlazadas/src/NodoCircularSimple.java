
/**
 *
 * @author Eduar Yosme
 */
public class NodoCircularSimple {
    int dato;
    NodoCircularSimple siguiente;
    
    public NodoCircularSimple(int elem){
        dato = elem;
        siguiente = this;
    }
}
