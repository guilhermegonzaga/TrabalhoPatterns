package com.guilhermegonzaga.supermercado.compras;

import com.guilhermegonzaga.supermercado.Carrinho;
import com.guilhermegonzaga.supermercado.clientes.Cliente;

public class Pagamento
{
    private Cliente cliente;
    private FormaPagamento formaPagamento;
    private Carrinho carrinho;

    public Pagamento(Cliente cliente, FormaPagamento formaPagamento, Carrinho carrinho)
    {
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.carrinho = carrinho;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento)
    {
        this.formaPagamento = formaPagamento;
    }

    public FormaPagamento getFormaPagamento()
    {
        return this.formaPagamento;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public Carrinho getCarrinho()
    {
        return carrinho;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public double getValorTotal()
    {
        return carrinho.getTotal();
    }

    public void imprimePagamento()
    {
        System.out.println("_______________________________________");
        System.out.println("              Pagamento");
        System.out.println("_______________________________________");

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Forma de pagamento: " + formaPagamento.getDescricao());
        System.out.println("Quantidade de produtos: " + carrinho.getProdutos().size());
        System.out.println("Pode ter desconto? " + formaPagamento.temDesconto());
        System.out.println("Pode parcelar? " + formaPagamento.podeParcelar());

        System.out.println("_______________________________________");
        System.out.println("Total: " + getValorTotal());
        System.out.println("_______________________________________");
    }
}
