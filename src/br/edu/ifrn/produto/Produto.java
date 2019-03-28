/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.produto;


//import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Luis Afonso
 */

public class Produto {
    String nome;
    Calendar dataValidade;
    double preco;
    static String supermercado = "compra bem";
    public Produto(String nome, Calendar dataValidade, double preco){
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.preco = preco;
    }
}

