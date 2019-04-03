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
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        if("M".equals(letter)){
            System.out.println("Masculino.");
        }
        else if("F".equals(letter)){
            System.out.println("Feminino.");
        }
        else{
            System.out.println("Sexo invalido.");
        }
    }
}
