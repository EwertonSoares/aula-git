public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String rua, String bairro, int numero, String cnpj) {
        super(nome, idade, rua, bairro, numero);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void visualizar() {
        super.visualizar();
        System.out.println("CNPJ: " + cnpj);
    }
}
