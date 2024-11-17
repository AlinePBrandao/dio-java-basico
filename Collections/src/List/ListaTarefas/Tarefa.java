package List.ListaTarefas;

public class Tarefa {
    //atributo
    private String descricao;

    //construtor recebe descrição
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    //metodo get retorna valor da descrição
    public String getDescricao() {
        return descricao;
    }
    //para exibir descrição do método obterDescricoesTarefas()
    public String toString(){
        return descricao;
    }
}



