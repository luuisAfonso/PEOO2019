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
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Peso total (Kg):");
        double peso = scanner.nextDouble();
        double excesso = peso - 50;
        System.out.println(String.format("Valor de excesso: %.2f Kg ", excesso));
        System.out.println(String.format("Multa: %.2f R$ ", (excesso*4)));
    }
}
