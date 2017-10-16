package com.guilhermegonzaga.supermercado.compras;

public class PagamentoCartao implements FormaPagamento
{
    @Override
    public String getDescricao() {
        return "Pagamento com cartão";
    }

    @Override
    public String temDesconto() {
        return "Não";
    }

    @Override
    public String podeParcelar() {
        return "Sim";
    }
}
