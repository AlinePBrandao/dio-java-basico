public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
    MARANHAO ("MA", "Maranhão"),
    AMAPA ("AP", "Amapá");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }
    public String getSigla(){
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
