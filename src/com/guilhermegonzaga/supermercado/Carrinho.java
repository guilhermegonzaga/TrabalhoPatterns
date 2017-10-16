package com.guilhermegonzaga.supermercado;

import com.guilhermegonzaga.supermercado.produtos.Produto;
import java.util.ArrayList;
import java.util.List;

public class Carrinho
{
    private List<Produto> produtos = new ArrayList<>();
    private double total = 0;

    public void addProduto(Produto produto)
    {
        this.produtos.add(produto);
        total += produto.getPreco();
    }

    public List<Produto> getProdutos()
    {
        return produtos;
    }

    public void imprimeCarrinho()
    {
        System.out.println("_______________________________________");
        System.out.println("         Carrinho de compras");
        System.out.println("_______________________________________");

        for(Produto p:produtos)
        {
            System.out.println(p.getAll());
        }

        System.out.println("_______________________________________");
        System.out.println("Total: " + getTotal());
        System.out.println("_______________________________________");
    }

    public double getTotal()
    {
        return total;
    }
}
