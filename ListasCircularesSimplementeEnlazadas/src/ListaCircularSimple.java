
import javax.swing.JOptionPane;


/**
 *
 * @author edyos
 */
public class ListaCircularSimple {
    NodoCircularSimple ultimo;
    
    public ListaCircularSimple(){
        ultimo = null;
    }
    
    //Método para saber si la lista esta vacia
    public boolean estaVacia(){
        return ultimo==null;    
    }
    
    //Método para insertar Nodos
    public ListaCircularSimple insertar(int elem){
        NodoCircularSimple nuevo = new NodoCircularSimple(elem);
        if(ultimo != null){
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }
    
    //Metodo para mostrar las lista
    public void mostrarLista(){
        NodoCircularSimple aux = ultimo.siguiente;
        String cadena = "";
        do{
           cadena = cadena + "[" + aux.dato + "]->";
           aux = aux.siguiente;
        }while(aux != ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena, "Mostrando lista Circular", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Método para eliminar un elemento de la lista
    public boolean eliminar(int elem){
        NodoCircularSimple actual;
        boolean encontrado = false;
        actual = ultimo;
        while(actual.siguiente != ultimo && !encontrado){
            encontrado = (actual.siguiente.dato == elem);
            if(!encontrado){
                actual = actual.siguiente;
            }            
        }
        encontrado = (actual.siguiente.dato == elem);
        if(encontrado){
            NodoCircularSimple aux = actual.siguiente;
            if(ultimo == ultimo.siguiente){
                ultimo = null;
            }else{
                if(aux == ultimo){
                    ultimo = actual;
                }
                actual.siguiente = aux.siguiente;
            }
            aux = null;
        }
        return encontrado == true;
    
    }
}
