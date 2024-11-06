package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public static void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche natural");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcão");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    public void prepararLanche(){
        System.out.println("Preparando lanche tipo");
    }
    public void prepararVitamina(){
        System.out.println("Preparando vitamina");
    }
    public void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    public void selecionarIngredientesLanche(){
        System.out.println("Selecionando os ingredientes: Pão, Salada, Carne, Ovo");
    }
    public void selecionarIngredientesVitamina(){
        System.out.println("Selecionando os ingredientes: Fruta, Leite, Gelo");
    }
}