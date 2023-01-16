package atividade02;

public class Funcionario {

    private String matricula;
    private String nome;
    private String sobrenome;
    private String ultimoNome;
    private float salario;

    public Funcionario(String matricula, String nome, String sobrenome, String ultimoNome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ultimoNome = ultimoNome;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String visualizar() {
        return "Funcionario{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
