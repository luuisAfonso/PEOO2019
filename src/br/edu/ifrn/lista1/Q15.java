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

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//  + Salário Bruto : R$
//  - IR (11%) : R$
//  - INSS (8%) : R$
//  - Sindicato ( 5%) : R$
//  = Salário Liquido : R$

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salario por hora (R$): ");
        double salario = scanner.nextDouble();
        System.out.println("Horas trabalhadas por mês (h): ");
        double horas = scanner.nextDouble();
        double totalBruto = horas * salario;
        double ir = (totalBruto/100 * 11f);
        double inss = (totalBruto/100 * 8f);
        double sindico = (totalBruto/100 * 5f);
        double salarioLiquido = totalBruto - (ir + inss + sindico);
        System.out.printf(" + Salário Bruto : %.2f R$\n" +
            " - IR (11%%) : %.2f R$\n" +
            " - INSS (8%%) : %.2f R$\n" +
            " - Sindicato ( 5%%) : %.2f R$\n" +
            " = Salário Liquido : %.2f R$", totalBruto, ir, inss, sindico, salarioLiquido);
    }
}
