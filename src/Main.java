import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2022);
        Carro carro3 = new Carro("Ford", "Ka", 2018);

        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        for (Carro carro : carros) {
            System.out.println("=== Carro ===");
            carro.exibir();
            System.out.println("Idade: " + carro.idadeDoCarro() + " anos");
            System.out.println();
        }
    }
}
