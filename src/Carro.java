public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    /*
     * Exercício 5 – Construtor parametrizado
     * Vantagem de usar construtor em vez de setters um por um:
     * - O objeto já nasce com todos os dados em UMA linha
     * - Evita esquecer de setar algum atributo
     * - O código fica mais limpo e legível
     */
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
    }
    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
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

