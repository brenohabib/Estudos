---
tags:
  - lógica
referências: 
data: 2024-02-08
---
### Resumo do Capítulo 2: Tabelas Verdade

No segundo capítulo, mergulhamos no estudo das tabelas verdade, uma ferramenta fundamental na lógica proposicional para determinar os valores de verdade de expressões complexas em função dos valores de verdade de suas proposições componentes.

#### Definições Principais

- **Tabela Verdade:** Uma tabela que mostra todas as combinações possíveis de valores de verdade para as proposições componentes de uma expressão e o valor de verdade resultante da expressão.
- **Interpretação:** Associação de valores de verdade às proposições componentes de uma expressão.
- **Valores de Verdade:** Verdadeiro (V) ou Falso (F).

#### Definições Detalhadas

1. **Tabela Verdade para Conectivos Básicos:** Mostra os valores de verdade de proposições individuais, como P e Q.
2. **Tabela Verdade para Conectivos Compostos:** Expõe as combinações de valores de verdade para expressões que envolvem conectivos lógicos, como ¬P, P ∨ Q, P ∧ Q, P → Q e P ↔ Q.
3. **Avaliação de Expressões:** Como determinar o valor de verdade de expressões compostas com base na tabela verdade dos conectivos envolvidos.
4. **Equivalência de Expressões:** Duas expressões são equivalentes se possuem tabelas verdade idênticas.
5. **Contradição e Tautologia:** Uma expressão é uma contradição se sua tabela verdade contém apenas Falsos; é uma tautologia se contém apenas Verdadeiros.

#### Exemplo

Considere a expressão *P → (Q ∧ R)*. Sua tabela verdade é construída considerando todas as combinações possíveis de valores de verdade para P, Q e R, e determinando o valor de verdade de *P → (Q ∧ R)* para cada combinação.

| P | Q | R | Q ∧ R | P → (Q ∧ R) |
|---|---|---|-------|------------|
| V | V | V |   V   |      V     |
| V | V | F |   F   |      F     |
| V | F | V |   F   |      F     |
| V | F | F |   F   |      F     |
| F | V | V |   V   |      V     |
| F | V | F |   F   |      V     |
| F | F | V |   F   |      V     |
| F | F | F |   F   |      V     |
