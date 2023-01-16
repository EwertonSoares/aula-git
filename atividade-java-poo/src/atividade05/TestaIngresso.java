package atividade05;


import atividade04.Farmacia;

public class TestaIngresso {
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso("000001", "Show Link Park",
                "15 de Abril de 2023", "22:00 horas", "Rua um, Numero um, Bairro um");

        Ingresso ingresso2 = new Ingresso("000002", "Rock in Rio",
                "25 de Julio de 2023", "12:00 horas", "Rua dois, Numero dois, Bairro dois");

        System.out.println("\n\nExibindo ingresso 1: " + ingresso1.visualizar());
        System.out.println("\nExibindo ingresso 2: " + ingresso2.visualizar());

    }
}