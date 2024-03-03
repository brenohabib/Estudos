---
tags: 
referências: 
data: 2024-02-27
---
Pesquisar sobre metalinguagem e linguagem objeto. Principais diferenças 

**1. Definições:**

- **Metalinguagem:** linguagem utilizada para falar sobre outra linguagem. Ela é um nível superior de linguagem que permite analisar e descrever a linguagem objeto.
- **Linguagem objeto:** linguagem que está sendo analisada pela metalinguagem. É o foco da metalinguagem e pode ser qualquer tipo de linguagem, como português, inglês, linguagem de programação, etc.

>[!example] Por exemplo
>"I love New York é uma sentença com quatro palavras da língua inglesa."
>Onde: "I love New York" é o *objeto* e "...é uma sentença com quatro palavras da língua inglesa" é a *metalinguagem*

**2. Diferença principal:**

A principal diferença entre metalinguagem e linguagem objeto está no **seu papel**:

- **Metalinguagem:** fala sobre a linguagem.
- **Linguagem objeto:** é o que a metalinguagem fala sobre.

**3. Demonstração**

Apresentamos duas demonstrações, uma informal e outra mais formal, com notação matemática para demonstrar se ela é satisfatível. Primeiro a informal:

H é *tautologia*  ⇔ para toda linha da tabela-verdade associada a H, temos H é verdadeira,
			⇒ existe linha da tabela-verdade associada a H, tal que H é verdadeira,
			⇔ H é satisfatível.

A demonstração correspondente, utilizando notação matemática é:

H é *tautologia*  ⇔ ∀ I, I\[H] = T,
			⇒ ∃ I; I\[H] = T,
			⇔ H é satisfatível.

>[!hint] servação
Observe que na segunda linha dessa demonstração aparece o símbolo ⇒. Isso ocorre porque:
>
{ ∀ I, I\[H] = T } implica { ∃ I, I\[H] = T}.
>
O inverso, porém, é falso. Ou seja:
>
{ ∃ I, I\[H] = T } não implica { ∀ I, I\[H] = T}.
