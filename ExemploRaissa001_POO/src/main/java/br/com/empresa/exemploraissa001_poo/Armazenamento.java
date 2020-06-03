package br.com.empresa.exemploraissa001_poo;

public class Armazenamento extends Produto {
    int capacidade;
    String unidade;
    
    public Armazenamento() {
        this.capacidade = 1;
        this.unidade="Byte";
    }

    public Armazenamento(int capacidade, String unidade) {
        this.capacidade = capacidade;
        this.unidade = unidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getUnidade() {
        return this.unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Armazenamento capacidade(int capacidade) {
        this.capacidade = capacidade;
        return this;
    }

    public Armazenamento unidade(String unidade) {
        this.unidade = unidade;
        return this;
    }

    @Override
    public String toString(){
        String resultado="";
        resultado += " nome='" + getNome() + "'";
        resultado += " preço='" + getPreco() + "'";
        resultado += " capacidade='" + getCapacidade() + "'";
        resultado += " unidade='" + getUnidade() + "'";
        return resultado;

    }
    
    //@Override
    //public String toString() {
    //    return "{" +
    //        " capacidade='" + getCapacidade() + "'" +
    //       ", unidade='" + getUnidade() + "'" +
    //        "}";
    //}
    
    

    
}