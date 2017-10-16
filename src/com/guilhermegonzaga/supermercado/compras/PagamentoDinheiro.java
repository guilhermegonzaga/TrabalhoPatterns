package com.guilhermegonzaga.supermercado.compras;

public class PagamentoDinheiro implements FormaPagamento
{
    @Override
    public String getDescricao() {
        return "Pagamento em dinheiro";
    }

    @Override
    public String temDesconto() {
        return "Sim";
    }

    @Override
    public String podeParcelar() {
        return "Não";
    }
}
