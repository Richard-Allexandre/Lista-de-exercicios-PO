package br.com.Richard.estacionamento;

import java.util.ArrayList;

public class Estacionamento {

    public static final int VAGAS_TOTAIS = 20;

    // static: pertence à classe, controla a lotação geral
    private static ArrayList<VagaCarro> vagas = new ArrayList<>();

    public static boolean entrar(String placa, String modelo) {
        if (vagas.size() >= VAGAS_TOTAIS) {
            System.out.println("Estacionamento lotado! Sem vagas disponíveis.");
            return false;
        }
        vagas.add(new VagaCarro(placa, modelo));
        System.out.println("Carro registrado com sucesso!");
        return true;
    }

    public static boolean sair(String placa) {
        for (VagaCarro v : vagas) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                vagas.remove(v);
                System.out.println("Carro de placa " + placa + " saiu do br.com.Richard.estacionamento.");
                return true;
            }
        }
        System.out.println("Placa não encontrada no br.com.Richard.estacionamento.");
        return false;
    }

    public static void listar() {
        if (vagas.isEmpty()) {
            System.out.println("Nenhum carro no br.com.Richard.estacionamento.");
        } else {
            System.out.println("\n===== CARROS NO ESTACIONAMENTO =====");
            for (int i = 0; i < vagas.size(); i++) {
                System.out.print((i + 1) + ") ");
                vagas.get(i).exibir();
            }
        }
    }

    public static int vagasOcupadas() { return vagas.size(); }
    public static int vagasLivres()   { return VAGAS_TOTAIS - vagas.size(); }
}
