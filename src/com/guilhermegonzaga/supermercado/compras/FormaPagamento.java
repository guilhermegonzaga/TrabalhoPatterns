package com.guilhermegonzaga.supermercado.compras;

public interface FormaPagamento
{
    public String getDescricao();
    public String temDesconto();
    public String podeParcelar();
}
