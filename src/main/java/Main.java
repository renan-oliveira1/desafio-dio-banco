import model.*;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Nestor", "Planalto", "Minas Gerais", "Minas Gerais");
        Cliente cliente = new Cliente("Gabriel Tadr", endereco);
        ContaCorrente contaCorrente = new ContaCorrente("1");
        ContaPoupanca contaPoupanca = new ContaPoupanca("2");
        Banco banco = new Banco("Santrr");

        contaPoupanca.depositar(100);
        contaCorrente.depositar(120);
        cliente.adicionarConta(contaCorrente);
        cliente.adicionarConta(contaPoupanca);

        banco.adicionarCliente(cliente);
        banco.exibirClientes();
        cliente.imprimirInformacoes();
        cliente.imprimirExtratoContas();

        cliente.imprimirExtratoConta(contaCorrente);

    }
}
