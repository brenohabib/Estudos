---
tags: fundamentos, Álgebra
referências: https://mundoeducacao.uol.com.br/matematica/matriz-1.htm, https://www.youtube.com/watch?v=kDr1CdPuVXo
data: 27/07/2023
---
## Resumo

Matrizes é **uma forma matemática de organizar números** em forma de tabela. Ela sempre é nomeada com, respectivamente, *um número m de linhas e n de colunas* (*m x n*).

---
## Introdução
---
![[Desenho Matriz]]
As matrizes *sempre são representadas entre colchetes, parênteses ou duplas barras*. Os números dentro de uma matriz possui seu **índice** que diz em qual *linha* (*m*) ou *coluna* (*n*) ela está.

>[!example] Exemplo
>$
>\begin {bmatrix}
>0 & 1\\
>1 & 0
>\end {bmatrix}
>$ *É uma matriz* ***2x2***, por ter, respectivamente, *duas linhas e duas colunas*
>
>$
>\begin {pmatrix}
>23 & 4\\
>54 & 2\\
>1 & 20
>\end {pmatrix}
>$ *É uma matrix* ***3x2***, por ter, respectivamente, *três linhas e três colunas*
>
>$
>\begin {Vmatrix}
>10 & 20 & \sqrt{30^2} \\
>40 & \frac{50}{2} & 60
>\end {Vmatrix}
>$ *É uma matriz* ***2x3***, por ter, respectivamente, *duas linhas e três colunas*

## Construção
---
Uma matriz é **representada por uma letra maiúscula do nosso alfabeto** e os **elementos é representado pela mesma letra mas minúscula** (*A =* $[a_{ij}]_{mxn}$) e cada posição pode ser relacionado à outra matriz, *possuindo os mesmos valores dos elementos de mesma posição*.

Quando uma matriz possui o *mesmo número de linhas e colunas*, nós podemos dizer que ela é **ordem n**, *sendo n representando o número de linhas e colunas*.

>[!example] Exemplo
>*A* = $\begin {bmatrix}a11 & a12 & a13\\ a21 & a22 & a23\\ a31 & a32 & a33\end {bmatrix}_{3X3}$ 
>
>É uma matriz de ***ordem 3*** em que *representa apenas as posições dos elementos da matriz*.
>
>*A* = $\begin {bmatrix}a11 & a12\\ a21 & a22\end {bmatrix}_{2X2}$ 
>
>É uma matriz de ***ordem 2***, e assim sucessivamente.
>
>---
>Então, podemos visualizar os elementos da seguinte forma:
>
>*A* = $\begin {bmatrix}\sqrt{9} & \frac{1}{3} & 2^2\\ 3^2 & \sqrt{81} & 8\\ 2^{2} & 0 & \frac{4}{4}\end {bmatrix}$*A* = $\begin {bmatrix}a_{11} & a_{12} & a_{13}\\ a_{21} & a_{22} & a_{23}\\ a_{31} & a_{32} & a_{33}\end {bmatrix}$
>
>Sendo assim, podemos *igualar* os elementos às posições da matriz:
>
> $a_{11} = \sqrt{9}$ , $a_{12} = \frac{1}{3}$ , $a_{13} = 2^2$
> 
> $a_{21} = 3^2$ , $a_{22} = \sqrt{81}$ , $a_{23} = 8$
> 
> $a_{31} = 2^{2}$ , $a_{32} = 0$ , $a_{33} = \frac{4}{4}$


## Cálculo entre matrizes
---

Sempre quando formos calcular duas matrizes, *utilizamos os elementos* dentro dela para *obter uma resposta que também é outra matriz*.

Para descobrir quais elementos usar na hora de fazer o cálculo, podemos simplesmente *pegar o mesmo índice entre as duas tabelas*.

>[!example] Exemplo
>*A* = $\begin {bmatrix}\sqrt{9} & \frac{1}{3} & 2^2\\ 3^2 & \sqrt{81} & 8\\ 2^{2} & 0 & \frac{4}{4}\end {bmatrix}$ + *B* = $\begin {bmatrix}\sqrt{4} & 3 & 2^2\\ 2^3 & \sqrt{144} & 10\\ 2^{2} & 0 & \frac{4}{4}\end {bmatrix}$ *A+B* = $\begin {bmatrix} 5 & \frac{10}{3} & 8\\ 17 & 21 & 18\\ 8 & 0 & 2\end {bmatrix}$
>
>Sendo assim, calculada da seguinte forma:
>
> $a_{11} + b_{11} = 5$ , $a_{12} + b_{12} = \frac{10}{3}$ , $a_{13} + b_{13} = 8$
> 
> $a_{21} + b_{21} = 3^2$ , $a_{22} + b_{22} = \sqrt{81}$ , $a_{23} + b_{23} = 8$
> 
> $a_{31} + b_{31} = 2^{2}$ , $a_{32} + b_{32} = 0$ , $a_{33} + b_{33} = \frac{4}{4}$



R.: S = ሼx = ±4, y = 3, w = 1, t = 4ሽ

R.: S = ቄx = 1, ou x = −2, y = −10, w =
2
3
, t = 0, ou t = ±2ቅ

R.: S = ቄx = −
2
3
, y = 0, ou y = 1, w = 0, t = 0, ou t = 3ቅ

R.: S = ቄx = −
1
8
, y =
11
8
, w = 5, t =
3
4
ቅ