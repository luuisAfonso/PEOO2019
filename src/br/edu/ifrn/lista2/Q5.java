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
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nota 1:");
        double nota1 = scanner.nextDouble();
        System.out.println("Nota 2:");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2)/2;
        System.out.println(media);
        if(media == 10.0){
            System.out.println("Aprovado!");
        }
        else if(media >= 7.0){
            System.out.println("Aprovado com Distinção!");
        }
        else{
            System.out.println("Reprovado!");
        }
    }
}
