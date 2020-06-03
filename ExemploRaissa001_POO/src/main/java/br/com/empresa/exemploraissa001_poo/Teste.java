
package br.com.empresa.exemploraissa001_poo;

//http://www.ic.uff.br/~anselmo/cursos/TPA/apresentacoes/Genericos.pdf

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//https://respostas.guj.com.br/32092-criacao-de-classe-parametrizada
//https://www.devmedia.com.br/usando-generics-em-java/28981


public class Teste {

    public static void main(String[] args) {
        System.out.println("Iniciando");

        Produto produto;
        produto = new Produto("Pen",30.0f);

        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());

        Armazenamento armazenamento;
        armazenamento = new Armazenamento();
        armazenamento.setNome("SSD");
        //armazenamento.setPreco(100.00f);
        //armazenamento.setCapacidade(1);
        armazenamento.setUnidade("T");
        System.out.println(armazenamento.getNome());
        System.out.println(armazenamento.getPreco());
        System.out.println(armazenamento.getCapacidade());
        System.out.println(armazenamento.getUnidade());

        Armazenamento armazenamento2;
        armazenamento2 = new Armazenamento();
        armazenamento2 = armazenamento2.capacidade(32);
        System.out.println(armazenamento2.toString());

        Carrinho carrinho;
        carrinho = new Carrinho();

        carrinho.p[0]=produto;
        carrinho.p[1]=armazenamento;
        carrinho.p[2]=armazenamento2;

        System.out.println("----");
        //System.out.println(carrinho.p[0].toString());
        //System.out.println(carrinho.p[1].toString());
        //System.out.println(carrinho.p[2].toString());


        System.out.println(carrinho.p.length);

        //carrinho.remove(1);

        for (int i = 0; i < carrinho.p.length; i++) {
            if(carrinho.p[i]!=null){
                 System.out.println(carrinho.p[i].toString());
            }      
        }
        
        //teste genérico
        System.out.println("----teste genérico");
        CarrinhoGenerico carrinhoGenerico;
        carrinhoGenerico = new CarrinhoGenerico<>(10);
        ProdutoGenerico produtoGenerico;
        
        //carrinho.p[0]=produto;
        produtoGenerico=new ProdutoGenerico();
        produtoGenerico.add(produto);  
        carrinhoGenerico.guarda(produtoGenerico);
        
        //carrinhoGenerico.p[1]=armazenamento;
        produtoGenerico=new ProdutoGenerico();
        produtoGenerico.add(armazenamento);  
        carrinhoGenerico.guarda(produtoGenerico);
        
        
        //carrinhoGenerico.p[2]=armazenamento2;
        produtoGenerico=new ProdutoGenerico();
        produtoGenerico.add(armazenamento2);  
        carrinhoGenerico.guarda(produtoGenerico);
        

        for (int i = 0; i < carrinhoGenerico.p.length; i++) {
            if(carrinhoGenerico.p[i]!=null){
                 System.out.println(carrinhoGenerico.p[i].toString());
            }      
        }
        
        carrinhoGenerico.retira(1);
        
        System.out.println("----teste genérico2");
        for (int i = 0; i < carrinhoGenerico.p.length; i++) {
            if(carrinhoGenerico.p[i]!=null){
                 System.out.println(carrinhoGenerico.p[i].toString());
            }      
        }
        
        Mouse mouse;
        mouse = new Mouse("UBS","Preto");
        
        produtoGenerico=new ProdutoGenerico();
        produtoGenerico.add(mouse);  
        carrinhoGenerico.guarda(produtoGenerico);
        
        System.out.println("----teste genérico3");
        for (int i = 0; i < carrinhoGenerico.p.length; i++) {
            if(carrinhoGenerico.p[i]!=null){
                 System.out.println(carrinhoGenerico.p[i].toString());
            }      
        }
        
        
        
        CarrinhoGenerico carrinhoGenerico2;
        carrinhoGenerico2 = new CarrinhoGenerico<>(10);
        ProdutoGenerico produtoGenerico2;

        
        for (int i = 0; i < 10; i++) {
            produto = new Produto("Pen",30.0f,(i+1));
            produtoGenerico2=new ProdutoGenerico();
            produtoGenerico2.add(produto);  
            carrinhoGenerico2.guarda(produtoGenerico2);
        }
        
        FileOutputStream fo;        
        ObjectOutputStream oo;
        try {
            //fo = new FileOutputStream("D:\\Faculdade\\terceiro periodo\\Programacao_Orientada_a_Objeto\\aps2\\aps2\\src\\aps2.obj");
            fo = new FileOutputStream("D:\\estoque.txt");
            oo = new ObjectOutputStream(fo);
            oo.writeObject(carrinhoGenerico2);
            oo.close();
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Não foi poss�vel salvar o cadastro em arquivo!");
            e.printStackTrace();
        }
        
        
        
        File estoque = new File ("D:\\estoque.txt");
        
        try {
            FileInputStream fis = new FileInputStream("D:\\estoque.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            CarrinhoGenerico pilha = (CarrinhoGenerico) ois.readObject();
            //System.out.println(".."+pilha.toString());    
            
            for (int i = 0; i < pilha.p.length; i++) {
                if(pilha.p[i]!=null){
                     System.out.println(pilha.p[i].toString());
                }      
            }
            
            ois.close();
        }catch (Exception e){
            System.out.println("Erro "+e.getMessage());
        }
        
        //adicionar carrinho tirar estoque
        
        //cliente desistir compra
        
        
        //atualizar estoque
        
        
        //fazer relatório de venda
        //produto quantidade valor
        
        //venda realizada por cliente
        
        //valor médio por cliente, menor valor gasto, maior valor gasto, quantidade cliente desistiu
        
        

    }
}