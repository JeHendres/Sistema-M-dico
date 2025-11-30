# Sistema Médico: Implementação de POO (Java)

Olá! Bem-vindo ao repositório do projeto **Sistema Médico**.

Este projeto foi desenvolvido como um estudo aprofundado e prático dos pilares da Programação Orientada a Objetos (POO) em Java, aplicando conceitos de Herança, Polimorfismo, Agregação, Composição e Associações.

## Status Atual e Funcionalidades Implementadas

O projeto está 100% funcional em sua estrutura de classes e testes!

Status | Detalhe |

**Pilha Tecnológica** | Java JDK 24, JUnit 5!
**Implementações POO** | Herança, Polimorfismo, Encapsulamento, Associações, Agregação e Composição.!
**Status dos Testes** | Todos os testes unitários (8/8) estão **PASSANDO**! 
**Ambiente Validado** | O problema de *Classpath* e execução de testes no ambiente foi **solucionado**!

### Estrutura do Projeto

O código foi dividido em pacotes lógicos (`app` e `modelo`) e a estrutura de classes modela as interações centrais de uma clínica:

* **Pessoas e Herança:** Classes `Pessoa`, `Medico` e `Enfermeiro`.
* **Serviços:** Classes `Consulta`, `Exame` e `Receita`.
* **Histórico:** Classe `HistoricoMedico` (demonstra Composição, pois só existe com um `Paciente`).
* **Interface:** Implementação da interface `Agendavel` pelas classes `Consulta` e `Exame`.

## Testes Unitários com JUnit 5

Esta é a parte crucial! As funcionalidades foram validadas usando o framework **JUnit 5**, garantindo a integridade dos cálculos e interações entre objetos.

Todos os testes unitários (localizados na pasta `test/modelo/`) foram executados com sucesso, confirmando:

* **`ConsultaTest`:** Validação do agendamento e dos cálculos de custo (com e sem desconto).
* **`HistoricoMedicoTest`:** Confirmação de que as consultas são adicionadas corretamente ao histórico do paciente (Composição).
* **`MedicoTest`:** Validação da herança de atributos e do processo de prescrição de medicamentos (Associação).

## Como Rodar e Testar

Este projeto pode ser executado em qualquer IDE moderna (IntelliJ IDEA, VS Code) que suporte o JDK 24. O ambiente foi validado com sucesso no **Visual Studio Code** usando o **Extension Pack for Java**.

1.  **Clone o Repositório:**
    
    git clone [https://github.com/JeHendres/Sistema-M-dico.git](https://github.com/JeHendres/Sistema-M-dico.git)

2.  **Abra o Projeto:** Use o VS Code e abra a pasta raiz `Sistema Médico`.
3.  **Execute a Aplicação:** Para ver o fluxo principal, execute o método `main` em `app/Main.java`.
4.  **Execute os Testes:** Vá para a aba **Testing** (Tubo de Ensaio) no VS Code e clique no ícone **Play** para rodar toda a suíte de testes.

