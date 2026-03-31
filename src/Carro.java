public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    // metodo 1 - void (só executa, não devolve nada)
    void  exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // metodo 2 - com retorno int (devolve um numero)
    int idadeDoCarro() {
        return 2026 - ano;
    }
}

