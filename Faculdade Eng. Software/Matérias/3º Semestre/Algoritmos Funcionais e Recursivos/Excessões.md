---
tags:
  - atividade
referências: 
data: 2024-04-17
---
1) O que é uma exceção em Java?
   São anormalidades no código, sendo representado como erros.
   
2) Explique a hierarquia de exceções em Java. O que é a classe base para todas as exceções?
   A hierarquia de exceções em Java é organizada em uma estrutura de árvore, com a classe `java.lang.Throwable` como a raiz. `Throwable` é a classe base para todas as exceções e erros em Java. Duas subclasses principais de `Throwable` são `Exception` e `Error`. `Exception` é a classe base para exceções que podem ser tratadas pelo programa, enquanto `Error` é a classe base para exceções que geralmente indicam problemas graves que não podem ser tratados pelo programa.
   
3) Como funciona o bloco try-catch em Java?
   O código que pode gerar uma exceção é colocado dentro do bloco `try`, e qualquer exceção que ocorrer durante a execução desse código será capturada por um ou mais blocos `catch` que seguem o bloco `try`.
   
4) Qual é o propósito do bloco finally? Em que situações é executado?
   O bloco `finally` garante que determinadas operações sejam executadas, independentemente do resultado do código dentro do bloco `try`.
   
5) Assinale a alternativa correta. Qual das seguintes afirmações é verdadeira sobre exceções em Java?
a) Todas as exceções em Java são verificadas.
**b) Todas as exceções em Java não são verificadas.**
c) Java não suporta exceções.
d) Java só suporta exceções personalizadas.

6) Assinale a alternativa correta. O que é um bloco try-catch em Java usado para?
a) Lançar exceções
**b) Capturar e tratar exceções**
c) Definir variáveis
d) Realizar operações matemáticas

7) Verdadeiro ou Falso: O bloco finally é sempre executado, independentemente de ocorrer ou não uma exceção.
Verdadeiro.

8) Verdadeiro ou Falso: Uma exceção personalizada em Java é uma exceção que é sempre
definida pelo programador e não faz parte da biblioteca padrão.
Verdadeiro.

9) Verdadeiro ou Falso: Em Java, é possível ter múltiplos blocos catch para o mesmo bloco try.
Verdadeiro.
   
10) Crie uma classe chamada Calculadora que contenha um método dividir que aceita dois
números como parâmetros e divide o primeiro pelo segundo. Use throws para indicar que esse método pode lançar uma exceção personalizada chamada DivisaoPorZeroException se o
denominador for zero. Escreva um programa principal que chama esse método e lida com a
exceção.
Anexado.

11) Crie uma classe chamada ValidadorDeIdade que contenha um método chamado verificarIdade que aceita uma idade como parâmetro. Use throw para lançar uma exceção IllegalArgumentException se a idade for menor que 18. Escreva um programa principal que chama esse método e lida com a exceção.
Anexado.

12) Crie uma classe chamada ConversorDeTemperatura que contenha um método
converterCelsiusParaFahrenheit que aceita uma temperatura em graus Celsius como parâmetro e retorna a temperatura equivalente em graus Fahrenheit. Use throws para indicar que esse método pode lançar uma exceção personalizada chamada TemperaturaInvalidaException se a temperatura em graus Celsius for menor que -273.15 (zero absoluto). Use throw para lançar essa exceção se a condição for atendida. Escreva um programa principal que chama esse método e lida com a exceção. A conversão é dada pela fórmula: (°C × 9/5) + 32.
Anexado.