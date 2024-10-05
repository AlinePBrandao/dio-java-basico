import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidade = parametro2 - parametro1;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}