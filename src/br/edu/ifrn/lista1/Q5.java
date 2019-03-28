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

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros*100;
        System.out.printf("Centimetros %.2fcm\n",centimetros);
    }
}
