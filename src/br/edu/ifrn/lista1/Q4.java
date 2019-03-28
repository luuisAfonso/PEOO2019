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

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1° nota");
        double nota1 = scanner.nextDouble();
        System.out.println("2° nota");
        double nota2 = scanner.nextDouble();
        System.out.println("3° nota");
        double nota3 = scanner.nextDouble();
        System.out.println("4° nota");
        double nota4 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.printf("Nota media final: %.2f\n", media );
    }
    
}
