---
tags:
  - lógica
referências: 
data: 2024-02-01
---
## O que é Lógica Proposicional

Imagine um universo onde as frases são como peças de Lego. A Lógica Proposicional te ensina a *combinar* essas peças para construir frases complexas, definindo se elas são **verdadeiras** ou **falsas**.

## Alfabeto da Lógica Proposicional

- **Fórmula:** Uma *frase* simples (P) ou uma *frase* complexa *formada por conectivos* (P v Q, ~P, P ^ Q).
- **Negação:** "Não P" é o contrário de P. Por exemplo: "Está chovendo" vira "Não está chovendo".
- **Disjunção:** "P ou Q" é verdadeira se pelo menos uma frase for verdadeira. Por exemplo: "Está frio ou está nublado".
- **Conjunção:** "P e Q" é verdadeira se ambas as frases forem verdadeiras. Por exemplo: "Está frio e está nublado".
- **Condicional:** "Se P então Q" é verdadeira se P for falsa ou se ambas forem verdadeiras. Por exemplo: "Se está frio, então está nublado".
- **Bi condicional:** "P se e somente se Q" é verdadeira se ambas as frases tiverem o mesmo valor (verdadeiro ou falso). Por exemplo: "Está frio se e somente se está nublado".


Definição 1.1

- **Símbolos de pontuação:** como *parênteses* "()" para organizar as frases.
- **Símbolos proposicionais:** *letras maiúsculas* (P, Q, R...) que representam frases simples.
- **Conectivos proposicionais:** conectivos que *combinam frases*, como "não", "ou", "e", "se... então", "senão".

Definição 1.2
- Todo símbolo proposicional é uma formula
- Se H é uma fórmula, então (~H), a negação de H, é uma fórmula
- Se H e G são fórmulas, então a disjunção de H e G: dada por (H v G), é uma fórmula
- Se H e G são fórmulas, então a conjunção de H e G: dada por (H ^ G) é uma fórmula

Definição 1.3
 A ordem de precedência dos conectivos lógicos, da maior para a menor, é a seguinte:

1. **Negação (¬)**
2. **Conjunção (∧)**
3. **Disjunção (∨)**
4. **Implicação (→)**
5. **Equivalência (↔)**
## Características sintáticas das fórmulas

Definição 1.4
- Se H = P, então comp\[H] = 1
- comp\[~H] = comp\[H] + 1
- comp\[H v G] = comp\[H] + 1 + comp\[G]

Definição 1.5
- H é uma subfórmula de H
- se H é uma fórmula do tipo (~G), então G é uma subfórmula de H

 Subfórmula é o cabeçalho da tabela verdade

Definição 1.6
Notação Polonesa
- Todo símbolo proposicional é uma fórmula
- Se H e G são fórulas, então a disjunção de H e G é dada por vHG; é uma fórmula
- Se H e G são fórmulas então a conjunção de H e G é dada por ^ HG; é uma fórmula

