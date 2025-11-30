package modelo;

import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HistoricoMedicoTest {

    @Test
    void deveSerInicializadoComUmaListaVazia() {
        // Cria o histórico
        HistoricoMedico historico = new HistoricoMedico();
        
        // Confirma que a lista existe e está vazia
        assertNotNull(historico.getListaConsultas(), "A lista de consultas não pode ser nula ao inicializar.");
        assertEquals(0, historico.getListaConsultas().size(), "O histórico deve começar com 0 consultas.");
    }

    // Valida se a consulta é adicionada
    @Test
    void deveAdicionarUmaConsultaALista() {
        // Cria histórico e uma consulta
        HistoricoMedico historico = new HistoricoMedico();
        Consulta consulta = new Consulta(new Date());
        
        // Adiciona a consulta
        historico.adicionarConsulta(consulta);
        
        // Confirma que a lista agora tem 1 item
        assertEquals(1, historico.getListaConsultas().size(), "A lista deve conter 1 consulta após a adição.");
        assertEquals(consulta, historico.getListaConsultas().get(0), "O objeto adicionado deve ser o mesmo recuperado.");
    }
}