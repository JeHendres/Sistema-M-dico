package modelo;

public class Exame implements Agendavel {

    private String tipo;
    private String resultado;

    public Exame(String tipo) {
        this.tipo = tipo;
        this.resultado = "Pendente";
    }

    @Override
    public void agendar() {
        System.out.println("Exame de " + this.tipo + " agendado.");
    }

    @Override
    public void cancelar() {
        System.out.println("Exame de " + this.tipo + " cancelado.");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}