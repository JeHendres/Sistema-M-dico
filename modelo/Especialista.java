package modelo;

public class Especialista extends Pessoa {

    private String subEspecialidade;

    public Especialista(String nome, int idade, String endereco, String subEspecialidade) {
        super(nome, idade, endereco);
        this.subEspecialidade = subEspecialidade;
    }

    public void realizarAtendimento() {
        System.out.println("Especialista " + getNome() + " realizando atendimento.");
    }

    @Override
    public void realizarRotina() {
        System.out.println("Especialista " + getNome() + " está realizando sua rotina de análise de casos.");
    }

    public String getSubEspecialidade() {
        return subEspecialidade;
    }

    public void setSubEspecialidade(String subEspecialidade) {
        this.subEspecialidade = subEspecialidade;
    }
}