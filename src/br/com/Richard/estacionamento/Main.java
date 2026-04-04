package br.com.Richard.estacionamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== ESTACIONAMENTO DO CARLÃO =====");
            System.out.println("Vagas ocupadas: " + Estacionamento.vagasOcupadas() +
                    " | Vagas livres: " + Estacionamento.vagasLivres());
            System.out.println("1) Registrar entrada");
            System.out.println("2) Registrar saída");
            System.out.println("3) Ver carros no br.com.Richard.estacionamento");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Placa do carro: ");
                    String placa = scanner.nextLine();
                    System.out.print("Modelo do carro: ");
                    String modelo = scanner.nextLine();
                    Estacionamento.entrar(placa, modelo);
                    break;

                case 2:
                    System.out.print("Placa do carro que saiu: ");
                    String placaSaida = scanner.nextLine();
                    Estacionamento.sair(placaSaida);
                    break;

                case 3:
                    Estacionamento.listar();
                    break;

                case 4:
                    System.out.println("Encerrando o sistema. Até mais, Carlão!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
