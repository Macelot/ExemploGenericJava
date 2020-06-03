/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.exemploraissa001_poo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author marce
 * @param <E>
 */
public class CarrinhoGenerico<E extends Produto> implements Serializable{
    //public class CarrinhoGenerico {
    
    ProdutoGenerico<E>[] p;
    
    ProdutoGenerico<E> produtoGenerico;
    
    public CarrinhoGenerico(int capacidade) {
        p=new ProdutoGenerico[capacidade];
    }
    
    
    public boolean guarda(ProdutoGenerico elemento){
        //achar posição vazia
        for (int i = 0; i < this.p.length; i++) {
            if(this.p[i]==null){
                this.p[i]=elemento;
                return true;
            }
        }
        return false;
    } 
     
    public ProdutoGenerico retira(int posicao){
        // se não tem elemento na posição
        // ou posição informada esta fora do intervalo (>=this.p.length ou <0)
        if(posicao<0){
            produtoGenerico = new ProdutoGenerico();
            return produtoGenerico;
        }
            
        if( (this.p[posicao]==null) || (posicao>=this.p.length) ){
            //componente = new Mouse();
            produtoGenerico = new ProdutoGenerico();
            return produtoGenerico;
        }else{
            this.p[posicao]=null;
            return null;
        }
        
    } 

    
}
