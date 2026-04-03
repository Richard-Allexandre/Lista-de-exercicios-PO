import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2020;

        Carro carro3 = new Carro();
        carro3.marca = "Ford";
        carro3.modelo = "Ka";
        carro3.ano = 2017;

        System.out.println("=== Teste de validação ===");
        carro1.setAno(1500);
        carro1.setAno(3000);
        System.out.println();

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
