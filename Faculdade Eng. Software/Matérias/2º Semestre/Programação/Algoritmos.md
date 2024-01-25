---
tags: fundamentos
referências: https://rockcontent.com/br/blog/algoritmo/
data: 10/07/2023
---

## Resumo

É uma **rotina padronizada** e **sistemática** com *um objetivo a ser alcançado*. Vários Algoritmos formam um [[Software]] que futuramente pode se tornar mais complexo e virar um [[Sistema]].

---
## Introdução
Um algoritmo é uma **rotina**, sendo repetida para sempre *chegar a um objetivo*. Um conjunto de algoritmos podem estar sendo encaixados uns aos outros, sendo *várias rotinas* com um **objetivo único**.
![[Rotina.png]]
>[!tip] Curiosidade
>A origem da palavra “algoritmo” remete a **Al Khowarizmi**, famoso matemático árabe do século IX.

## Como Funcionam
Por ser uma sequência, gerar um resultado esperado e requer que alguém ou algo o faça, ele necessita de entradas (Inputs) e saídas (Outputs), por exemplo, uma receita de bolo, que exige trigo, leite, ovos, farinha e fermento, o ato de se fazer o bolo pode se considerar como um **processamento ou instruções**, sendo decisões sobre o que deve ser feito e como resultado ele gera um bolo. 
![[Receita de Bolo Simplificada.png]]

## Benefícios ao Usar
Com os algoritmos, podemos *filtrar, automatizar e evoluir*. **Os filtros** são feitos com base do que é utilizado ou visualizado pelo consumidor, por exemplo, o Facebook, que tente a mostrar assuntos mais relevantes com o que o usuário costuma ver. **Automação** é o que pode ser substituído por máquina, normalmente processos repetitivos, o que acaba facilitando a vida do ser humano além de aumentar a eficiência de produção. **A evolução** recentemente está totalmente ligada aos algoritmos, graças a eles que possuímos smart tvs, smartphones e até a própria [[Internet]].

## Representando
Há *três formas* mais conhecidas de se estar *representando um algoritmo*, sendo de forma **narrativa**, que se escreve literalmente como que se deve comportar de forma extensa como por exemplo as receitas, usando **fluxogramas**, que seria uma representação mais gráfica de como o algoritmo funciona e a forma mais utilizada recentemente que é o **pseudo-código** ou **pseudo-linguagem**

### Exemplos

> [!narrativo] Narrativo
> 1. Obter a nota do 1º bimestre; 
> 2. Obter a nota do 2º bimestre; 
> 3. Obter a nota do 3º bimestre; 
> 4. Realizar o cálculo da média para cada aluno (maior ou igual a 7 para aprovação); 
> 5. Informar se o aluno foi “aprovado ou reprovado”; 
> 6. Informar a média obtida pelo aluno.

> [!Fluxograma]
>  ![[Fluxograma.png]]

>[!Pseudo-código]
>*Algoritmo* Somar
>**SE** numero1 **OU** numero2 **NÃO** somável
>	escrever "Número inválido"
>**SENÃO** 
>	ler *numero1*
>	ler *numero2*
>	soma: *numero1* + *numero2*
