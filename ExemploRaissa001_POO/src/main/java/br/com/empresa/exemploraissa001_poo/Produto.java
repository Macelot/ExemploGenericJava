package br.com.empresa.exemploraissa001_poo;

import java.io.Serializable;


public class Produto implements Serializable {
    String nome;
    Float preco;
    int quantidadeEstoque;

    public Produto(){
        System.out.println("Produto Criado");
        this.nome = "item";
        this.preco = 0.01f;
        this.quantidadeEstoque = 1;
    }
  
    public Produto(String nome, Float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public Produto(String nome, Float preco, int q) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = q;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return this.preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Produto nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Produto preco(Float preco) {
        this.preco = preco;
        return this;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


    @Override
    public String toString(){
        String resultado="";
        resultado += " nome='" + getNome() + "'";
        resultado += " preço='" + getPreco() + "'";
        resultado += " quantidadeEstoque='" + getQuantidadeEstoque() + "'";
        return resultado;

    }


  
    



}