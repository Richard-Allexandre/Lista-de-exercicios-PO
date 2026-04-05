package br.com.Richard.delivery;

public class Pedido {
    // static: contador de pedidos do dia
    public static int totalPedidos = 0;

    // static: acumulador do total vendido
    private static double totalVendido = 0;

    private String nomeCliente;
    private Marmita marmita;

    public Pedido(String nomeCliente, Marmita marmita) {
        this.nomeCliente = nomeCliente;
        this.marmita = marmita;
        totalPedidos++;
        totalVendido += marmita.getPreco();
    }

    public String getNomeCliente() { return nomeCliente; }
    public Marmita getMarmita()    { return marmita; }

    // Método com retorno: retorna o total vendido no dia
    public static double getTotalVendido() {
        return totalVendido;
    }

    public void exibir() {
        System.out.println("Cliente: " + nomeCliente);
        marmita.exibir();
    }
}
