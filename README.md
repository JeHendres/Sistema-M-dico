Projeto AP2 - Sistema de Clínica (POO em Java)

Alunos: Rafael Dalavale Kaiser Pinto e Jeronimo Hendres
Tema: Sistema de Gerenciamento de Clínica

1. Breve Explicação dos Conceitos Aplicados

Este documento detalha como os principais requisitos de Programação Orientada a Objetos (POO) foram aplicados neste projeto, conforme solicitado na atividade.

Encapsulamento

O encapsulamento foi a base de todas as nossas classes. Todos os atributos (como nome em Pessoa ou crm em Medico) foram declarados como private ("-" no diagrama UML). Para acessá-los, criamos métodos públicos get e set, garantindo que os dados internos de cada objeto estejam protegidos e só possam ser alterados de forma controlada.

Herança (com 2 Níveis) e Classe Abstrata

Usamos a herança para reutilizar código e criar uma hierarquia lógica.

Classe Abstrata: A classe Pessoa foi definida como abstract. Ela serve como um "molde" para outras classes, contendo atributos comuns (nome, idade, etc.), mas ela mesma não pode ser instanciada.

Herança Nível 1: As classes Paciente, Enfermeiro e Especialista herdam diretamente de Pessoa (usando extends Pessoa).

Herança Nível 2: Para cumprir o requisito, a classe Medico herda de Especialista. Isso cria a cadeia de herança completa de 2 níveis: Pessoa $\rightarrow$ Especialista $\rightarrow$ Medico.

Polimorfismo (Sobrescrita e Sobrecarga)

Aplicamos os dois tipos de polimorfismo:

Sobrescrita (Overriding): A classe abstrata Pessoa define o método abstrato realizarRotina(). As classes filhas (Paciente, Medico e Enfermeiro) são obrigadas a implementar (sobrescrever) este método, cada uma com um comportamento diferente. Demonstramos isso na Main.java chamando o mesmo método em objetos de tipos diferentes.

Sobrecarga (Overloading): Na classe Consulta, criamos dois métodos com o mesmo nome: calcularCusto() (sem parâmetros) e calcularCusto(double desconto) (que aceita um desconto).

Interfaces

Para criar um "contrato" que classes diferentes pudessem assinar, criamos a interface Agendavel.

Ela define os métodos agendar() e cancelar().

As classes Consulta e Exame implementam esta interface (usando implements Agendavel), cumprindo o requisito de uma interface implementada por duas classes distintas.

Agregação e Composição

Para modelar os relacionamentos entre objetos, usamos:

Composição (Relação Forte): Representada pelo losango preenchido entre Paciente e HistoricoMedico. O HistoricoMedico é criado dentro do Paciente e seu ciclo de vida depende totalmente dele.

Agregação (Relação Fraca): Representada pelo losango vazio entre Consulta e Exame. Uma Consulta pode ter um Exame, mas eles têm ciclos de vida independentes (o Exame é criado fora e "agregado" à consulta).