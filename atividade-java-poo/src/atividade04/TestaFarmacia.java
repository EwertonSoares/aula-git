package atividade04;


public class TestaFarmacia {
    public static void main(String[] args) {
        Farmacia farmacia1 = new Farmacia("0198276540/0001", "Farmax", "Rua um",
                "Bairro um", 1, "13678009");

        Farmacia farmacia2 = new Farmacia("0136236598/0001", "Drogasil", "Rua dois",
                "Bairro dois", 2,"12099876");

        System.out.println("\n\nExibindo farmacia 1: " + farmacia1.visualizar());
        System.out.println("\nExibindo farmacia 2: " + farmacia2.visualizar());

    }
}