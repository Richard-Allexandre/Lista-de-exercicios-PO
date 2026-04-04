public class Main {
    public static void main(String[] args) {
        // Construtor 1: nome, email e telefone
        Cliente cliente1 = new Cliente("Richard", "richard@email.com", "47999999999");

        // Construtor 2: nome e email
        Cliente cliente2 = new Cliente("Ana", "ana@email.com");

        // Construtor 3: só nome
        Cliente cliente3 = new Cliente("Carlos");

        System.out.println("--- Cliente 1 ---");
        cliente1.exibir();

        System.out.println("--- Cliente 2 ---");
        cliente2.exibir();

        System.out.println("--- Cliente 3 ---");
        cliente3.exibir();

        System.out.println("Total de clientes: " + Cliente.totalClientes);
    }
}
