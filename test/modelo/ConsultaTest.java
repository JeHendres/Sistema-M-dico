package modelo;

import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConsultaTest {

    // Criamos uma Consulta fictícia para ser usada nos testes
    private Consulta criarConsultaBase() {
        return new Consulta(new Date());
    }

    // Teste 1: Valida a Sobrecarga (Overloading) do Custo
    @Test
    void deveCalcularCustoSemDescontoCorretamente() {
        // Cria a consulta
        Consulta consulta = criarConsultaBase();
        
        // Chama o método sem desconto
        double custo = consulta.calcularCusto(); 
        
        // Confirmo o valor
        // Usamos um pequeno delta (0.001) para comparar doubles
        assertEquals(150.00, custo, 0.001, "O custo sem desconto deve ser R$ 150.00.");
    }

    // Teste 2: Valida o Custo com Desconto
    @Test
    void deveAplicarDescontoDeQuinzePorcento() {
        // Cria a consulta
        Consulta consulta = criarConsultaBase();
        
        //Chama o método com desconto de 15%
        double custoComDesconto = consulta.calcularCusto(15.0); // 150.00 - 15% = 127.50
        
        // Confirma se o desconto foi aplicado
        assertEquals(127.50, custoComDesconto, 0.001, "O custo com 15% de desconto deve ser R$ 127.50.");
    }

    // Teste 3: Valida a implementação da Interface Agendavel (Apenas o Agendar)
    @Test
    void deveImplementarCorretamenteOAgendamento() {
        // Cria a consulta e verifica se ela é um Agendavel
        Consulta consulta = criarConsultaBase();
        
        // Confirma que a classe Consulta implementa a interface Agendavel
        assertTrue(consulta instanceof Agendavel, "A classe Consulta deve implementar a interface Agendavel.");        
    }
}