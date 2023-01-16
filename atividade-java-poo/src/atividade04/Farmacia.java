package atividade04;

public class Farmacia {

    private String cnpj;
    private String nome;
    private String rua;
    private String bairro;
    private int numero;
    private String cep;

    public Farmacia(String cnpj, String nome, String rua, String bairro, int numero, String cep) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String visualizar() {
        return "Farmacia{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numero='" + numero + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
