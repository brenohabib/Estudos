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

>[!example] Exemplo
Considere a expressão *P → (Q ∧ R)*. Sua tabela verdade é construída considerando todas as combinações possíveis de valores de verdade para P, Q e R, e determinando o valor de verdade de *P → (Q ∧ R)* para cada combinação.
>
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

### Propriedade Semântica

#### Tautologia

Seja H uma fórmula da Lógica Proposicional, então: H é uma tautologia, se, e somente se, para toda interpretação I, I\[H] = T

>[!example] Exemplo
>- H = (P V ~P) é uma tautologia
>- Toda interpretação I, I\[H] = T
>- Toda interpretação I, I\[(P V ~P)] = T
>- Toda interpretação I, I\[P] = T ou I\[~P] = T

#### Satisfatibilidade

Seja H uma fórmula da Lógica Proposicional, então: H é uma fórmula satisfazível, se, e somente se, existe interpretação I, I\[H] = T

Seja $\beta$ o conjunto de fórmulas da Lógica Proposicional, $\beta$ = {$H_1, H_2, H_3, ...$} então ela é satisfazível se todos os elementos do conjunto for verdade

Um conjunto é insatisfazível se houver ao menos um elemento do conjunto sendo falso

>[!example] Exemplo
>- H = (P V Q) é satisfazível 
>- H = (P ^ Q) é satisfazível
> Satisfazível por possuir *ao menos* uma verdade:
> 
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

#### Contingência

Seja H uma fórmula da Lógica Proposicional. Então: H é uma contingência, se, e somente se, existirem interpretações I e J, tais que I\[H] = T e J\[H] = F

#### Contradição

Seja H uma fórmula da Lógica Proposicional, Então: H é uma contradição se, e somente se, para toda I\[H] = F
