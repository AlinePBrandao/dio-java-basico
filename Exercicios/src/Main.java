import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = {"Camila", "Bruno", "Larissa", "Pedro", "Felipe"};

        double media = calculaMediaDaTurma(alunos, sc);
        System.out.printf("Média da turma: %.2f" , media);
    }
    public static double calculaMediaDaTurma(String[] alunos, Scanner sc){
        double soma = 0;
        for (String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = sc.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}