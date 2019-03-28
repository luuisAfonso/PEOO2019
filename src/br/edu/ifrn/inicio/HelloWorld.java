/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.inicio;

import br.edu.ifrn.produto.Produto;
import br.edu.ifrn.produto.Caixa;
import java.util.Calendar;
import java.util.ArrayList;

/**
 *
 * @author Luis Afonso
 */
public class HelloWorld {
    public static void main(String[] args) {
        //Produto(String nome, Calendar dataValidade, double preco){
        Produto cafe = new Produto("Três corações", Calendar.getInstance(), 24f);
        Produto carneSadia = new Produto("Carne Sadia", Calendar.getInstance(), 19f);
        Produto carneComum = new Produto("Carne comum",  Calendar.getInstance(), 12f);
        Produto refrigerante = new Produto("Refrigerante", Calendar.getInstance(), 8.5f);
        ArrayList<Produto> produtos = new ArrayList();
        produtos.add(cafe);
        produtos.add(carneComum);
        produtos.add(carneSadia);
        produtos.add(refrigerante);
        Caixa.ListarESomar(produtos);
    }  
}
