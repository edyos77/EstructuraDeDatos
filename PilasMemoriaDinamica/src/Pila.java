
/**
 *
 * @author edyos
 */
public class Pila {
   private NodoPila cima;
   int tama;
   
   public Pila(){
       cima = null;
       tama = 0;
   }
   
   //Método para saber si la lista esta Vacia
   public boolean estaVacia(){
       return cima == null;
   }
   
   //Método para empujar un elemento en la pila
   public void push(int elem){
       NodoPila nuevo = new NodoPila(elem);
       nuevo.siguiente = cima;
       cima = nuevo;
       tama++;
   }
   
   //Método para sacar un elemento de la pila
   public int pop(){
       int aux = cima.dato;
       cima = cima.siguiente;
       tama--;
       return aux;
   }
   
   //Método para saber que elemento esta en la cima
   public int cima(){
       return cima.dato;
   }
   
   //Método para saber el tamaño de la cima
   public int tamanioPila(){
       return tama;
   }
   
   //Método para limpiar la pila
   public void limpiarPila(){
       while(!estaVacia()){
           pop();
       }
   }
}
