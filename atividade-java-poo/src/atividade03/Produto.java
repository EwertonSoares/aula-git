package atividade03;

public class Produto {

    private int codigo;
    private String nome;
    private float preco;
    private int avaliacao;
    private String informacoes;

    public Produto(int codigo, String nome, float preco, int avaliacao, String informacoes) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.avaliacao = avaliacao;
        this.informacoes = informacoes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrreco() {
        return preco;
    }

    public void setPtreco(float ptreco) {
        this.preco = ptreco;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public String visualizar() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", ptreco=" + preco +
                ", avaliacao=" + avaliacao +
                ", informacoes='" + informacoes + '\'' +
                '}';
    }
}
