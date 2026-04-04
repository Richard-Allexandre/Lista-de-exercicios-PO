public class Carro {

    public static int totalCarros;
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
        totalCarros++;
    }
    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }

    public String getMarca()  { return marca; }
    public String getModelo() { return modelo; }
    public int getAno()       { return ano; }

    public void setMarca(String marca)   { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("Erro: ano inválido! Deve ser entre 1886 e 2026.");
        } else {
            this.ano = ano;
        }
    }
    public void exibir() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
    }
    public int idadeDoCarro() {
        return 2026 - getAno();
    }
}

