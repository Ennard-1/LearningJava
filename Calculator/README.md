# Projeto Calculadora CLI

Este projeto simples em Java é uma calculadora básica que opera via linha de comando, permitindo ao usuário inserir números e escolher operações aritméticas para obter resultados.

---

## Conceitos Aprendidos

### 1. Entrada e saída de dados
- Uso da classe `Scanner` para capturar entrada do usuário via teclado.
- Exibição de mensagens e resultados no console com `System.out.println`.

### 2. Estrutura de classes e métodos
- Definição de uma classe `Calculator` com métodos para diferentes funcionalidades.
- Criação de métodos que retornam valores, como `inputNumber()` e `Selector()`.
- Passagem e reutilização de objetos (ex: `Scanner`) entre métodos.

### 3. Controle de fluxo
- Uso do `switch` para selecionar a operação matemática correta com base no operador digitado.
- Tratamento de casos padrão (`default`) para operadores inválidos.

### 4. Conversão de tipos
- Conversão de strings para números inteiros com `Integer.parseInt()` para manipulação matemática.

### 5. Manipulação de variáveis e tipos primitivos
- Declaração e uso de variáveis do tipo `int` para armazenar números e resultados.
- Uso de variáveis locais dentro dos métodos.

### 6. Boas práticas
- Evitar criação múltipla de objetos Scanner para a mesma entrada padrão (`System.in`).
- Fechar o Scanner ao final do programa para evitar vazamento de recursos.

