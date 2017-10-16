package com.guilhermegonzaga.supermercado.produtos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProdutoComposto implements Produto
{
    private String nome;
    private double preco;

    private List<Produto> produtos = new ArrayList<>();

    public ProdutoComposto(Produto... list)
    {
        produtos.addAll(Arrays.asList(list));
    }

    @Override
    public double getPreco() {
        double total = 0;

        for (Produto p : produtos) {
            total += p.getPreco();
        }

        return total;
    }

    @Override
    public String getNome()
    {
        String n = "";

        for(Produto p:produtos)
        {
            n += p.getNome() + " + ";
        }

        n = n.substring(0, n.length() - 3);

        return n;
    }

    @Override
    public String getAll()
    {
        return getNome() + " | Preço: R$ " + getPreco();
    }
}
