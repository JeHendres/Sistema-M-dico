package modelo;

import java.util.Date;

public class Consulta implements Agendavel {

    private Date data;
    private String diagnostico;

    private Exame exame;

    public Consulta(Date data) {
        this.data = data;
    }

    @Override
    public void agendar() {
        System.out.println("Consulta agendada para " + this.data);
    }

    @Override
    public void cancelar() {
        System.out.println("Consulta do dia " + this.data + " foi cancelada.");
    }

    public double calcularCusto() {
        return 150.00; // Valor base
    }

    public double calcularCusto(double desconto) {
        double valorBase = calcularCusto();
        return valorBase - (valorBase * (desconto / 100.0));
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Exame getExame() {
        return exame;
    }
}