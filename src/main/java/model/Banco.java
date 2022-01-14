package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public Banco(String nome){
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public void exibirClientes(){
        System.out.println("--------- Clientes do Banco: " + this.nome + " ---------");
        clientes.forEach(cliente -> System.out.println(cliente.getNome()));
    }
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente){
        clientes.remove(cliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
