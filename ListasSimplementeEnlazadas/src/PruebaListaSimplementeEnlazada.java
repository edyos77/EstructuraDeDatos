 
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
public class PruebaListaSimplementeEnlazada {
    public static void main(String[] args) {
        int opcion = 0;
        int elem;
        Lista listita = new Lista();
        do{
            try{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "1. Agregar un elemento al inicio de la lista\n"
                    + "2. Agregar un elemento al final de la lista\n"
                    + "3. Eliminar un elemento del Inicio de la lista\n"
                    + "4. Eliminar un elemento del Final de la lista\n"
                    + "5. Eliminar un elemento especifico\n"
                    + "6. Mostrar Datos\n"
                    + "7. Buscar un Elemento en la Lista\n"
                    + "8. Salir", "Menu de Opciones",3));
            switch(opcion){
                case 1:
                    try{
                        elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento", 
                                "Insertando al inicio"));
                        //Agregando al Nodo
                        listita.agregarInicio(elem);
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Error " + e.getMessage());
                    }
                    break;
                case 2:
                    try{
                        elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento", 
                                "Insertando al final"));
                        //Agregando al Nodo
                        listita.agregarFinal(elem);
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Error " + e.getMessage());
                    }
                    break;
                case 3:
                    elem = listita.eliminarInicio();
                    JOptionPane.showMessageDialog(null,"El elemento eliminado es "+ elem,
                            "Eliminando Nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    elem = listita.eliminarFinal();
                    JOptionPane.showMessageDialog(null,"El elemento eliminado es "+ elem,
                            "Eliminando Nodo del final", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    try{
                        elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento a eliminar", 
                                "Eliminando..."));
                        if(listita.eliminar(elem)){
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es "+ elem,
                            "Eliminando...", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"No se encontro el elemento");
                        }
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Error " + e.getMessage());
                    }
                    break;
                case 6:
                    listita.mostrarLista();
                    break;
                case 7:
                    try{
                        elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento a buscar", 
                                "Buscando..."));
                        if(listita.estanEnLista(elem)){
                        JOptionPane.showMessageDialog(null,"El elemento "+ elem +" SI esta en la lista",
                            "Buscando... ", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"El elemento "+ elem +" NO esta en la lista",
                            "Nodo no Encontrado ", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Error " + e.getMessage());
                    }
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null,"Programa Finalizado");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción Incorrecta");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error " + e.getMessage());
            }
        }while(opcion != 8);
    }
}
