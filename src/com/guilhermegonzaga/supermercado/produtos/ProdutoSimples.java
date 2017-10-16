package com.guilhermegonzaga.supermercado.produtos;

public class ProdutoSimples implements Produto
{
    private String nome;
    private double preco;

    public ProdutoSimples(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome()
    {
        return nome;
    }

    @Override
    public double getPreco()
    {
        return preco;
    }

    @Override
    public String getAll()
    {
        return getNome() + " | Preço: R$ " + getPreco();
    }
}
