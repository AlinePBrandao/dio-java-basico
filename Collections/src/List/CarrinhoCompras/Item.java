package List.CarrinhoCompras;

//ATRIBUTOS
public class Item {
    private String nome;
    private double preco;
    private int quant;

    //CONSTRUTOR
    public Item(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }

    @Override
    public String toString() {
       return "Item: " + "nome = " + nome + ", preço = " + preco + ", quantidade = " + quant + "." + "\n"; //quabra de linha \n
    }
}

