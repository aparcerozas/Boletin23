/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Metodos {
    public  int pedirNumeroPersoas() throws ForaDeRangoException {
        int idades = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número de persoas:"));
        if(idades>50 || idades<0){
            throw new ForaDeRangoException("O número de persoas na cola está fora dos límites");
        }
        return idades;
    }
}
