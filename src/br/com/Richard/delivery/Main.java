package br.com.Richard.delivery;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Marmita> cardapio = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== DELIVERY DA CAMILA =====");
            System.out.printf("Tamanhos: P R$%.2f | M R$%.2f | G R$%.2f%n", Marmita.PRECO_P, Marmita.PRECO_M, Marmita.PRECO_G);
            System.out.println("1) Cadastrar marmita no cardápio");
            System.out.println("2) Ver cardápio");
            System.out.println("3) Registrar pedido");
            System.out.println("4) Ver pedidos do dia");
            System.out.println("5) Total de pedidos e valor vendido");
            System.out.println("6) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da marmita: ");
                    String descricao = scanner.nextLine();

                    String tamanho = "";
                    boolean tamanhoValido = false;
                    while (!tamanhoValido) {
                        System.out.print("Tamanho (P/M/G): ");
                        tamanho = scanner.nextLine().toUpperCase();
                        if (tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G")) {
                            tamanhoValido = true;
                        } else {
                            System.out.println("Tamanho inválido! Digite P, M ou G.");
                        }
                    }

                    cardapio.add(new Marmita(descricao, tamanho));
                    System.out.println("Marmita cadastrada com sucesso!");
                    break;

                case 2:
                    if (cardapio.isEmpty()) {
                        System.out.println("Nenhuma marmita no cardápio.");
                    } else {
                        System.out.println("\n===== CARDÁPIO =====");
                        for (int i = 0; i < cardapio.size(); i++) {
                            System.out.println("--- " + (i + 1) + " ---");
                            cardapio.get(i).exibir();
                        }
                    }
                    break;

                case 3:
                    if (cardapio.isEmpty()) {
                        System.out.println("Nenhuma marmita no cardápio. Cadastre uma primeiro.");
                        break;
                    }

                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();

                    System.out.println("\n===== CARDÁPIO =====");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.println("--- " + (i + 1) + " ---");
                        cardapio.get(i).exibir();
                    }

                    int escolha = 0;
                    boolean escolhaValida = false;
                    while (!escolhaValida) {
                        System.out.print("Escolha o número da marmita: ");
                        escolha = scanner.nextInt();
                        scanner.nextLine();
                        if (escolha < 1 || escolha > cardapio.size()) {
                            System.out.println("Opção inválida! Tente novamente.");
                        } else {
                            escolhaValida = true;
                        }
                    }

                    Marmita marmitaSelecionada = cardapio.get(escolha - 1);
                    pedidos.add(new Pedido(nomeCliente, marmitaSelecionada));
                    System.out.printf("Pedido registrado! Valor: R$ %.2f%n",
                            marmitaSelecionada.getPreco());
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
                    System.out.println("Total de pedidos: " + Pedido.totalPedidos);
                    System.out.printf("Total vendido no dia: R$ %.2f%n", Pedido.getTotalVendido());
                    break;

                case 6:
                    System.out.println("Encerrando o dia. Até amanhã, Camila!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 6);

        scanner.close();
    }
}
