public class TestaCliente {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Pessoas fisicas");
        PessoaFisica pessoaFisicaUm = new PessoaFisica("Ewerton", 27, "Rua um", "Bairro um",
        29, "44454578652");

        PessoaFisica pessoaFisicaDois = new PessoaFisica("Maria", 20, "Rua dois", "Bairro dois",
                305, "46601209832");

        pessoaFisicaUm.visualizar();
        System.out.println();
        pessoaFisicaDois.visualizar();

        System.out.println("\n###################################################\n");

        System.out.println("Pessoas juridicas");
        PessoaJuridica pessoaJuridicaUm = new PessoaJuridica("Ewerton LTDA", 27, "Rua quinze", "Bairro quinze",
                29, "44454578652/0001");

        PessoaJuridica pessoaJuridicaDois = new PessoaJuridica("Maria LTDA", 20, "Rua oito", "Bairro oito",
                405, "46601209832/0001");

        pessoaJuridicaUm.visualizar();
        System.out.println("");
        pessoaJuridicaDois.visualizar();
    }
}