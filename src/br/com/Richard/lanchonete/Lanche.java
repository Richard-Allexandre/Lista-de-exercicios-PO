package br.com.Richard.lanchonete;

public class Lanche {
    public static int totalPedidos = 0;

    private String nome;
    private double preco;

    public Lanche(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome()  { return nome; }
    public double getPreco() { return preco; }

    public void setNome(String nome) { this.nome = nome; }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro: preço não pode ser negativo!");
        } else {
            this.preco = preco;
        }
    }

    public void exibir() {
        System.out.printf("%-20s R$ %.2f%n", nome, preco);
    }
}
