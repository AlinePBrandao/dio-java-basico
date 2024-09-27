import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.next();

        System.out.println("Digite seu Nome: ");
        String cliente = sc.next();

        System.out.println("Digite o Saldo em Conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua Agência é: " + agencia + ", Conta: " + conta);
        System.out.println("Seu saldo: " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
