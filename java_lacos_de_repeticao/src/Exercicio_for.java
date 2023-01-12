import java.util.Scanner;

public class Exercicio_for {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero, contePares = 0, conteImpares = 0;

        for (int contador = 0; contador < 10; contador++) {
            System.out.println("Digite o " + (contador+1) + "o número: ");
            numero = ler.nextInt();

            if (numero % 2 == 0) {
                contePares+=1;
            } else {
                conteImpares+=1;
            }
        }

        System.out.println("\nTotal de números pares: " + contePares);
        System.out.println("Total de números impares: " + conteImpares);

    }
}