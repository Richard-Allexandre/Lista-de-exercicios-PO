package br.com.Richard.locadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Filme> acervo = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== LOCADORA DO MARCOS =====");
            System.out.println("Filmes no acervo: " + Filme.totalFilmes);
            System.out.println("1) Cadastrar filme");
            System.out.println("2) Listar filmes");
            System.out.println("3) Total de filmes");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();

                    // Validação do ano
                    int ano = 0;
                    boolean anoValido = false;
                    while (!anoValido) {
                        System.out.print("Ano (" + Filme.ANO_PRIMEIRO_FILME + " a 2026): ");
                        ano = scanner.nextInt();
                        scanner.nextLine();
                        if (ano < Filme.ANO_PRIMEIRO_FILME || ano > 2026) {
                            System.out.println("Ano inválido! Tente novamente.");
                        } else {
                            anoValido = true;
                        }
                    }

                    acervo.add(new Filme(titulo, genero, ano));
                    System.out.println("Filme cadastrado com sucesso!");
                    break;

                case 2:
                    if (acervo.isEmpty()) {
                        System.out.println("Nenhum filme cadastrado no acervo.");
                    } else {
                        System.out.println("\n===== ACERVO =====");
                        for (int i = 0; i < acervo.size(); i++) {
                            System.out.println("--- Filme " + (i + 1) + " ---");
                            acervo.get(i).exibir();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Total de filmes no acervo: " + Filme.totalFilmes);
                    break;

                case 4:
                    System.out.println("Encerrando o sistema. Até mais, Marcos!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
