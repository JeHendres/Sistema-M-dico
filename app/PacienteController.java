package app;

import modelo.Paciente; // ESSENCIAL: Garante que o Modelo é importado
import java.util.ArrayList;
import java.util.List;

public class PacienteController {

    private static List<Paciente> listaPacientes = new ArrayList<>();
    private static int proximoId = 1000;

    public Paciente cadastrarNovoPaciente(String nome, int idade, String endereco) {
        Paciente novoPaciente = new Paciente(nome, idade, endereco, proximoId++);
        listaPacientes.add(novoPaciente);
        return novoPaciente;
    }

    public List<Paciente> listarTodos() {
        return listaPacientes;
    }
}