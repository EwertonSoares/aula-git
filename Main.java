import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Exercicio 01
        int a, b, c;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor para a variável A: ");
        a = ler.nextInt();

        System.out.println("\nDigite o valor para a variável B: ");
        b = ler.nextInt();

        System.out.println("\nDigite o valor para a variável C: ");
        c = ler.nextInt();

        if((a + b) > c) {
            System.out.println("A soma de A + B é maior do que C");
        }
        else if((a + b) < c) {
            System.out.println("A soma de A + B é menor do que C");
        }
        else {
            System.out.println("A soma de A + B é igual á C");
        }

        //Exercicio 02
        int numero;

        System.out.println("Digite um numero: ");
        numero = ler.nextInt();

        if(((numero % 2) == 0) && numero > 0){
            System.out.println("O Número "+ numero +" é par e positivo!");
        } else if(((numero % 2) == 0) && numero < 0) {
            System.out.println("O Número "+ numero +" é par e negativo!");
        } else if(((numero % 2) != 0) && numero > 0) {
            System.out.println("O Número "+ numero +" é impar e positivo!");
        } else if(((numero % 2) != 0) && numero < 0) {
            System.out.println("O Número "+ numero +" é impar e negativo!");
        } else { System.out.println("O Número "+ numero +" é invalido!"); }

        //Exercicio 03
        int codigo, qtd;

        System.out.println("| Codigo do produto  |    " + "Produto   |    " + "Preço unitário   |");
        System.out.println();
        System.out.println("|        1        |  " + "Cachorro-quente  |      " + "R$10.00      |");
        System.out.println("|        2        |  " + "X-Salada         |      " + "R$15.00      |");
        System.out.println("|        3        |  " + "X-Bacon          |      " + "R$18.00      |");
        System.out.println("|        4        |  " + "Bauru            |      " + "R$12.00      |");
        System.out.println("|        5        |  " + "Refrigerente     |      " + "R$08.00      |");
        System.out.println("|        6        |  " + "Suco de Laranja  |      " + "R$13.00      |");


        System.out.println("\n\nDigite o código do produto desejado: ");
        codigo = ler.nextInt();

        System.out.println("Digite o quantidade desejada: ");
        qtd = ler.nextInt();


        System.out.println("\n### Detalhes da compra ###");

        switch (codigo) {
            case 1:
                System.out.println("Produto: " + "Cachorro-quente");
                System.out.println("Valor total: R$" + qtd * 10.00);

                break;

            case 2:
                System.out.println("Produto: " + "X-Salada");
                System.out.println("Valor total: R$" + qtd * 15.00);

                break;

            case 3:
                System.out.println("Produto: " + "X-Bacon");
                System.out.println("Valor total: R$" + qtd * 18.00);

                break;
            case 4:
                System.out.println("Produto: " + "Bauru");
                System.out.println("Valor total: R$" + qtd * 12.00);

                break;

            case 5:
                System.out.println("Produto: " + "Refrigerante");
                System.out.println("Valor total: R$" + qtd * 8.00);

                break;

            case 6:
                System.out.println("Produto: " + "Suco de Laranja");
                System.out.println("Valor total: R$" + qtd * 13.00);

                break;

            default:
                System.out.println("Código invalido!");
        }

        //Exercicio 04
        int idade;

        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

        if(idade >= 16 && idade < 18) {
            System.out.println("A pessoa está apta a votar e o voto é facultativo.");
        }
        else if (idade >= 18 && idade < 65) {
            System.out.println("A pessoa está apta a votar e o voto é obrigatório.");
        }
        else if (idade >= 65) {
            System.out.println("A pessoa está apta a votar e o voto é facultativo.");
        } else {
            System.out.println("A pessoa não está apta a votar.");
        }

        double salario = 0.00;
        double imposto = 0.00;

        System.out.println("Digite o salário: ");
        salario = ler.nextDouble();

        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Isento de imposto!");
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            imposto = ((double) 8 / 100) * salario;
            System.out.printf("Imposto de renda %.2f: ", imposto);
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            imposto = ((double) 18 / 100) * salario;
            System.out.printf("Imposto de renda %.2f: ", imposto);
        } else if (salario > 4500.00) {
            imposto = ((double) 28 / 100) * salario;
            System.out.printf("Imposto de renda %.2f: ", imposto);
        } else {
            System.out.println("Salário invalido!");
        }

    }
}