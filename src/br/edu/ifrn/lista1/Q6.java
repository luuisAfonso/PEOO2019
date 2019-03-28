/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista1;

import java.util.Scanner;

/**
 *
 * @author 20181144010011
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Raio: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.sqrt(raio);
        System.out.printf("Area: %.2f\n", area);
    }
}
