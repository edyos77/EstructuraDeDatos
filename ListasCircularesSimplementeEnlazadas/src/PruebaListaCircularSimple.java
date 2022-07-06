
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
public class PruebaListaCircularSimple {

    public static void main(String[] args) {
        ListaCircularSimple miLista = new ListaCircularSimple();
        int opcion = 0, elem;
        boolean eliminado = false;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar Elemento a la lista circular\n"
                        + "2. Eliminar un Elemento a la lista Circular.\n"
                        + "3. Mostrar los datos de la lista.\n"
                        + "4. Salir.\n", "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {

                    case 1:
                        try {
                        elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento",
                                "Insertando a la lista circular"));
                        //Agregando al Nodo
                        miLista.insertar(elem);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
                    }
                    break;
                    case 2:
                        if (!miLista.estaVacia()) {
                            try {
                                elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento",
                                        "Insertando al final"));
                                eliminado = miLista.eliminar(elem);
                                if(eliminado){
                                    JOptionPane.showMessageDialog(null, "El elemento eliminado es "+ elem, "Elemento eliminado", JOptionPane.INFORMATION_MESSAGE); 
                                }else{
                                    JOptionPane.showMessageDialog(null, "El elemento "+ elem + " no esta en la lista", "Elemento No encontrado", JOptionPane.INFORMATION_MESSAGE); 
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
                            }
                        }else{
                           JOptionPane.showMessageDialog(null, "La Lista Está Vacía", "Lista Vacía", JOptionPane.INFORMATION_MESSAGE); 
                        }
                        break;
                    case 3:
                        if (!miLista.estaVacia()) {
                            miLista.mostrarLista();
                        } else {
                            JOptionPane.showMessageDialog(null, "La Lista Está Vacía", "Lista Vacía", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado", "Fiiiiin.", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        } while (opcion != 4);
    }
}
