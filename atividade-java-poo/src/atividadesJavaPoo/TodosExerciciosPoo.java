package atividadesJavaPoo;

import atividade01.Cliente;
import atividade02.Funcionario;
import atividade03.Produto;
import atividade04.Farmacia;
import atividade05.Ingresso;
import atividade06.Curso;

public class TodosExerciciosPoo {
    public static void main(String[] args) {
        //Exercicio 01
        Cliente cliente1 = new Cliente(1, "Ewerton", "Soares", 27, "98743380219");
        Cliente cliente2 = new Cliente(2, "João", "Santos", 45, "43380219045");

        System.out.println("\n\nExibindo cliente 1: " + cliente1.visualizar());
        System.out.println("\nExibindo cliente 2: " + cliente2.visualizar());

        //Exercicio 02
        Funcionario funcionario1 = new Funcionario("123456", "Ewerton", "Soares",
                "Silva", 2.200F);
        Funcionario funcionario2 = new Funcionario("654321", "João", "Santos",
                "Oliveira", 1.300F);

        System.out.println("\n\nExibindo funcionario 1: " + funcionario1.visualizar());
        System.out.println("\nExibindo funcionario 2: " + funcionario2.visualizar());

        //Exercicio 03
        Produto produto1 = new Produto(123456, "Pes2022", 230.00F, 4,
                "Novo Pro evolution soccer lançado dia 20/11/2022, ótimos graficos e estadios atualizados");
        Produto produto2 = new Produto(654321, "FIFA22", 250.00F, 5,
                "Novo FIFA lançado dia 18/10/2022 com muitas novidades e os melhores graficos");

        System.out.println("\n\nExibindo produto 1: " + produto1.visualizar());
        System.out.println("\nExibindo produto 2: " + produto2.visualizar());

        //Exercicio 04
        Farmacia farmacia1 = new Farmacia("0198276540/0001", "Farmax", "Rua um",
                "Bairro um", 1, "13678009");
        Farmacia farmacia2 = new Farmacia("0136236598/0001", "Drogasil", "Rua dois",
                "Bairro dois", 2,"12099876");

        System.out.println("\n\nExibindo farmacia 1: " + farmacia1.visualizar());
        System.out.println("\nExibindo farmacia 2: " + farmacia2.visualizar());

        //Exercicio 05
        Ingresso ingresso1 = new Ingresso("000001", "Show Link Park",
                "15 de Abril de 2023", "22:00 horas", "Rua um, Numero um, Bairro um");
        Ingresso ingresso2 = new Ingresso("000002", "Rock in Rio",
                "25 de Julio de 2023", "12:00 horas", "Rua dois, Numero dois, Bairro dois");

        System.out.println("\n\nExibindo ingresso 1: " + ingresso1.visualizar());
        System.out.println("\nExibindo ingresso 2: " + ingresso2.visualizar());

        //Exercicio 06
        Curso curso1 = new Curso("000001", "Desenvolvimento WEB",
                "15/04/2023", "15/08/2024",
                "Descrição de todas máterias do curso de Desenvolvimento WEB");
        Curso curso2 = new Curso("000002", "Analise e desenvolvimento de sistemas",
                "25/01/2023", "25/01/2025",
                "Descrição de todas máterias do curso de Analise e desenvolvimento de sistemas");

        System.out.println("\n\nExibindo curso 1: " + curso1.visualizar());
        System.out.println("\nExibindo curso 2: " + curso2.visualizar());

    }
}
