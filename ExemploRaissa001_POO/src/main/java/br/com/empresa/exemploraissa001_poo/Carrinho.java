package br.com.empresa.exemploraissa001_poo;

public class Carrinho {
    Produto[] p;

    public Carrinho() {
        p=new Produto[100];
    }

    public Carrinho(Produto[] p) {
        this.p = p;
    }

    public Produto[] getP() {
        return this.p;
    }

    public void setP(Produto[] p) {
        this.p = p;
    }

    public Carrinho p(Produto[] p) {
        this.p = p;
        return this;
    }

    public void remove(int posicao){
        this.p[posicao]=null;
    } 

}