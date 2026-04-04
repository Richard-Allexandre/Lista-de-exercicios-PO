package br.com.Richard.locadora;

public class Filme {
    // final: ano do primeiro filme da história nunca muda
    public static final int ANO_PRIMEIRO_FILME = 1895;

    // static: contador do acervo
    public static int totalFilmes = 0;

    private String titulo;
    private String genero;
    private int ano;

    public Filme(String titulo, String genero, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        setAno(ano);
        totalFilmes++;
    }

    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public int getAno()       { return ano; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setGenero(String genero) { this.genero = genero; }

    // Validação: ano não pode ser menor que 1895 nem maior que 2026
    public void setAno(int ano) {
        if (ano < ANO_PRIMEIRO_FILME || ano > 2026) {
            System.out.println("Erro: ano inválido! Deve ser entre " + ANO_PRIMEIRO_FILME + " e 2026.");
            this.ano = 0;
        } else {
            this.ano = ano;
        }
    }

    // Método com retorno: diz se o filme é clássico ou recente
    public String classificar() {
        if (ano < 2000) {
            return "Clássico";
        } else {
            return "Recente";
        }
    }

    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Classificação: " + classificar());
    }
}
