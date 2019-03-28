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

public class Q11 {
    public static void main(String[] args) {
        int int1 = Integer.parseInt(JOptionPane.showInputDialog("1° Inteiro: "));
        int int2 = Integer.parseInt(JOptionPane.showInputDialog("2° Inteiro: "));
        double numReal = Double.parseDouble(JOptionPane.showInputDialog("Numero real: "));
        String valorA = String.format("Valor A: %d\n",(2*int1) + (int2/2));
        String valorB = String.format("Valor B: %.2f\n", (3*int1) + numReal);
        String valorC = String.format("Valor C: %.2f\n", (numReal * numReal * numReal));
        JOptionPane.showMessageDialog(null, valorA);
        JOptionPane.showMessageDialog(null, valorB);
        JOptionPane.showMessageDialog(null, valorC);
    }
}
