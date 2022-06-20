package Ex10;

public class Conta {

    private String nomeCliente;
    private int numConta;
    private int saldo;

    public Conta(String nomeCliente, int numConta, int saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public Conta() {

    }

    public int depositar(int deposito) {
        this.saldo += deposito;
        return saldo;
    }

    public int sacar(int saque) {
        if (saque <= this.saldo && saque >= 0) {
            this.saldo -= saque;
        } else {
            System.out.println("Saldo insuficiente ou operação inválida.");
        }
        return saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
