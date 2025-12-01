package modelo;

public class Paciente extends Pessoa {

    private int idPaciente;

    private HistoricoMedico historicoMedico;

    public Paciente(String nome, int idade, String endereco, int idPaciente) {
        super(nome, idade, endereco);
        this.idPaciente = idPaciente;

        this.historicoMedico = new HistoricoMedico();
    }

    public void agendarConsulta() {
        System.out.println("Paciente " + getNome() + " agendou uma consulta.");
    }

    @Override
    public void realizarRotina() {
        System.out.println("Paciente " + getNome() + " está realizando sua rotina de check-up.");
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public int getId() {
        return this.idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public HistoricoMedico getHistoricoMedico() {
        return historicoMedico;
    }
}