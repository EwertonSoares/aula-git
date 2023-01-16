package atividade03;

public class TestaGame {
    public static void main(String[] args) {
        Produto produto1 = new Produto(123456, "Pes2022", 230.00F, 4,
                "Novo Pro evolution soccer lançado dia 20/11/2022, ótimos graficos e estadios atualizados");
        Produto produto2 = new Produto(654321, "FIFA22", 250.00F, 5,
                "Novo FIFA lançado dia 18/10/2022 com muitas novidades e os melhores graficos");

        System.out.println("\n\nExibindo produto 1: " + produto1.visualizar());
        System.out.println("\nExibindo produto 2: " + produto2.visualizar());

    }
}