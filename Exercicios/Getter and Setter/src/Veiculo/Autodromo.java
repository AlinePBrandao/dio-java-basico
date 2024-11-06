package Veiculo;

public class Autodromo {
    public static void main (String[] args){
        Carro jeep = new Carro();
        jeep.setChassi("123456");
        //jeep.ligar();

        Moto bibi = new Moto();
        bibi.setChassi("654321");
        //bibi.ligar();

        Veiculo coringa = bibi;
        coringa.ligar();

        Veiculo coringa1 = jeep;
        coringa1.ligar();
    }
}
