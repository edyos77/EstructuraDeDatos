
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author edyos
 */
public class PruebaPilaMemoriaDinamica {

    public static void main(String[] args) {
        int opcion = 0, elemento = 0, tamanio = 0;
        Pila miPila = new Pila();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemento en la pila\n"
                        + "2. Sacar un elemento de la pila\n"
                        + "3. ¿La pila está vacía?\n"
                        + "4. Qué elemento está en la cima?\n"
                        + "5. Tamaño de la fila\n"
                        + "6. Limpiar la Pila\n"
                        + "7. Salir\n", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        try {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento a empujar en la pila",
                                "Apilando datos", JOptionPane.INFORMATION_MESSAGE));
                        miPila.push(elemento);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
                    }
                    break;
                    case 2:
                        if (!miPila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento es " + miPila.pop(), "Obteniendo dato de la pila",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacía", "Pila Vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (miPila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacía", "Pila Vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no está vacía", "La Pila contiene datos",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!miPila.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento en la cima es: " + miPila.cima(),
                                    "Elemento en la cima de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está Vacía", "Pila Vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:

                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es " + miPila.tamanioPila(), "Tamaño de la Pila",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        if(!miPila.estaVacia()){
                            miPila.limpiarPila();
                            JOptionPane.showMessageDialog(null, "La pila se ha limpiado", "Pila Limpiada",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila está Vacía", "Pila Vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta", "Opción no existe", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        } while (opcion != 7);
    }
}
