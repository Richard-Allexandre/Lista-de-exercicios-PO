package br.com.Richard.estacionamento;

public class VagaCarro {
    private String placa;
    private String modelo;

    public VagaCarro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca()  { return placa; }
    public String getModelo() { return modelo; }

    public void exibir() {
        System.out.println("Placa: " + placa + " | Modelo: " + modelo);
    }
}
