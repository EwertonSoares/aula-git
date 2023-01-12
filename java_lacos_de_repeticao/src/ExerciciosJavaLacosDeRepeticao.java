import java.util.Scanner;

public class ExerciciosJavaLacosDeRepeticao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Exercico01
        int numero1, numero2, contador;

        System.out.println("Digite o primeiro número: ");
        numero1 = ler.nextInt();

        System.out.println("Digite o Segundo número: ");
        numero2 = ler.nextInt();

        if (numero1 < numero2) {
            for (contador = numero1; contador <= numero2; contador++) {
                if ((contador % 3 == 0) && (contador % 5 == 0))
                    System.out.println("O número " + contador + " é múltiplo de 3 e 5");
            }
        }

        
        //Exercico02
        int numero, contePares = 0, conteImpares = 0;

        for (int cont = 0; cont < 10; cont++) {
            System.out.println("Digite o " + (cont+1) + "o número: ");
            numero = ler.nextInt();

            if (numero % 2 == 0) {
                contePares+=1;
            } else {
                conteImpares+=1;
            }
        }

        System.out.println("\nTotal de números pares: " + contePares);
        System.out.println("Total de números impares: " + conteImpares);


        //Exercicio03
        int idade = 0, menorQue21 = 0, maiorQue50 = 0;

        while (idade >= 0) {

            System.out.println("Digite a idade: ");
            idade = ler.nextInt();

            if (!(idade < 0)) {
                if (idade < 21) {
                    menorQue21 += 1;
                } else if (idade > 50) {
                    maiorQue50 += 1;
                }
            }
        }

        System.out.println("\nTotal de pessoas menores de 21 anos: " + menorQue21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiorQue50);


        //Exercicio05
        int num, soma = 0;

        do {
            System.out.println("Digite um número: ");
            num = ler.nextInt();

            if (num > 0) {
                soma+=num;
            }

        } while(num != 0);

        System.out.println("\nA soma dos números positivos é: " + soma);

    }
}