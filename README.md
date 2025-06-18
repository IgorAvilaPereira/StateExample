# StateExample

Implementação prática do padrão de projeto **State**, utilizando como exemplo os diferentes estados do personagem **Super Mario Bros**.

---

## 🎮 O que é o padrão State?

O padrão de projeto **State** permite que um objeto altere seu comportamento quando seu estado interno muda. Ele é útil quando um objeto precisa comportar-se de maneira diferente dependendo do seu estado atual, sem recorrer a múltiplas instruções condicionais.

---

## 🕹️ Exemplo prático: Super Mario Bros

No repositório, o comportamento do personagem Mario é modelado por meio de estados que representam suas diferentes condições no jogo, como:

* **Mario Pequeno**
* **Mario Grande**
* **Mario com Super Cogumelo**
* **Mario com Fogo**
* **Mario Invencível**
* 
Cada estado implementa a interface comum `MarioState`, permitindo que o objeto Mario altere seu comportamento conforme seu estado atual.

---

## 🛠️ Tecnologias utilizadas

* **Java**: Linguagem de programação utilizada para implementar o padrão State.
* **GitHub**: Plataforma de hospedagem de código-fonte e controle de versão.

---

## 📚 Como utilizar

1. **Clonar o repositório**:

   ```bash
   git clone https://github.com/IgorAvilaPereira/StateExample.git
   cd StateExample
   ```

2. **Compilar e executar**:

   Utilize sua IDE favorita ou a linha de comando para compilar e executar a classe principal que demonstra a troca de estados do personagem Mario.

---

## 🎯 Objetivo do repositório

Este repositório serve como um exemplo educacional para ilustrar a aplicação do padrão de projeto State em Java, facilitando o entendimento de como gerenciar comportamentos dinâmicos de objetos através da mudança de seus estados internos.
