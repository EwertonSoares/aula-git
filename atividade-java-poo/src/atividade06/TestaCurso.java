package atividade06;


import atividade05.Ingresso;

public class TestaCurso {
    public static void main(String[] args) {
        Curso curso1 = new Curso("000001", "Desenvolvimento WEB",
                "15/04/2023", "15/08/2024",
                "Descrição de todas máterias do curso de Desenvolvimento WEB");

        Curso curso2 = new Curso("000002", "Analise e desenvolvimento de sistemas",
                "25/01/2023", "25/01/2025", "Descrição de todas máterias do curso de Analise e desenvolvimento de sistemas");

        System.out.println("\n\nExibindo curso 1: " + curso1.visualizar());
        System.out.println("\nExibindo curso 2: " + curso2.visualizar());

    }
}