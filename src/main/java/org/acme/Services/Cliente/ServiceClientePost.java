package org.acme.Services.Cliente;

import org.acme.Model.Cliente;

public class ServiceClientePost {
    
    public Cliente execute(Cliente c) {

        //BANCO DE DADOS
        Cliente cliente = new Cliente();
        cliente.setId(c.getId());
        cliente.setNome(c.getNome());
        return cliente;
    }
}
