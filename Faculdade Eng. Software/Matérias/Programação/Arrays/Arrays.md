---
tags: fundamentos, programação
referências: https://kenzie.com.br/blog/o-que-array/, https://blog.betrybe.com/linguagem-de-programacao/o-que-e-array/
data: 27/07/2023
---
## Resumo

Os *arrays* (*também chamado vetores*) é uma [[Classe]] que serve para manipular [[Conjuntos]]. Ele é **uma única variável pode armazenar vários valores** que dependendo da linguagem esse conjunto de valores *podem ser do mesmo tipo ou não*.

---
## Introdução
---

![[Desenho Array|600]]
Sua **finalidade** é principalmente *conter vários dados em uma coleção de dados* ao invés de individualmente, o que *facilita bastante acessa-los futuramente*.

Um array contém **valores fixos**, mas *podem ser manipulados* com algumas regras. Normalmente, os arrays possuem também um **tamanho fixo** quando declarado diretamente, e pode conter até aquela quantia de valores.

Assim como os [[Conjuntos]], os arrays **possuem elementos** e são **acessados pelo índice** (*normalmente começando com 0*). Normalmente são utilizados para *trocar elementos, acrescentar* e até *contar todos eles de maneira imediata* sendo assim uma das *melhores formas de organizar dados* na área da programação.

>[!hint] Dica
>Por o *índice começar com 0*, tome cuidado ao pegar o **PRIMEIRO** elemento do array.
>
>
> |índice|Posição|
> |------|--------|
> |    0    |1ª Posição|
> |     1    |2ª Posição|
> |     2   |3ª Posição|
> |     3   |4ª Posição|
> ---


>[!caution] Cuidado
>[[Vetores]] e Arrays **não são a mesma coisa**, os dois *possuem suas características* e *finalidades*.
>De forma resumida, *os arrays podem possuir mais do que um índice, diferente dos vetores cada elemento é caracterizado em um único índice*

## Manipulando um Array
---
Um exemplo de *declaração de array* em [[Java]]:

### Array de dimensão única

```Java
public class ExemploJava {
	public static void main(String[] args) {
		
		double[] notas = {5.5, 8.7, 6.0, 7.9};
		
		//OU
		
		double[] notas = new double[4];
		notas[0] = 5.5;
		notas[1] = 8.7;
		notas[2] = 6.0;
		notas[3] = 7.9;
	}
}
```


### Array com múltiplas dimensões

```Java
class ArrayMultidimensional {
	public static void main(String[] args) {
		//Declaração de array aninhado
		double[][] larguraAltura = {{2, 3}, {3, 4}};
		
		/*Multiplicação do primeiro conjunto e primeiro elemento com          primeiro conjunto e segundo elemento */
		double area = larguraAltura[0][0] * larguraAltura[0][1];
		
		/*Multiplicação do segundo conjunto e primeiro elemento com segundo conjunto e segundo elemento */
		double area2 = larguraAltura[1][0] * larguraAltura[1][1];
		
	}
}
```
