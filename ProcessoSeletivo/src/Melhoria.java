import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

    public class Melhoria {
        public static void main(String[] args) {
            List<Candidato> candidatosSelecionados = selecaoCandidatos();
            imprimirCandidatosSelecionados(candidatosSelecionados);
        }

        // Método para selecionar candidatos
        static List<Candidato> selecaoCandidatos() {

            String[] nomes = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabrício", "Mirela", "Daniela"};
            List<Candidato> candidatosSelecionados = new ArrayList<>();
            int candidatoAtual = 0;
            double salarioBase = 2000.00;

            while (candidatosSelecionados.size() < 5 && candidatoAtual < nomes.length) {
                String nomeCandidato = nomes[candidatoAtual];
                double salarioPretendido = valorPretendido();

                System.out.printf("O candidato %s selecionou o salário: %.2f. %n", nomeCandidato, salarioPretendido);

                if (salarioBase >= salarioPretendido) {
                    System.out.printf("O candidato %s foi selecionado para a vaga. %n", nomeCandidato);
                    candidatosSelecionados.add(new Candidato(nomeCandidato, candidatoAtual));
                } else {
                    System.out.println("Candidato não selecionado.");
                }
                candidatoAtual++;
            }

            return candidatosSelecionados;
        }

        // Método para gerar valor pretendido
        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
        }

        // Método para imprimir os candidatos selecionados
        static void imprimirCandidatosSelecionados(List<Candidato> candidatosSelecionados) {
            System.out.println("\nLista de candidatos selecionados:");
            for (Candidato candidato : candidatosSelecionados) {
                System.out.printf("Candidato: %s, Posição: %d %n", candidato.getNome(), candidato.getPosicao());
            }
        }
    }

    // Classe Candidato
    class Candidato {
        private String nome;
        private int posicao;

        public Candidato(String nome, int posicao) {
            this.nome = nome;
            this.posicao = posicao;
        }

        public String getNome() {
            return nome;
        }

        public int getPosicao() {
            return posicao;
        }
    }

