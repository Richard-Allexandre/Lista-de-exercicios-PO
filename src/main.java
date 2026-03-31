public class  main {
    public static void main(String[] arges) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2022;


        // criando o carro2
        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2020;

        // exibir() é void - só chamar, não guardar resultado
        System.out.println(" === Carro 1 ===");
        carro1.exibir();

        // idadeDoCarro() tem retorno - posso guardar uma variavel
        int idade1 = carro1.idadeDoCarro();
        System.out.println("Idade: " + idade1 + " anos");

        System.out.println("=== Carro 2 ===");
        carro2.exibir();

        System.out.println("Idade: " + carro2.idadeDoCarro() + " anos"); // retorno do usado direto
        System.out.println("Ano: " + carro1.ano);
    }
}
