
/**
 *
 * @author edyos
 */
public class NodoDoble {
    public int dato;
    NodoDoble siguiente, anterior;
    
     //Constructor para cuando aun no hay nodos
    public NodoDoble(int elem){
        this(elem, null, null);
    }
    
    //Constructor para cuando ya hay nodos
    public NodoDoble(int elem, NodoDoble sig, NodoDoble ant){
        this.dato = elem;
        this.siguiente = sig;
        this.anterior = ant;
    }
    
   
    
}
