public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 99;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Exercício 11a – valores após a execução:
        // a = 10
        // b = 99
        // Exercício 11b – alterar b mudou a? NÃO.
        // Porque int é um tipo PRIMITIVO.
        // Quando fazemos b = a, uma CÓPIA do valor é criada.
        // a e b são variáveis independentes na memória (stack).
        // Cada uma tem seu próprio espaço, alterar b não afeta a.
    }
}
