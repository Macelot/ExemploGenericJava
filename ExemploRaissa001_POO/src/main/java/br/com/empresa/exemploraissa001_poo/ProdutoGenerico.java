/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.exemploraissa001_poo;

import java.io.Serializable;

/**
 *
 * @author marce
 */
public class ProdutoGenerico<T> implements Serializable {
    private T produto;
 
    public void add(T t) {
      this.produto = t;
    }

    public T get() {
      return produto;
    }
    
    @Override
    public String toString(){
        String resultado="";
        resultado = produto.toString();
        return resultado;
    }
    
}
