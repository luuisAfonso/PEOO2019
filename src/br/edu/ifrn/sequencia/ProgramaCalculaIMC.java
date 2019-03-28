/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sequencia;

/**
 *
 * @author 20181144010011
 */

import java.util.Scanner;

public class ProgramaCalculaIMC {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massa(Kg): ");
        double massa = scanner.nextDouble();
        System.out.println("Altura(M): ");
        double altura = scanner.nextDouble();
        double IMC = massa/ (altura * altura);
        System.out.println("Massa: " + massa + "kg");
        System.out.println("altura: " + altura + "m");
        System.out.printf("IMC: %.2f\n",IMC);
    }
    
}
