public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fiat", "Uno", 2020);
        Carro c2 = c1;
        c2.setModelo("Palio");
        System.out.println(c1.getModelo());
        System.out.println(c2.getModelo());

         // Exercício 12a – modelo de c1 e c2:
        // c1 = Palio
        // c2 = Palio
        // Exercício 12b – por que alterar c2 mudou c1?
        // Porque c2 = c1 não cria um objeto novo — copia a REFERÊNCIA (endereço).
        // c1 e c2 apontam para o MESMO objeto na memória.
        // Qualquer alteração via c2 afeta o mesmo objeto que c1 enxerga.
        // O que eles compartilham: o mesmo endereço de memória no heap.
        // Exercício 12c – diferença entre exercício 11 (int) e exercício 12 (Carro):
        // STACK: armazena variáveis primitivas e referências (endereços de objetos)
        // HEAP: armazena os objetos criados com "new"
        // Exercício 11 (int):
        // - a e b ficam na STACK com valores independentes
        // - b = a copia o VALOR → cada um tem seu próprio espaço
        // - alterar b não afeta a
        // Exercício 12 (Carro):
        // - O objeto Carro fica no HEAP
        // - c1 e c2 ficam na STACK, mas guardam o MESMO endereço do heap
        // - c2 = c1 copia a REFERÊNCIA → apontam para o mesmo objeto
        // - alterar via c2 afeta o objeto que c1 também enxerga
    }
}
