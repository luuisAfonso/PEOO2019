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
//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
//Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
//Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area a ser pintada (m²):");
        double Area = scanner.nextDouble();
        double litNecessarios = Area/3;
        double latas = 0;
        while(litNecessarios > 0){
            litNecessarios -= 18;
            latas++;
        }
        System.out.printf("Numero de latas:%.0f, preço: %.2f\n", latas, (latas * 80));
    }
}
