
package br.com.empresa.exemploraissa001_poo;

public class Impressora  {
    String cor;
    int quantidade;
    int quantidadeEstoque;

    public Impressora() {
        
    }

    public Impressora(String cor, int quantidade) {
        //this.nome = "Impressora";
        this.cor = cor;
        this.quantidade = quantidade;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Impressora cor(String cor) {
        this.cor = cor;
        return this;
    }

    public Impressora quantidade(int quantidade) {
        this.quantidade = quantidade;
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
        //resultado += " nome='" + getNome() + "'";
        //resultado += " preço='" + getPreco() + "'";
        resultado += " cor='" + getCor()+ "'";
        resultado += " quantidade='" + getQuantidade()+ "'";
        resultado += " quantidadeEstoque='" + getQuantidadeEstoque() + "'";
        return resultado;

    }


    
}