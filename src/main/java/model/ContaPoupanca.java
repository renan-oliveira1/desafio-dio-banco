package model;

import java.util.UUID;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String agencia) {
        this.agencia = agencia;
        this.id = UUID.randomUUID().toString();
        this.saldo = 0.0;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("----- Extrato Conta Poupança ----");
        imprimirInformacoesExtrato();
        System.out.println("---------------------------------");
    }

    @Override
    public String toString() {
        return "Conta Poupanca - " +
                "Agencia: " + agencia + '\'' +
                "| Id: " + id;
    }
}
