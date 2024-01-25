---
tags: fundamentos, código_limpo
referências: https://www.youtube.com/watch?v=O5aWwBXPoh4, https://www.hostgator.com.br/blog/clean-code-o-que-e/, https://balta.io/artigos/clean-code
data: 29/07/2023
---
## Resumo

O **código limpo** é manter o código *fácil de entender* que consequentemente causa um monte de benefícios tanto para si mesmo quanto para uma equipe de programadores.

>[!hint] Dica
>Quando se está *aprendendo a programar*, **não se esforce para manter o código limpo**, sem nem ao menos saber o que é fazer um código funcional. 
>
>Saber o básico para *manter o código entendível é importante*, mas muitas técnicas podem fazer você desistir de programar, por ser "complicado" demais.

---
## Introdução

![[Desenho Clean|600]]

Com certeza alguém já se deparou com um código que era *difícil de se entender*, e não é por falta de conhecimento, era por *ser mal feito* mesmo, até nós mesmos já fizemos algum código na vida em que *voltamos e não entendia* nem a finalidade de uma determinada variável.

Basicamente, o **Clean Code** visa *melhorar esses códigos*, deixando eles *fácil de se entender*, que causa muitos *benefícios futuros*, como por exemplo, a *manutenibilidade do código*.


## Aplicação
Existem *quatro pontos* fundamentais do Clean Code:

 * ***SOC*** = *Separation Of Concerns* ( Separe os interesses )
 * ***DRY*** = *Don't Repeat Yourself* ( Não repita a si mesmo )
 * ***DIE*** = *Duplication Is Evil* ( Duplicação é mau )
 * ***KISS*** = *Keep It Simple, Stupid* ( Mantenha-o simples, estúpido )

| Conceito    | Explicação                                                                                                                                                                                    | 
| ---------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ***SOC***   | **Não repita código, nunca**. Se você ver um *problema similar* a um que você já resolveu, *não repita o mesmo código, reaproveite*.                                                          |
| ***DRY***  | **Não repita código, nunca**. Se você ver um *problema similar* a um que você já resolveu, *não repita o mesmo código, reaproveite*.                                                          |
| ***DIE***  | **Utilize o que já foi feito**. Mantenha as funções *fazendo uma única coisa* e *não repita essa mesma funcionalidade posteriormente*.                                                        |
| ***KISS*** | **Evite complexidade, mantenha simples se possível**. Código complexo sem necessidade é um *desperdício de esforço e atrapalha a todos*. Há alguns cuidados a ser tomados: [[Conceitos KISS]] |
