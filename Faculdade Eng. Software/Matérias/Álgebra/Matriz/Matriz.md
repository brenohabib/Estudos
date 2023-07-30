---
tags: fundamentos, álgebra, matriz
referências: https://mundoeducacao.uol.com.br/matematica/matriz-1.htm, https://www.youtube.com/watch?v=kDr1CdPuVXo
data: 27/07/2023
---
## Resumo

Matrizes é **uma forma matemática de organizar números** em forma de tabela. Ela sempre é nomeada com, respectivamente, *um número m de linhas e n de colunas* (*m x n*). Podemos usar elas para [calcular matrizes](Calculo%20entre%20Matrizes.md).

---
## Introdução
---
![[Desenho Matriz]]
As matrizes *sempre são representadas entre colchetes, parênteses ou duplas barras*. Os números dentro de uma matriz possui seu **índice** que diz em qual *linha* (*m*) ou *coluna* (*n*) ela está.

Existem vários tipos de matrizes, dentre elas [[triangular superior]], [[triangular inferior]], [[identidade]], [[nula]], [[diagonal]], [[quadrada]], [[linha]], [[coluna]], [[simétrica]] e [[unitária]].

>[!example] Exemplo
>$
>\begin {bmatrix}
>1 & 0\\
>0 & 1
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

Quando uma matriz possui o *mesmo número de linhas e colunas*, nós podemos dizer que ela é **ordem N**, *sendo N representando o número (natural) de linhas e colunas*.

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

