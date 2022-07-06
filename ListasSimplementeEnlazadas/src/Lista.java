
/**
 *
 * @author edyos
 */
public class Lista {
    
    protected Nodo inicio;
    protected Nodo fin;//Punteros para saber donde esta el inicio y el fin
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    //Método para saber si la lista esta vacia 
    public boolean estaVacia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    //Método para agregar un Nodo al inicio de la lista
    public void agregarInicio(int elemento){
        //Creando el Nodo
        inicio = new Nodo(elemento, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    
    //Método para insertar al final de la lista
    public void agregarFinal(int elemento){
        if(!estaVacia()){
            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;
        }else{
            inicio = fin = new Nodo(elemento);
        }
    }
    
    //Método para eliminar elemento del inicio
    public int eliminarInicio(){
        int elemento = this.inicio.dato;
        if (inicio == fin){
            inicio = fin = null;
        }else{
            inicio = inicio.siguiente;
        }
        return elemento;
    }
    
    //Método para eliminar un elemento del final
    public int eliminarFinal(){
        int elemento = this.fin.dato;
        if(inicio == fin){
            inicio = fin = null;
        }else{
            Nodo temporal = inicio;
            while(temporal.siguiente != fin){
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;        
        }
        return elemento;
    }
    
    //Metodo para eliminar un elemento en especifico 
    public boolean eliminar(int elemento){
        if (!estaVacia()){
            if(inicio == fin && elemento == inicio.dato ){
                inicio = fin = null;
            }else if(elemento == inicio.dato){
                inicio = inicio.siguiente;
            }else{
                Nodo anterior = inicio;
                Nodo temporal = inicio.siguiente;
                while(temporal != null && temporal.dato != elemento){
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                if(temporal != null){
                    anterior.siguiente = temporal.siguiente;
                    if(temporal == fin){
                        fin = anterior;
                    }
                }
            }
            return true;
        }else{
            return false;
        }
    }
    
    //Método para buscar un elemento
    public boolean estanEnLista(int elemento){
        Nodo temporal = inicio;
        while (temporal != null && temporal.dato != elemento){
            temporal = temporal.siguiente;
        }
        return temporal != null;
       
    }
    
    //Método para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer = inicio;
        System.out.println();
        while(recorrer != null){
            System.out.print("["+ recorrer.dato + "]--->");
            recorrer = recorrer.siguiente;
        }
    }
}
