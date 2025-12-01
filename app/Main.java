package app;

import modelo.*;
import java.util.Date;
import java.util.Scanner;

public class Main {

    // Scanner para a camada View interagir com o usuário
    private static Scanner scanner = new Scanner(System.in);
    
    // Instância do Controller que a View vai usar
    private static PacienteController pacienteController = new PacienteController();

    public static void main(String[] args) {

        System.out.println("--- 1. DEMONSTRAÇÃO DOS CONCEITOS DE POO ---");
        
        Medico draAna = new Medico(
                "Dra. Ana Carolina", 42, "Av. Paulista, 1000",
                "Cardiologia Pediátrica",
                "123456-SP",
                "Cardiologia"
        );

        Enfermeiro enfRicardo = new Enfermeiro(
                "Ricardo Mendes", 35, "Rua das Flores, 50",
                "987654-SP"
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
        // Ajuste no construtor para corresponder ao seu código original:
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
        // Ajuste para o seu método getter real
        HistoricoMedico historico = pacJoao.getHistoricoMedico();
        historico.adicionarConsulta(consulta);
        System.out.println("Consultas no histórico do Paciente " + pacJoao.getNome() + ": " + historico.getListaConsultas().size());

        System.out.println("\n--- 8. Testando Associações ---");
        Receita receita = draAna.prescreverReceita(pacJoao, "Aspirina 100mg");
        System.out.println("Receita gerada: " + receita.toString());
        
        System.out.println("\n=======================================================");
        System.out.println(" ========= MENU DE OPÇÕES - SISTEMA MÉDICO ============ ");
        System.out.println("=======================================================");
        
        // NOVO: INÍCIO DA CAMADA VIEW/MENU
        exibirMenuPrincipal();
    }

    // A Camada View (Menu Principal)
    private static void exibirMenuPrincipal() {
        boolean rodando = true;
        while (rodando) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Gerenciar Pacientes");
            System.out.println("2. Sair do Sistema");
            System.out.print("Escolha uma opção: ");

            // Lógica de leitura de entrada
            String opcao = scanner.nextLine();
            
            switch (opcao) {
                case "1":
                    menuGerenciarPacientes();
                    break;
                case "2":
                    System.out.println("Sistema Médico encerrado. Até mais!");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        // É importante fechar o Scanner no final do programa.
        scanner.close();
    }

    // Sub-menu para Gerenciar Pacientes
    private static void menuGerenciarPacientes() {
        boolean rodandoSubMenu = true;
        while (rodandoSubMenu) {
            System.out.println("\n--- MENU PACIENTES ---");
            System.out.println("1. Cadastrar Novo Paciente");
            System.out.println("2. Listar Todos os Pacientes");
            System.out.println("3. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();
            
            switch (opcao) {
                case "1":
                    // VIEW: Coleta dados
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Idade: ");
                    // Garantimos que a entrada seja um número inteiro
                    int idade = 0;
                    try {
                        idade = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println(" Idade inválida. Cadastro cancelado.");
                        break;
                    }
                    
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    
                    // Chama o Controller para criar o objeto Model
                    Paciente novoPaciente = pacienteController.cadastrarNovoPaciente(nome, idade, endereco);
                    System.out.println("\n Paciente " + novoPaciente.getNome() + " (ID: " + novoPaciente.getId() + ") cadastrado com sucesso!");
                    break;
                    
                case "2":
                    // Chama o Controller para buscar a lista de Models
                    System.out.println("\n--- LISTA DE PACIENTES ---");
                    for (Paciente p : pacienteController.listarTodos()) {
                        System.out.println("ID: " + p.getId() + " | Nome: " + p.getNome() + " | Idade: " + p.getIdade() + " anos");
                    }
                    if (pacienteController.listarTodos().isEmpty()) {
                        System.out.println("Nenhum paciente cadastrado.");
                    }
                    break;
                    
                case "3":
                    rodandoSubMenu = false;
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}