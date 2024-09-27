import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Salário do Candidato: ");
        double salarioPretendido = sc.nextDouble();

        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato e fazer uma proposta");
        }
        else{
            System.out.println("Aguardar resultado dos demais candidatos");
        }
        sc.close();
    }
}