package atividade06;

public class Curso {

    private String codigo;
    private String nome;
    private String dataInicio;
    private String dataTermino;
    private String grade;

    public Curso(String codigo, String nome, String dataInicio, String dataTermino, String grade) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.grade = grade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String visualizar() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataTermino='" + dataTermino + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
