package List.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //ATRIBUTO
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }
    //METODOS

    public void adicionarItem(String nome, double preco, int quant) {
        Item item = new Item(nome, preco, quant);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }
        else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList){
                double valorItem = item.getPreco() * item.getQuant();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        }
        else {
            throw new RuntimeException(" A lista está vazia!");
        }
    }

    public void exibirItens(){
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                System.out.print(item); //exibe sem , no início da linha
                // System.out.println(this.itemList);
            }
        }
        else {
            System.out.println(" A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras {" + "itens = }" + itemList;
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 5);

        carrinhoDeCompras.exibirItens();

        System.out.println();

        carrinhoDeCompras.removerItem("Lápis");

        carrinhoDeCompras.exibirItens();

        System.out.println();
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}

