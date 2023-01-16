package atividade05;

public class Ingresso {

    private String numero;
    private String evento;
    private String data;
    private String horario;
    private String local;

    public Ingresso(String numero, String evento, String data, String horario, String local) {
        this.numero = numero;
        this.evento = evento;
        this.data = data;
        this.horario = horario;
        this.local = local;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public String visualizar() {
        return "Ingresso{" +
                "numero='" + numero + '\'' +
                ", evento='" + evento + '\'' +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}
