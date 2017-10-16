package com.guilhermegonzaga.supermercado.clientes;

public class ClienteBuilder
{
    private Cliente cliente;

    public ClienteBuilder novoCliente()
    {
        cliente = new Cliente();

        return this;
    }

    public ClienteBuilder chamado(String nome)
    {
        cliente.setNome(nome);

        return this;
    }

    public ClienteBuilder moraEm(String cidade)
    {
        cliente.setCidade(cidade);

        return this;
    }

    public Cliente builder()
    {
        return this.cliente;
    }
}
