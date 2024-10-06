import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o serviço desejado: ");
        String servico = scanner.nextLine().trim(); //trim remove espaços em branco

        System.out.println("Digite o nome do cliente e o serviço contratado: ");
        String entradaCliente = scanner.nextLine().trim();

        String[] partes = entradaCliente.split(","); //separação em partes separado por vírgula
        String nomeCliente = partes[0].trim(); //parte 0 nome cliente
        String servicoContrato = partes[1].trim(); //parte 1 serviço contratado

//      TODO: Verifique se o serviço está na lista de serviços contratados

        boolean contratado = servico.equalsIgnoreCase(servicoContrato); //ignora maiúsculas e minúsculas
        //comparar se serviço (entrada) = serviço Contratado (parte 1)

        if (contratado){
            System.out.println("Cliente contratou o serviço: Sim");
        }
        else {
            System.out.println("Cliente contratou o serviço: Não");
        }
        scanner.close();
    }
}
