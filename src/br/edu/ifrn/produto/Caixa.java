/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.produto;
import java.util.ArrayList;

/**
 *
 * @author 20181144010011
 */
public class Caixa {

    static public void Descrever(Produto... produtos) {
        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.printf("Data: %s\n", dateFormat.format(dataValidade.getTime()));
        //System.out.printf(dateFormat.format(dataValidade.getTime()) +"\n");
        for (Produto produto : produtos) {
            System.out.printf("Nome: %s\n", produto.nome);
            System.out.println(String.format("Data de validade: %1$td/%1$tm/%1$tY", produto.dataValidade));
            System.out.printf("Preço: %.2f R$\n", produto.preco);
        }
    }

    static public void Descrever(ArrayList<Produto> produtos) {
        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.printf("Data: %s\n", dateFormat.format(dataValidade.getTime()));
        //System.out.printf(dateFormat.format(dataValidade.getTime()) +"\n");
        for (Produto produto : produtos) {
            System.out.printf("Nome: %s\n", produto.nome);
            System.out.println(String.format("Data de validade: %1$td/%1$tm/%1$tY", produto.dataValidade));
            System.out.printf("Preço: %.2f R$\n", produto.preco);
        }
    }

    static public double Somar(Produto... produtos) {
        double total = 0;
        for (Produto produto : produtos)
            total += produto.preco;
        return total;
    }
    
    
    static public double Somar(ArrayList<Produto> produtos) {
        double total = 0;
        for (Produto produto : produtos)
            total += produto.preco;
        return total;
    }
    
    public static void ListarESomar(Produto... produtos) {
        for (Produto produto : produtos)
            System.out.printf("%s %.2f\n", produto.nome, produto.preco);
        double valorTotal = Caixa.Somar(produtos);
        System.out.println("--------------------");
        System.out.printf("Valor total: %.2f\n", valorTotal);
    }
    
        public static void ListarESomar(ArrayList<Produto> produtos) {
        for (Produto produto : produtos)
            System.out.printf("%s %.2f\n", produto.nome, produto.preco);
        double valorTotal = Caixa.Somar(produtos);
        System.out.println("--------------------");
        System.out.printf("Valor total: %.2f\n", valorTotal);
    }
}
