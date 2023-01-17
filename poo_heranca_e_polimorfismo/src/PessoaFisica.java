public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, int idade, String rua, String bairro, int numero, String cpf) {
        super(nome, idade, rua, bairro, numero);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("CPF: " + cpf);
    }
}
