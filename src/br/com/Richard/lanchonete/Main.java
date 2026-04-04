package br.com.Richard.lanchonete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Lanche> cardapio = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== LANCHONETE DO SEU JORGE =====");
            System.out.println("1) Cadastrar lanche no cardápio");
            System.out.println("2) Ver cardápio");
            System.out.println("3) Registrar pedido");
            System.out.println("4) Ver pedidos do dia");
            System.out.println("5) Total de pedidos do dia");
            System.out.println("6) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do lanche: ");
                    String nome = scanner.nextLine();

                    double preco = -1;
                    while (preco < 0) {
                        System.out.print("Preço: R$ ");
                        preco = scanner.nextDouble();
                        scanner.nextLine();
                        if (preco < 0) {
                            System.out.println("Erro: preço não pode ser negativo! Tente novamente.");
                        }
                    }

                    cardapio.add(new Lanche(nome, preco));
                    System.out.println("Lanche cadastrado com sucesso!");
                    break;

                case 2:
                    if (cardapio.isEmpty()) {
                        System.out.println("Nenhum lanche cadastrado no cardápio.");
                    } else {
                        System.out.println("\n===== CARDÁPIO =====");
                        for (int i = 0; i < cardapio.size(); i++) {
                            System.out.print((i + 1) + ") ");
                            cardapio.get(i).exibir();
                        }
                    }
                    break;

                case 3:
                    if (cardapio.isEmpty()) {
                        System.out.println("Nenhum lanche no cardápio. Cadastre um lanche primeiro.");
                        break;
                    }

                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();

                    System.out.println("\n===== CARDÁPIO =====");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.print((i + 1) + ") ");
                        cardapio.get(i).exibir();
                    }

                    int escolha = 0;
                    while (escolha < 1 || escolha > cardapio.size()) {
                        System.out.print("Escolha o número do lanche: ");
                        escolha = scanner.nextInt();
                        scanner.nextLine();
                        if (escolha < 1 || escolha > cardapio.size()) {
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                    }

                    Lanche lancheSelecionado = cardapio.get(escolha - 1);
                    pedidos.add(new Pedido(nomeCliente, lancheSelecionado));
                    System.out.println("Pedido registrado com sucesso!");
                    break;

                case 4:
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido registrado.");
                    } else {
                        System.out.println("\n===== PEDIDOS DO DIA =====");
                        for (int i = 0; i < pedidos.size(); i++) {
                            System.out.println("--- Pedido " + (i + 1) + " ---");
                            pedidos.get(i).exibir();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total de pedidos do dia: " + Lanche.totalPedidos);
                    break;

                case 6:
                    System.out.println("Encerrando o dia. Até amanhã, Seu Jorge!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 6);

        scanner.close();
    }
}

