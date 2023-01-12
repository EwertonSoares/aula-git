import java.util.Scanner;

public class Exercicio_while {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

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

    }
}