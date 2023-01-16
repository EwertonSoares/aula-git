package atividade02;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("123456", "Ewerton", "Soares",
                "Silva", 2.200F);

        Funcionario funcionario2 = new Funcionario("654321", "João", "Santos",
                "Oliveira", 1.300F);

        System.out.println("\n\nExibindo funcionario 1: " + funcionario1.visualizar());
        System.out.println("\nExibindo funcionario 2: " + funcionario2.visualizar());

    }
}