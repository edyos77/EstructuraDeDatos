
import javax.swing.JOptionPane;

/**
 *
 * @author edyos
 */
public class PruebaPila {

    public static void main(String[] args) {
        int opcion = 0, elemento, tamanio;
        boolean estado = false;
        try {
            tamanio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la Pila",
                    "Ingresando el tamaño de la pila", JOptionPane.INFORMATION_MESSAGE));
            Pila miPila = new Pila(tamanio);
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemento en la pila\n"
                        + "2. Sacar un elemento de la pila\n"
                        + "3. ¿La pila está vacía?\n"
                        + "4. ¿La pila está llena?\n"
                        + "5. Qué elemento está en la cima?\n"
                        + "6. Tamaño de la fila\n"
                        + "7. Salir\n", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        try {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento a empujar en la pila",
                                "Apilando datos", JOptionPane.INFORMATION_MESSAGE));
                        if (!miPila.estaLlena()) {
                            miPila.push(elemento);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta llena", "Pila Llena", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
                    }
                    break;
                    case 2:
                        if (!miPila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento es "+ miPila.pop(), "Obteniendo dato de la pila", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacía", "Pila Vacía", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(miPila.estaVacia()){
                            JOptionPane.showMessageDialog(null, "La pila esta vacía", "Pila Vacía", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila no está vacía", "Pila no esta Vacía", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(miPila.estaLlena()){
                            JOptionPane.showMessageDialog(null, "La pila esta Llena", "Pila Llena", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila no está Llena", "Pila no esta Llena", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!miPila.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento es: "+ miPila.cimaPila(), "Elemento en la cima", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacía", "Pila Vacía", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if(miPila.tamanioPila()>0){
                            JOptionPane.showMessageDialog(null, "El tamaño de la pila es "+ miPila.tamanioPila(), "Tamaño de la Pila", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacía", "Pila Vacía", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta", "Opción no existe", JOptionPane.INFORMATION_MESSAGE);
                }
            } while (opcion != 7);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }

}
