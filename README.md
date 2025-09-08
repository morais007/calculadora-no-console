📌 Resumo do Projeto: Calculadora em Java

Nome do Projeto: Calculadora Simples em Java

Objetivo:
Desenvolver uma calculadora simples em modo console que permita ao usuário realizar operações matemáticas básicas (soma, subtração, multiplicação e divisão) de forma segura e intuitiva, tratando erros de entrada e exceções de cálculo.

Funcionalidades principais:

Menu interativo para seleção de operações:

Soma (+)

Subtração (-)

Multiplicação (*)

Divisão (/)

Opção para sair do programa (0)

Entrada de números com validação:

Tratamento de entradas inválidas (letras ou caracteres inválidos) usando InputMismatchException.

Tratamento de divisão por zero:

A divisão por zero é detectada, lançando ArithmeticException, com mensagem clara para o usuário.

Loop contínuo:

Permite ao usuário realizar múltiplas operações até escolher sair.

Mensagens amigáveis:

Instruções claras, mensagens de erro detalhadas e confirmação de saída.

Tecnologias e conceitos utilizados:

Linguagem Java

Estrutura de controle do...while para loops

Estrutura switch-case para o menu de operações

Tratamento de exceções (try/catch) para entrada inválida e erros matemáticos

Métodos separados na classe Calculadora para cada operação, seguindo princípios básicos de programação orientada a objetos.

Diferenciais do projeto:

Robustez contra erros de entrada e operações inválidas.

Código organizado com separação entre a interface (Main) e a lógica matemática (Calculadora).

Fácil manutenção e expansão para futuras operações matemáticas.

Resumo de uso:
O usuário abre a calculadora, escolhe a operação desejada, insere os números e recebe o resultado. O programa continua rodando até o usuário decidir sair, garantindo uma experiência segura e amigável.
