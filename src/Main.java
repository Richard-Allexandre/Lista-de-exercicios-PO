public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("VW", "Gol", 2015);
        trocarModelo(meuCarro);
        System.out.println(meuCarro.getModelo());

         // Exercício 13a – o que é impresso?
        // Fusca
        // Exercício 13b – por que a mudança dentro do método afetou o objeto original?
        // Quando passamos um objeto para um método, passamos a REFERÊNCIA (endereço).
        // parâmetro c aponta para o MESMO objeto no heap que meuCarro aponta.
        // Então quando c.setModelo("Fusca") é chamado dentro do método,
        //  ele está alterando o mesmo objeto que meuCarro enxerga fora do método.
    }

    public static void trocarModelo(Carro c) {
        c.setModelo("Fusca");
    }

}
