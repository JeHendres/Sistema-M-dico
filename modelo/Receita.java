package modelo;

import java.util.ArrayList;
import java.util.List;

public class Receita {

    private List<String> medicamentos;

    public Receita() {
        this.medicamentos = new ArrayList<>();
    }

    public void adicionarMedicamento(String medicamento) {
        this.medicamentos.add(medicamento);
    }

    public List<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        return "Receita [medicamentos=" + medicamentos + "]";
    }
}