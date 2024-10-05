import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Candidatura {
    public static void main(String[] args) {
//        selecaoCandidatos();
//        imprimirSelecionados();
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabrício", "Mirela", "Daniela"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = antender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");

        }while (continuarTentando && tentativasRealizadas<3);

        if (atendeu)
            System.out.printf("Conseguimos contato com %s na %d tentativa", candidato, tentativasRealizadas);
        else
            System.out.printf("Não conseguimos contato com %s, número máximo de tentativas %d realizada", candidato, tentativasRealizadas);
    }

    //método auxiliar
    static boolean antender(){
        return  new Random().nextInt(3)==1;
    }


    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabrício", "Mirela", "Daniela"};
        System.out.println("Imprimindo a lista de candidatos informando seu índice: ");
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice+1) + " é: " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {

        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabrício", "Mirela", "Daniela"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s selecionou o salário: %.2f. %n", candidato, salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.printf("O candidato %s foi selecionado para a vaga. %n", candidato);
                candidatosSelecionados++;
            }
            else {
                System.out.println("Candidato não selecionado.");
            }
            candidatoAtual++;
        }
    }
    
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
    }

    static void analisarCandidato(double salarioPretendido){

        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com uma proposta");
        }
        else{
            System.out.println("Aguardar resultado dos demais candidatos");
        }
    }

}