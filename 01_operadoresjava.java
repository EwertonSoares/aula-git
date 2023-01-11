//EXERCICIO1
import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float salariof, abonof, novoSalariof;

        System.out.println("Digite o salário: ");
        salariof = ler.nextFloat();

        System.out.println("Digite o abono: ");
        abonof = ler.nextFloat();

        novoSalariof = salariof + abonof;

        System.out.println("O novo salário é: " + novoSalariof);

        //EXERCICIO2
        Scanner ler = new Scanner(System.in);

        float nota1f, nota2f, nota3f, nota4f, mediaf;

        System.out.println("\nEscreva sua primeira nota: ");
        nota1f = ler.nextFloat();

        System.out.println("\nEscreva sua segunda nota: ");
        nota2f = ler.nextFloat();

        System.out.println("\nEscreva sua terceira nota: ");
        nota3f = ler.nextFloat();

        System.out.println("\nEscreva sua quarta nota: ");
        nota4f = ler.nextFloat();

        mediaf = (nota1f + nota2f + nota3f + nota4f) / 4;
        System.out.printf("\nSua média é: %.1f" , mediaf);

        //EXERCICIO3
        Scanner ler = new Scanner(System.in);

        float salarioBrutof, adicionalNoturnof, horasExtrasf, descontosf, salarioLiquidof=0f;

        System.out.println("Digite o salário bruto: ");
        salarioBrutof = ler.nextFloat();

        System.out.println("\nDigite o valor de adicional noturno: ");
        adicionalNoturnof = ler.nextFloat();

        System.out.println("\nDigite a quantidade de horas extras: ");
        horasExtrasf = ler.nextFloat();

        System.out.println("\nDigite o valor de desconto: ");
        descontosf = ler.nextFloat();

        salarioLiquidof = salarioBrutof + adicionalNoturnof + (horasExtrasf * 5) - descontosf;
        System.out.printf ("\nO salário líquido será de: R$ %.2f " , salarioLiquidof);


        //EXERCICIO4
        Scanner ler = new Scanner(System.in);

        float numero1f, numero2f, numero3f, numero4f, diferencaf;

        System.out.println("Digite o primeiro número: ");
        numero1f = ler.nextFloat();

        System.out.println("Digite o segundo número: ");
        numero2f = ler.nextFloat();

        System.out.println("Digite o terceiro número: ");
        numero3f = ler.nextFloat();

        System.out.println("Digite o quarto número:" );
        numero4f = ler.nextFloat();

        diferencaf = (numero1f * numero2f) - (numero3f * numero4f);

        System.out.println("A diferença entre os produtos é: " + diferencaf);

    }
}