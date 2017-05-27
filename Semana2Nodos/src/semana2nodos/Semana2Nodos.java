/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2nodos;

import javax.swing.JOptionPane;
import model.ListaSimple;

/**
 *
 * @author joser
 */
public class Semana2Nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaSimple ls = new ListaSimple();
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.addFirst(1);
        
//        System.out.println(ls.getCabeza().getDato() +"\n"+ls.getCabeza().getSig().getDato()+"\n"+ls.getUltimo().getDato());
        
        //----------------------------------------------------------------------

        //PRUEBA DEL METODO TOSTRING
        
        System.out.println(ls.toString());
        
        //----------------------------------------------------------------------
        
        //PRUEBA DEL METODO INDEXOF
        
//        int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para buscar"));
//        
//        JOptionPane.showMessageDialog(null,"Resultado: "+ ls.indexOf(busqueda));
        
        //----------------------------------------------------------------------
        
        int objetoIndexBuscar = Integer.parseInt(JOptionPane.showInputDialog("Digite el indice del dato que desea"));
        
        
        System.out.println("Resultado: "+ls.get(objetoIndexBuscar));
            
        
        
    }
    
}
