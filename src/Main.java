public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2022);
        Carro carro3 = new Carro("Ford", "Ka", 2018);
        Carro carro4 = new Carro("Chevrolet", "Onix", 2021);
        Carro carro5 = new Carro();

        System.out.println("Total de carros criados: " + Carro.totalCarros);
    }
}
