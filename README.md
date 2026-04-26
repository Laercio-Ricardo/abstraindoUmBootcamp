# 🚀 Abstraindo um Bootcamp com Orientação a Objetos em Java

Projeto desenvolvido para consolidar os pilares da **Programação Orientada a Objetos (POO)** no ecossistema Java. O objetivo é simular a estrutura de um Bootcamp, gerindo conteúdos (Cursos e Mentorias), inscrições de Desenvolvedores e progressão de aprendizagem.

## 🧠 Conceitos Aplicados

Durante o desenvolvimento, foram explorados os quatro pilares fundamentais da POO:
- **Abstração:** Criação da classe base `Conteudo` para representar elementos comuns.
- **Encapsulamento:** Proteção de dados sensíveis e acesso controlado via Getters e Setters.
- **Herança:** Especialização das classes `Curso` e `Mentoria` a partir de uma classe pai.
- **Polimorfismo:** Implementação do método `calcularXp()` com diferentes comportamentos para cada tipo de conteúdo.

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java (versão 21+)
- **IDE:** IntelliJ IDEA
- **Gestão de Versão:** Git & GitHub
- **Paradigma:** Orientação a Objetos

## 📂 Estrutura do Projeto

O domínio da aplicação foi estruturado da seguinte forma:
- **Conteudo (Abstrata):** Atributos comuns como Título e Descrição.
- **Curso:** Inclui carga horária e lógica específica de XP.
- **Mentoria:** Inclui data da mentoria e bónus de XP.
- **Bootcamp:** Agrupador de conteúdos e devs inscritos.
- **Dev:** Entidade que representa o aluno, com métodos para inscrição e progressão.

## 🚀 Como Executar

