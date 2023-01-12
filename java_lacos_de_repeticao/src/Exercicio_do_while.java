import java.util.Scanner;

public class Exercicio_do_while {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero, soma = 0;

        do {
            System.out.println("Digite um número: ");
            numero = ler.nextInt();

            if (numero > 0) {
                soma+=numero;
            }

        } while(numero != 0);

        System.out.println("\nA soma dos números positivos é: " + soma);
    }
}