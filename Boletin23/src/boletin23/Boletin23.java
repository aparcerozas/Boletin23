/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx = new Metodos();
        int numPersoas = 0;
        double total = 0;
        try {
            numPersoas = obx.pedirNumeroPersoas();
            } catch (ForaDeRangoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        Queue<Integer> idades = new LinkedList<>();
        for(int i=0;i<numPersoas;i++){
            int random = (int)(Math.random()* 56 + 5);
            if(random<=10){
                total=total+1;
            }
            else if(random<=17){
                total=total+2.5;
            }
            else{
                total=total+3.5;
            }
            idades.add(random);
        }
        System.out.println(total);
        for(int i : idades){
            System.out.print(i+" ");
        }
       
    }
    
}
