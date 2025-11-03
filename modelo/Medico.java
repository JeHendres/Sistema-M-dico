package modelo;

public class Medico extends Especialista {

    private String crm;
    private String especialidade;

    public Medico(String nome, int idade, String endereco, String subEspecialidade, String crm, String especialidade) {
        super(nome, idade, endereco, subEspecialidade);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Receita prescreverReceita(Paciente paciente, String medicamento) {
        System.out.println("Médico " + getNome() + " (CRM: " + this.crm + ") prescreveu " + medicamento + " para " + paciente.getNome());
        Receita r = new Receita();
        r.adicionarMedicamento(medicamento);
        return r;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Médico " + getNome() + " (" + this.especialidade + ") realizando atendimento.");
    }

    @Override
    public void realizarRotina() {
        System.out.println("Médico " + getNome() + " está realizando sua rotina de visita aos pacientes internados.");
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}