import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1;
        cliente1 = new Cliente(3273737273L, "cliente1", LocalDate.of(1987,7,16));

        Cliente cliente2;
        cliente2 = new Cliente(1823838283L, "cliente2", LocalDate.of(1987,7,16));

        Conta cc = new ContaCorrente(cliente1);
        Conta pp = new Poupanca(cliente2);

        cc.depositar(200.0);
        cc.imprimirExtrato();
        cc.transferir(pp,150.0);
        cc.imprimirExtrato();
        pp.imprimirExtrato();

        System.out.println(cliente1);



    }
}