/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista1;

/**
 *
 * @author 20181144010011
 */

import javax.swing.JOptionPane;

public class Q12 {
    //(72.7*altura) - 58
    public static void main(String[] args) {
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        double pesoIdeal = (72.7 * altura) - 58;
        JOptionPane.showMessageDialog(null, pesoIdeal);
    }
}
