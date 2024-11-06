package Apps;

public abstract class Servico_Mensagem_Instantanea {
    public abstract void enviarMensagem(); //métodos abstratos que não tem corpo
    public abstract void receberMensagem();

    //somente os filhos conhecem este método
    protected void validarConexao(){
        System.out.println("Validando conexão com a Internet");
    }
}
