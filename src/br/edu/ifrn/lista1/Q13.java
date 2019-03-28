/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author 20181144010011
 */
public class Q13 {
        //(72.7*altura) - 58
    public static void main(String[] args) {
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        double pesoIdealH = (72.7 * altura) - 58;
        double pesoIdealM = (62.1 * altura) - 44.7;
        JOptionPane.showMessageDialog(null, pesoIdealH);
        JOptionPane.showMessageDialog(null, pesoIdealM);
    }
}
