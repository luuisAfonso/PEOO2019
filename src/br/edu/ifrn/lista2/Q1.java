/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista2;

/**
 *
 * @author 20181144010011
 */
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int numero2 = scanner.nextInt();
        if(numero1 > numero2){
            System.out.printf("Maior numero %d\n", numero1);
        }else{
            System.out.printf("Maior numero: %d\n", numero2);
        }
    }
}
