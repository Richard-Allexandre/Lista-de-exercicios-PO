package br.com.Richard.academia;

public class Aluno {
    // final: limite máximo nunca muda
    public static final int LIMITE_ALUNOS = 50;

    // static: contador compartilhado por todos os objetos
    public static int totalAlunos = 0;

    private String nome;
    private int idade;
    private String plano;

    public Aluno(String nome, int idade, String plano) {
        this.nome = nome;
        setIdade(idade);
        this.plano = plano;
        totalAlunos++;
    }

    public String getNome()  { return nome; }
    public int getIdade()    { return idade; }
    public String getPlano() { return plano; }

    public void setNome(String nome)   { this.nome = nome; }
    public void setPlano(String plano) { this.plano = plano; }

    // Validação: idade mínima é 14 anos
    public void setIdade(int idade) {
        if (idade < 14) {
            System.out.println("Erro: idade mínima é 14 anos!");
            this.idade = 0;
        } else {
            this.idade = idade;
        }
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Plano: " + plano);
    }
}
