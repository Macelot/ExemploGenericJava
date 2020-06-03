
package br.com.empresa.exemploraissa001_poo;

public class Mouse {
    String tipo;
    String cor;
    int quantidadeEstoque;


    public Mouse() {
       
    }

    public Mouse(String tipo, String cor) {
        //this.nome = "Mouse";
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Mouse tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Mouse cor(String cor) {
        this.cor = cor;
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
        resultado += " tipo='" + getTipo()+ "'";
        resultado += " cor='" + getCor()+ "'";
        resultado += " quantidadeEstoque='" + getQuantidadeEstoque() + "'";
        return resultado;

    }

    
}