public abstract class Cliente {

    private String nome;
    private int idade;
    private String rua;
    private String bairro;
    private int numero;

    public Cliente(String nome, int idade, String rua, String bairro, int numero) {
        this.nome = nome;
        this.idade = idade;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
    public void visualizar() {
         System.out.println("Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numero=" + numero +
                '}');
    }
}
