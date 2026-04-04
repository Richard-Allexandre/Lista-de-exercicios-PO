public class Main {
    public static void main(String[] args) {
        //Exercício 10a – código original NÃO compila:
        //if (true) {
        // int x = 10;
        // }
        // System.out.println(x); // ERRO: cannot find symbol 'x'
        // O que acontece? Dá erro de compilação.
        // O Java não encontra a variável x fora do bloco if.
        // Exercício 10c – o que é escopo?
        // Escopo é a região do código onde uma variável existe e pode ser usada.
        // Uma variável declarada dentro de um bloco { } só vive dentro dele.
        // Ao fechar o }, a variável é destruída e não pode mais ser acessada.
        // Por isso o x declarado dentro do if não existia fora dele.

        // Exercício 10 correção: declarar x antes do bloco if
        int x;
        if (true) {
            x = 10;
        } else {
            x = 0;
        }
        System.out.println("x = " + x);
    }
}
