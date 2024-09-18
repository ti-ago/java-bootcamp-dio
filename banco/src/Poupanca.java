public class Poupanca extends Conta{

    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== CONTA POUPANÇA ===");
        this.extrato();
    }
}
