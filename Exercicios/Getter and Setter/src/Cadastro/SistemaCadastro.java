package Escola;

public class SistemaCadastro {
    public static void main(String[] args){
        Pessoa felipe = new Pessoa("123", "FELIPE");
        felipe.setEndereco("Rua Oito");

        System.out.println( felipe.getNome() + " - " + felipe.getCpf());
    }
}
