package br.com.Richard.lanchonete;

public class Pedido {
    private String nomeCliente;
    private Lanche lanche;

    public Pedido(String nomeCliente, Lanche lanche) {
        this.nomeCliente = nomeCliente;
        this.lanche = lanche;
        Lanche.totalPedidos++;
    }

    public String getNomeCliente() { return nomeCliente; }
    public Lanche getLanche()      { return lanche; }

    public void exibir() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Lanche: " + lanche.getNome());
        System.out.printf("Preço: R$ %.2f%n", lanche.getPreco());
    }
}
