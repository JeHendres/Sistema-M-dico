package app; // Pacote da classe Main

import modelo.*; // Importa TODAS as classes do pacote 'modelo'
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- 1. Criando Objetos ---");

        Medico draAna = new Medico(
                "Dra. Ana Carolina", 42, "Av. Paulista, 1000",
                "Cardiologia Pediátrica",
                "123456-SP",
                "Cardiologia"
        );

        Enfermeiro enfRicardo = new Enfermeiro(
                "Ricardo Mendes", 35, "Rua das Flores, 50",
                "987654-SP" /
        );

        Paciente pacJoao = new Paciente(
                "João da Silva", 55, "Rua Augusta, 200",
                701
        );

        System.out.println("\n--- 2. Testando Encapsulamento e Herança ---");
        pacJoao.setEndereco("Av. Padre Cacique, 300");
        System.out.println("Paciente: " + pacJoao.getNome() + ", Endereço atualizado: " + pacJoao.getEndereco());


        System.out.println("\n--- 3. Testando Polimorfismo (Sobrescrita) ---");
        Pessoa[] pessoasDaClinica = {draAna, enfRicardo, pacJoao};

        for (Pessoa p : pessoasDaClinica) {
            p.realizarRotina();
        }

        System.out.println("\n--- 4. Testando a Interface (Agendavel) ---");
        Consulta consulta = new Consulta(new Date());
        Exame exameSangue = new Exame("Hemograma Completo");

        Agendavel[] listaParaAgendar = {consulta, exameSangue};

        for (Agendavel item : listaParaAgendar) {
            item.agendar();
        }

        System.out.println("\n--- 5. Testando Sobrecarga (Overload) ---");
        System.out.println("Custo da Consulta (sem desconto): R$ " + consulta.calcularCusto());
        System.out.println("Custo da Consulta (com 15% desconto): R$ " + consulta.calcularCusto(15.0));

        System.out.println("\n--- 6. Testando Agregação ---");

        consulta.setExame(exameSangue);
        System.out.println("A consulta agora tem um exame agregado: " + consulta.getExame().getTipo());

        System.out.println("\n--- 7. Testando Composição ---");

        HistoricoMedico historico = pacJoao.getHistoricoMedico();
        historico.adicionarConsulta(consulta);
        System.out.println("Consultas no histórico do Paciente " + pacJoao.getNome() + ": " + historico.getListaConsultas().size());

        System.out.println("\n--- 8. Testando Associações ---");

        Receita receita = draAna.prescreverReceita(pacJoao, "Aspirina 100mg");
        System.out.println("Receita gerada: " + receita.toString());
    }
}