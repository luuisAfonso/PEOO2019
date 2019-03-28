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

//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
//Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
//que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o preço seja o menor. 
//Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

public class Q17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area a ser pintada (m²):");
        double Area = scanner.nextDouble();
        double litNecessarios = Area / 6;
        double latas18 = 0;
        double latas36 = 0;
        if (litNecessarios % 18 == 0) {
            while (litNecessarios > 0) {
                litNecessarios -= 18;
                latas18++;
            }
        } else if (litNecessarios % 3.6 == 0) {
            while (litNecessarios > 0) {
                litNecessarios -= 3.6;
                latas36++;
            }
        }
        else
        {
            while(litNecessarios > 0 ){
                if(litNecessarios > 18){
                    latas18++;
                    litNecessarios -= 18;
                }
                else if(litNecessarios > 0){
                    latas36++;
                    litNecessarios -= 3.6;
                }
            }
        }
        System.out.println(litNecessarios);
        System.out.println(latas36);
        System.out.println(latas18);
    }
}
 