public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    int idadeDoCarro() {
        return 2026 - ano;
    }

}

