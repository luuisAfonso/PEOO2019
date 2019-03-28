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
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pagamento por hora: ");
        double pagamentoPorHora = scanner.nextDouble();
        System.out.println("Horas trabalahadas por mês: ");
        double horasPorMes =  scanner.nextDouble();
        System.out.printf("Salario mensal: %.2fR$\n", (horasPorMes * pagamentoPorHora));
    }
}
