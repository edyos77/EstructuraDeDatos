
import javax.swing.JOptionPane;



/**
 *
 * @author edyos
 */
public class ListaDoble {
    private NodoDoble inicio, fin;
    
    public ListaDoble(){
        inicio = fin = null;
    }
    
    //Método para saber si la lista esa vacia
    public boolean estaVacia(){
        return inicio == null;
    }
    
    //Método para agregar Nodos al final
    public void agregarFinal(int elem){
        if(!estaVacia()){
            fin = new NodoDoble(elem, null, fin);
            fin.anterior.siguiente = fin;
        }else{
            inicio = fin = new NodoDoble(elem);
        }
    }
    
    //Método para agregar Nodos al Inicio
    public void agregarInicio(int elem){
        if(!estaVacia()){
            inicio = new NodoDoble(elem, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio = fin = new NodoDoble(elem);
        }
    }
    
    //Método para mostrar la lista de Inicio a Fin
    public void mostrarListaInicioFin(){
       if(!estaVacia()){
           String datos = "<=>";
           NodoDoble aux = inicio;
           while (aux != null){
               datos = datos + "[" + aux.dato + "]<=>";
               aux = aux.siguiente;
           }
           JOptionPane.showMessageDialog(null, datos, "Mostrando lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "La Lista esta vacia Vacia", "lista vacia", JOptionPane.INFORMATION_MESSAGE);
       }
    }
    
    //Método para mostrar la lista de Fin a Inicio
    public void mostrarFinInicio(){
       if(!estaVacia()){
           String datos = "<=>";
           NodoDoble aux = fin;
           while (aux != null){
               datos = datos + "[" + aux.dato + "]<=>";
               aux = aux.anterior;
           }
           JOptionPane.showMessageDialog(null, datos, "Mostrando lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "La Lista esta vacia Vacia", "lista vacia", JOptionPane.INFORMATION_MESSAGE);
       }
    }
    
    //Método para eliminar un elemento del Inicio
    public int eliminarInicio(){
        int elemento = inicio.dato;
        if(inicio == fin){
            inicio = fin = null;
        }else{
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }
    
    //Método para eliminar un elemento del Final
    public int eliminarFinal(){
        int elemento = fin.dato;
        if(inicio == fin){
            inicio = fin = null;
        }else{
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return elemento;
    }
}
