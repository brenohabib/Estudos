---
tags: matriz, álgebra
referências: 
data: 28/07/2023
---

## Soma e Subtração
---
Sempre quando formos calcular duas matrizes, *utilizamos os elementos* dentro dela para *obter uma resposta que ,normalmente, também é outra matriz*.

Para descobrir quais elementos usar na hora de fazer o cálculo, podemos simplesmente *pegar o mesmo índice entre as duas tabelas*.

>[!example] Exemplo
>Um exemplo de *Soma* entre duas matrizes:
>
>*A* = $\begin {bmatrix}\sqrt{9} & \frac{1}{3} & 2^2\\ 3^2 & \sqrt{81} & 8\\ 2^{2} & 0 & \frac{4}{4}\end {bmatrix}$ + *B* = $\begin {bmatrix}\sqrt{4} & 3 & 2^2\\ 2^3 & \sqrt{144} & 10\\ 2^{2} & 0 & \frac{4}{4}\end {bmatrix}$ *A+B* = $\begin {bmatrix} 5 & \frac{10}{3} & 8\\ 17 & 21 & 18\\ 8 & 0 & 2\end {bmatrix}$
>
>Sendo assim, calculada da seguinte forma:
>
> $a_{11} + b_{11} = 5$ , $a_{12} + b_{12} = \frac{10}{3}$ , $a_{13} + b_{13} = 8$
> 
> $a_{21} + b_{21} = 17$ , $a_{22} + b_{22} = 21$ , $a_{23} + b_{18} = 8$
> 
> $a_{31} + b_{31} = 8$ , $a_{32} + b_{32} = 0$ , $a_{33} + b_{33} = 2$
> 
> ---
> O mesmo vale para *subtração* entre duas matrizes:
>
> *A* = $\begin {bmatrix}\sqrt{9} & \frac{1}{3} & 2^2\\ 3^2 & \sqrt{81} & 8\\ 2^{2} & 0 & \frac{4}{4}\end {bmatrix}$ + *B* = $\begin {bmatrix}\sqrt{4} & 3 & 2^2\\ 2^3 & \sqrt{144} & 10\\ 2^{2} & 0 & \frac{4}{4}\end {bmatrix}$ *A-B* = $\begin {bmatrix} 5 & \frac{10}{3} & 8\\ 17 & 21 & 18\\ 8 & 0 & 2\end {bmatrix}$
>
>Sendo assim, calculada da seguinte forma:
>
> $a_{11} - b_{11} = 1$ , $a_{12} - b_{12} = \frac{-8}{3}$ , $a_{13} - b_{13} = 0$
> 
> $a_{21} - b_{21} = 1$ , $a_{22} - b_{22} = -3$ , $a_{23} - b_{23} = 2$
> 
> $a_{31} - b_{31} = 0$ , $a_{32} - b_{32} = 0$ , $a_{33} - b_{33} = 0$
> 


## Multiplicação
---
### Multiplicação de um número e uma matriz
Quando um **elemento *x* multiplica uma matriz A$_{mXn}$**, a multiplicação será feita *elemento por elemento dentro da matriz normalmente*.

>[!example] Exemplo
>*A* = $\begin {bmatrix}
>1 & 2 & 3\\
>4 & 5 & 6
>\end {bmatrix}$ * 6 $=$ $\begin {bmatrix} 6 & 12 & 18\\ 24 & 30 & 36 \end {bmatrix}$

### Multiplicação entre duas matrizes
Uma multiplicação entre duas matrizes é quando os *elementos de uma matriz multiplicam a outra*, formando uma *nova matriz* que tem relação com o tamanho de ambas.

Para multiplicar duas matrizes A e B, as **dimensões devem ser compatíveis**, ou seja, **o número de colunas de A deve ser igual ao número de linhas de B**.

A matriz resultante C terá dimensões correspondentes às *linhas de A e às colunas de B*. A multiplicação de matrizes é distributiva, mas **não comutativa**, ou seja, *AB não é igual a BA*, a menos que ambas sejam matrizes quadradas e idênticas.

