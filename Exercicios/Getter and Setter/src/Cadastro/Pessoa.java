package Cadastro;

public class Pessoa {

        private String nome;
        private String cpf;
        private String endereco;

        //método construtor
        //o nome deverá ser igual ao nome da classe
        public Pessoa (String cpf, String nome){ //toda vez que uma pessoa for criada, automaticamente será solicitado cpf e nome
                this.cpf = cpf; //
                this.nome = nome;
        }

        public String getNome(){
                return nome;
        }
        public String getCpf(){
                return cpf;
        }
        public String getEndereco(){
                return endereco;
        }
        public void setEndereco(String newEndereco) {
                endereco = newEndereco;
        }
}