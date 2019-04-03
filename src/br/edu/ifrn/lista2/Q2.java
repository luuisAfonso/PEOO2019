/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista2;

import java.util.Scanner;

/**
 *
 * @author 20181144010011
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor:");
        float Numero = scanner.nextInt();
        if(Numero > 0){
            System.out.println("Positivo.");
        }
        else if(Numero < 0){
            System.out.println("Negativo.");
        }
        else{
            System.out.println("Neutro.");
        }
    }
    
}
