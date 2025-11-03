package modelo;

import java.util.ArrayList;
import java.util.List;

public class HistoricoMedico {

    private List<Consulta> listaConsultas;

    public HistoricoMedico() {
        this.listaConsultas = new ArrayList<>();
    }

    public void adicionarConsulta(Consulta consulta) {
        this.listaConsultas.add(consulta);
        System.out.println("Consulta adicionada ao histórico do paciente.");
    }

    public List<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(List<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }
}