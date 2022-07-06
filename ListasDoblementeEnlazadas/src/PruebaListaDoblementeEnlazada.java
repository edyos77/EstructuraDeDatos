
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
public class PruebaListaDoblementeEnlazada {

    public static void main(String[] args) {
        ListaDoble miLista = new ListaDoble();
        int opcion = 0, elem;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar Elemento al Inicio\n"
                        + "2. Agregar Elemento al Final.\n"
                        + "3. Mostrar Lista de Inicio a Fin.\n"
                        + "4. Mostrar Lista de Fin a Inicio.\n"
                        + "5. Eliminar elemento del Inicio.\n"
                        + "6. Eliminar elemento del final.\n"
                        + "7. Salir.\n", "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {

                    case 1:
                        try{
                        elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento", 
                                "Insertando al inicio"));
                        //Agregando al Nodo
                        miLista.agregarInicio(elem);
                        }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Error " + e.getMessage());
                        }
                        break;
                    case 2:
                        try{
                        elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento", 
                                "Insertando al final"));
                        //Agregando al Nodo
                        miLista.agregarFinal(elem);
                        }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Error " + e.getMessage());
                        }
                        break;
                    case 3:
                        miLista.mostrarListaInicioFin();
                        break;
                    case 4:
                        miLista.mostrarFinInicio();
                        break;
                    case 5:
                        if(!miLista.estaVacia()){
                            elem = miLista.eliminarInicio();
                            JOptionPane.showMessageDialog(null,"El elemento eliminado es " + elem,
                                    "Eliminando elemento del inicio", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay elementos en la lista",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if(!miLista.estaVacia()){
                            elem = miLista.eliminarFinal();
                            JOptionPane.showMessageDialog(null,"El elemento eliminado es " + elem,
                                    "Eliminando elemento del final", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay elementos en la lista",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        } while (opcion != 7);

    }
}
