# 🚀 Abstraindo um Bootcamp com Orientação a Objetos em Java

Projeto desenvolvido para consolidar os pilares da **Programação Orientada a Objetos (POO)** no ecossistema Java. Este projeto simula a gestão de um Bootcamp, modelando entidades complexas e suas interações.

## 📊 Arquitetura do Sistema (Abstração)

Com base no mapeamento de domínio do projeto, a estrutura de classes foi desenhada para maximizar a reutilização de código e a organização lógica:

### 1. Núcleo de Conteúdos (Herança e Polimorfismo)
Para evitar a repetição de atributos, foi implementada uma estrutura de herança:
- **Classe Abstrata `Conteúdo`**: Define a base para qualquer atividade do Bootcamp, contendo `titulo` e `descricao`. 
- **Método `calcularXp()`**: Um método abstrato que obriga as subclasses a implementarem sua própria lógica de pontuação.
    - **`Curso`**: Especialização que adiciona `cargaHoraria`. O XP é calculado com base na duração.
    - **`Mentoria`**: Especialização que adiciona `data`. Possui um bônus fixo de XP.

### 2. Gestão de Alunos (`Dev`)
Representa o usuário do sistema com as seguintes capacidades:
- **Inscrição em Bootcamp**: Adiciona o dev ao bootcamp e vincula todos os conteúdos à sua trilha.
- **Progressão**: Método `progredir()` que move um conteúdo da lista de "Inscritos" para "Concluídos", acumulando XP automaticamente.

### 3. Entidade `Bootcamp`
O agregador principal que conecta tudo:
- Gerencia uma lista única de **Conteúdos** e de **Devs Inscritos**.
- Utiliza a API de **Collections (`LinkedHashSet`)** para garantir que a ordem de inscrição seja mantida e que não haja duplicidade de conteúdos ou alunos.

## 🧠 Conceitos de Engenharia Aplicados

- **Abstração:** Modelagem de entidades do mundo real para classes Java.
- **Encapsulamento:** Atributos protegidos e acesso via métodos assessores.
- **Polimorfismo:** Diferentes comportamentos para o cálculo de XP em uma mesma referência de `Conteúdo`.
- **Tratamento de Datas:** Uso da API `java.time.LocalDate`.

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java (OpenJDK 26 - Preview)
- **IDE:** IntelliJ IDEA
- **Versionamento:** Git e GitHub (integração direta via IDE)
