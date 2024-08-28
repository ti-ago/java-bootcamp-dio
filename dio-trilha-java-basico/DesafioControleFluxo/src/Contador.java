import java.util.Scanner;
public class Contador {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = scanner.nextInt();

        try{
            contar(n1, n2);
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        scanner.close();
    }
    static void contar(int n1, int n2) throws ParametrosInvalidosException{
        if(n2<n1){
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }else{
            for(int i = 0; i <= (n2-n1); i++){
                System.out.println(i+1);
            }
        }
    }
}
