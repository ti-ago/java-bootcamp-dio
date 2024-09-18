public abstract class Conta {

    private static int SEQUENCIAL = 1;

    protected Integer numero;
    protected Double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.saldo = 0d;
        numero = SEQUENCIAL ++;
        this.cliente = cliente;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    public void transferir(Conta contaDestino, Double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    abstract protected void imprimirExtrato();

    protected void extrato() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Conta : " + numero +
                "\nSaldo : " + saldo +
                "\nCliente : " + cliente.getNome() +
                "\nCPF : " + cliente.getCpf();
    }
}
