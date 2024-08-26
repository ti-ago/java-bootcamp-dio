import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia, cliente;
        float saldo;

        System.out.println("Informe o número da conta");
        numero = scanner.nextInt();
        System.out.println("Informe a agência no seguinte formato XXXX-X");
        agencia = scanner.next();
        System.out.println("Informe o nome do cliente");
        scanner.nextLine();
        cliente = scanner.nextLine(); 
        System.out.println("Informe o valor do depósito inicial");
        saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo $%.2f já está disponível para saque.\n", cliente, agencia, numero, saldo);
    }
}
