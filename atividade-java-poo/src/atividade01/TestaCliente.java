package atividade01;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Ewerton", "Soares", 27, "98743380219");
        Cliente cliente2 = new Cliente(2, "João", "Santos", 45, "43380219045");

        System.out.println("\n\nExibindo cliente 1: " + cliente1.visualizar());
        System.out.println("\nExibindo cliente 2: " + cliente2.visualizar());

    }
}