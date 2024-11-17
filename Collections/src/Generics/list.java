package Generics;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1"); //adiciona string
        listaSemGenerics.add(10); //adiciona int
        // Permite adicionar qualquer tipo de objeto

        // Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>(); //especifica o tipo de elemento permitido na lista <String>
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        } //passa e imprime

        // Iterando sobre a lista sem Generics (necessário fazer cast)
        for (Object elemento : listaSemGenerics) { //necessário fazer casting desvido a tipos difeentes de dados
            String str = (String) elemento;
            System.out.println(str);
        } //necessário especificar o tipo do elemento
    }
}
