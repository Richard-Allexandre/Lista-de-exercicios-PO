package br.com.Richard.delivery;

public class Marmita {
    // final: preços fixos nunca mudam
    public static final double PRECO_P = 18.00;
    public static final double PRECO_M = 25.00;
    public static final double PRECO_G = 32.00;

    private String descricao;
    private String tamanho;
    private double preco;

    public Marmita(String descricao, String tamanho) {
        this.descricao = descricao;
        setTamanho(tamanho);
    }

    public String getDescricao() { return descricao; }
    public String getTamanho()   { return tamanho; }
    public double getPreco()     { return preco; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    // Validação: tamanho só pode ser P, M ou G
    public void setTamanho(String tamanho) {
        switch (tamanho.toUpperCase()) {
            case "P":
                this.tamanho = "P";
                this.preco = PRECO_P;
                break;
            case "M":
                this.tamanho = "M";
                this.preco = PRECO_M;
                break;
            case "G":
                this.tamanho = "G";
                this.preco = PRECO_G;
                break;
            default:
                System.out.println("Erro: tamanho inválido! Use P, M ou G.");
                this.tamanho = "";
                this.preco = 0;
        }
    }

    public void exibir() {
        System.out.println("Descrição: " + descricao);
        System.out.printf("Tamanho: %s | Preço: R$ %.2f%n", tamanho, preco);
    }
}
