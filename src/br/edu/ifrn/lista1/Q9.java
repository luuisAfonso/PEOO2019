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

public class Q9 {
    public static void main(String[] args) {
        String FarenheitStr = JOptionPane.showInputDialog("Farenheit: ");
        double Farenheit;
        Farenheit = Double.parseDouble(FarenheitStr);
        double celsius =  ( 5 * (Farenheit-32) )/ 9;
        JOptionPane.showMessageDialog(null, celsius);
    }
}
