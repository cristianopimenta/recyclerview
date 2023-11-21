package br.com.otimizesistemas.recyclerview;

public class Produto {
    private String descricao;
    private float preco;

    public Produto(String descricao, float preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
