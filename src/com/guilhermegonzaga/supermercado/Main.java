package com.guilhermegonzaga.supermercado;

import com.guilhermegonzaga.supermercado.clientes.Cliente;
import com.guilhermegonzaga.supermercado.clientes.ClienteBuilder;
import com.guilhermegonzaga.supermercado.compras.*;
import com.guilhermegonzaga.supermercado.produtos.*;

public class Main
{
    public static void main(String[] args)
    {
        Produto sorvete = new ProdutoSimples("Sorvete", 14.99);
        Produto calda = new ProdutoSimples("Calda de chocolate", 8.70);
        Produto granulado = new ProdutoSimples("Granulado", 4.28);

        Produto pacote = new ProdutoComposto(sorvete, calda, granulado);
        System.out.println(pacote.getAll());

        Produto arroz = new ProdutoSimples("Arroz", 12.50);
        Produto feijao = new ProdutoSimples("Feijão", 9.60);
        Produto carne = new ProdutoSimples("Picanha", 25.34);

        Produto kit = new ProdutoComposto(arroz, feijao);

        Carrinho carrinho = new Carrinho();
        carrinho.addProduto(kit);
        carrinho.addProduto(carne);

        carrinho.imprimeCarrinho();

        FormaPagamento cartao = new PagamentoCartao();
        FormaPagamento dinheiro = new PagamentoDinheiro();

        Cliente cliente = new ClienteBuilder().novoCliente().chamado("Guilherme Gonzaga").moraEm("Patos de Minas").builder();

        Pagamento pagamento = new Pagamento(cliente, cartao, carrinho);
        pagamento.imprimePagamento();
    }
}
