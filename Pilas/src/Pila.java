
/**
 *
 * @author edyos
 */
public class Pila {
    int vectorPila[];
    int cima;
    
    //Constructor
    
    public Pila(int tamanio){
        vectorPila = new int[tamanio];
        cima = -1;
    }
    
    //Método push
    public void push(int dato){
        cima++;
        vectorPila[cima] = dato;
    }
    
    //Método pop
    public int pop(){
        int fuera = vectorPila[cima];
        cima--;
        return fuera;
    }
    
    //Metodo para saber si la pila esta vacía
    public boolean estaVacia(){
        return cima < 0;
    }
    
    //Metodo para saber si la pila esta llena
    public boolean estaLlena(){
        return vectorPila.length-1 == cima;
    }
    
    //Método para saber que elemento se encuentra en la cima
    public int cimaPila(){
        return vectorPila[cima];
    }
    
    //Método para saber el tamaño de ña fila
    public int tamanioPila(){
        return vectorPila.length;
    }
}
