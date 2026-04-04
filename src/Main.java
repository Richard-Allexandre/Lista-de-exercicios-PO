public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);

        System.out.println("Ano do primeiro carro: " + Carro.ANO_PRIMEIRO_CARRO);
        carro1.exibir();
    }
}
