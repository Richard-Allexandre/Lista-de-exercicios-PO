package br.com.Richard.academia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== ACADEMIA DA FERNANDA =====");
            System.out.println("Alunos matriculados: " + Aluno.totalAlunos +
                    " | Vagas disponíveis: " + (Aluno.LIMITE_ALUNOS - Aluno.totalAlunos));
            System.out.println("1) Matricular aluno");
            System.out.println("2) Listar alunos");
            System.out.println("3) Total de alunos");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Verifica se atingiu o limite
                    if (Aluno.totalAlunos >= Aluno.LIMITE_ALUNOS) {
                        System.out.println("Academia lotada! Limite de " + Aluno.LIMITE_ALUNOS + " alunos atingido.");
                        break;
                    }

                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();

                    // Validação de idade
                    int idade = 0;
                    boolean idadeValida = false;
                    while (!idadeValida) {
                        System.out.print("Idade (mínimo 14 anos): ");
                        idade = scanner.nextInt();
                        scanner.nextLine();
                        if (idade < 14) {
                            System.out.println("Erro: idade mínima é 14 anos! Tente novamente.");
                        } else {
                            idadeValida = true;
                        }
                    }

                    // Validação do plano
                    String plano = "";
                    boolean planoValido = false;
                    while (!planoValido) {
                        System.out.print("Plano (mensal/anual): ");
                        plano = scanner.nextLine().toLowerCase();
                        if (plano.equals("mensal") || plano.equals("anual")) {
                            planoValido = true;
                        } else {
                            System.out.println("Plano inválido! Digite mensal ou anual.");
                        }
                    }

                    alunos.add(new Aluno(nome, idade, plano));
                    System.out.println("Aluno matriculado com sucesso!");
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno matriculado.");
                    } else {
                        System.out.println("\n===== LISTA DE ALUNOS =====");
                        for (int i = 0; i < alunos.size(); i++) {
                            System.out.println("--- Aluno " + (i + 1) + " ---");
                            alunos.get(i).exibir();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Total de alunos matriculados: " + Aluno.totalAlunos);
                    break;

                case 4:
                    System.out.println("Encerrando o sistema. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
