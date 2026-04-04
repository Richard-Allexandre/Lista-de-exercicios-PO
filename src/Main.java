import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // a) ArrayList para armazenar os carros
        ArrayList<Carro> carros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1) Cadastrar Carro");
            System.out.println("2) Listar todos");
            System.out.println("3) Total cadastrado");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    // c) usando construtor para criar o objeto
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();

                    // e) validação de ano usando a constante final
                    int ano = 0;
                    boolean anoValido = false;
                    while (!anoValido) {
                        System.out.print("Ano (" + Carro.ANO_PRIMEIRO_CARRO + " a 2026): ");
                        ano = scanner.nextInt();
                        scanner.nextLine();
                        if (ano >= Carro.ANO_PRIMEIRO_CARRO && ano <= 2026) {
                            anoValido = true;
                        } else {
                            System.out.println("Ano inválido! Tente novamente.");
                        }
                    }

                    Carro novoCarro = new Carro(marca, modelo, ano);
                    carros.add(novoCarro);
                    System.out.println("Carro cadastrado com sucesso!");
                    break;

                case 2:
                    if (carros.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado.");
                    } else {
                        System.out.println("\n===== LISTA DE CARROS =====");
                        for (Carro carro : carros) {
                            carro.exibir();
                            System.out.println("Idade: " + carro.idadeDoCarro() + " anos");
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 3:
                    // d) usando Carro.totalCarros (static)
                    Carro.imprimirTotal();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}