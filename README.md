## Sistema Médico: Projeto de POO em Java!

## Meu nome é Rafael Dalavale Kaiser Pinto, e este aqui é o meu projeto final para a disciplina de Programação Orientada a Objetos (POO).

O Sistema Médico foi o meu desafio para provar que eu entendi a POO, criando algo funcional e que simula processos de uma clínica.

## O Que É Este Sistema e o Que Eu Fiz?

Meu objetivo foi modelar as entidades e interações de saúde em Java. O sistema faz duas coisas principais:

## Demonstração da Teoria (POO na Prática): No início da execução, o código roda automaticamente um bloco que prova que os pilares da POO estão funcionando:

- Herança: Eu fiz o médico, enfermeiro e paciente herdarem de uma classe Pessoa base.

- Polimorfismo: Cada um desses personagens tem uma rotina diferente (o médico faz o dele, o paciente o dele).

- Associações e Agregação: Eu mostro como um médico prescreve uma receita para um paciente e como um exame é agregado a uma consulta.

- Composição: O histórico médico só existe se houver um paciente.

- Menu Interativo (Gerenciamento de Pacientes): Depois da demonstração, o sistema abre um menu simples onde o usuário pode interagir. Eu implementei a arquitetura Model-View-Controller (MVC) para gerenciar os dados dos pacientes, permitindo:

- Cadastrar novos pacientes.

- Listar todos os pacientes.

- Buscar um paciente por ID e atualizar o endereço dele (as funções CRUD mais importantes).

## A parte mais difícil não foi escrever o código da clínica, mas sim fazer ele rodar corretamente.

## O Problema: Quando eu introduzi a arquitetura MVC (o PacienteController.java e o menu), o meu ambiente de desenvolvimento começou a dar um erro chato de "unresolved compilation problem". Basicamente, o compilador não conseguia enxergar o novo código, mesmo ele estando no lugar certo.

## A Solução: Eu tive que ignorar o sistema automático do meu editor e usar comandos manuais no terminal (javac para compilar e java -cp . para executar). Isso forçou o sistema a enxergar todos os arquivos de uma vez e provou que o código estava correto o tempo todo—o problema era só de configuração.

- Foi um desafio técnico que me ensinou muito sobre como o Java realmente funciona por baixo dos panos!

## Como Rodar o Sistema

- O sistema está 100% funcional. É só seguir estes passos:

- Clone o Repositório: Traga o projeto para o seu computador.

- git clone [link do seu GitHub]

- Abra o Projeto: Use o seu editor de código preferido.

- Execute o Main: Rode o método main que está em app/Main.java.

## Aproveite: O programa vai rodar a demonstração de POO e, em seguida, abrir o Menu Principal onde você pode testar as funções de gerenciamento de pacientes.