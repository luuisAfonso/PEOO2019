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
public class Q10 {
        public static void main(String[] args) {
        String celsiusStr = JOptionPane.showInputDialog("Celsius: ");
        double celsius = Double.parseDouble(celsiusStr);
        //(C × 9/5) + 32
        double Farenheit = ((celsius * (9/5)) + 32);
        JOptionPane.showMessageDialog(null, Farenheit);
    }
}
