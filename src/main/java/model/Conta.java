package model;

public abstract class Conta implements IConta{
    protected String agencia;
    protected String id;
    protected Double saldo;

    @Override
    public void sacar(double valor) {
        if( saldo - valor < 0 ){
            System.out.println("Erro ao efetuar saque\nSaldo total é inferior ao valor de saque");
        }else{
            saldo -= valor;
            System.out.println("Saque feito com sucesso");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if( saldo - valor < 0 ){
            System.out.println("Erro ao efetuar transferencia\nSaldo total é inferior ao valor de digitado");
        }else{
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferencia feita com sucesso");
        }
    }

    abstract void imprimirExtrato();

    protected void imprimirInformacoesExtrato(){
        System.out.println("Agencia: " + agencia +
                "\nConta: " + id +
                "\nSaldo: " + saldo );
    }


}
