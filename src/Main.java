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

        System.out.println("=== Carro 1 ===");
        carro1.exibir();
        int idade1 = carro1.idadeDoCarro();
        System.out.println("Idade do carro: " + idade1 + " anos");



        System.out.println();


        System.out.println("=== Carro 2 ===");
        carro1.exibir();
        System.out.println("Idade do carro: " + carro2.idadeDoCarro() + " anos");
    }

}
