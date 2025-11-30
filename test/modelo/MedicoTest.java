package modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MedicoTest {

    private Medico criarMedicoBase() {
        return new Medico(
            "Dr. Teste", 50, "Rua Fictícia", 
            "Cirurgia", "999999-SP", "Ortopedia"
        );
    }

    // Teste 1: Valida a Herança e acesso aos atributos da Pessoa ---
    @Test
    void deveHerdarAtributosDePessoa() {
        // Cria o médico
        Medico medico = criarMedicoBase();
        
        // Confirma se atributos da Pessoa (Classe Abstrata) são acessíveis
        assertEquals("Dr. Teste", medico.getNome(), "O nome herdado deve ser 'Dr. Teste'.");
        assertTrue(medico instanceof Pessoa, "Médico deve ser uma instância de Pessoa.");
        assertTrue(medico instanceof Especialista, "Médico deve ser uma instância de Especialista.");
    }

    // Valida a Associação/Criação de Receita ---
    @Test
    void devePrescreverERetornarUmObjetoReceita() {
        // Cria médico e paciente
        Medico medico = criarMedicoBase();
        Paciente paciente = new Paciente("Cliente Teste", 30, "End. Teste", 1);
        String medicamento = "Paracetamol";
        
        // Prescreve a receita (Associação)
        Receita receita = medico.prescreverReceita(paciente, medicamento);
        
        // Confirma que a Receita foi criada e o medicamento foi adicionado
        assertNotNull(receita, "A prescrição deve retornar um objeto Receita.");
        assertEquals(1, receita.getMedicamentos().size(), "A receita deve conter 1 medicamento.");
        assertEquals(medicamento, receita.getMedicamentos().get(0), "O medicamento deve ser o prescrito.");
    }
}