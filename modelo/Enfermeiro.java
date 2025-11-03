package modelo;

public class Enfermeiro extends Pessoa {

    private String coren;

    public Enfermeiro(String nome, int idade, String endereco, String coren) {
        super(nome, idade, endereco);
        this.coren = coren;
    }

    public void realizarAtendimento() {
        System.out.println("Enfermeiro " + getNome() + " (COREN: " + this.coren + ") realizando atendimento/triagem.");
    }

    @Override
    public void realizarRotina() {
        System.out.println("Enfermeiro " + getNome() + " está realizando sua rotina de verificação de leitos.");
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }
}