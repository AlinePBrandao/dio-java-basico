package ServicoMensagem;

import Apps.FacebookMessenger;
import Apps.MSNMessenger;
import Apps.Servico_Mensagem_Instantanea;
import Apps.Telegram;

public class Computador {
    public static void main(String[] args){
        Servico_Mensagem_Instantanea smi = null;
        //não se sabe qual app específico, porém qualquer um deve enviar e receber mensagem
        String appEscolhido= "fcb";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fcb"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi= new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
