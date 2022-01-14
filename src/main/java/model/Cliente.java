package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cliente {
    private String nome;
    private Endereco endereco;
    private List<Conta> contas;

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void imprimirExtratoContas(){
        contas.forEach(Conta::imprimirExtrato);
    }

    public void imprimirExtratoConta(Conta conta){
        Optional<Conta> contaOptional = contas.stream().filter(c -> c.equals(conta)).findFirst();
        if(contaOptional.isPresent())
            contaOptional.get().imprimirExtrato();
        else
            System.out.println("Conta de cliente não encontrada");
    }

    public void imprimirInformacoes(){
        System.out.println("------ Informaçoes Cliente --------");
        System.out.println("Nome: " + getNome() +
                "\n" + getEndereco() +"\n");
        contas.forEach(System.out::println);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
