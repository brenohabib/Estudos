---
tags: fundamentos, programação
referências: https://www.youtube.com/watch?v=22nd99SLgNA, https://www.napratica.org.br/linguagem-de-programacao/
data: 12/07/2023
---
## Resumo

São utilizadas para **criar [[Algoritmos]]** para serem lidos pelos computadores, *traduzindo eles* (compilação) e sendo *executados em linguagem de máquina* (em forma de 1'ns e 0's).

---
## Introdução
---

No geral, é ela que **utilizamos para escrever [[Algoritmos]]** para o computador. Existem várias Linguagens de Programação e cada uma delas possui seu *jeito único de escrever e funcionar*. Várias linguagens podem chegar ao mesmo resultado, mas variando na eficiência, dificuldade de escrita e desempenho.

![[Linguagens de programação.jpg]]

Normalmente programadores usam um [[Ambiente de Desenvolvimento Integrado]] (muito chamado apenas de *IDE*) para escrever esses códigos, que ajudam e bastante completando palavras, mudando de cor, e várias outras coisas, tudo isso para facilitar o entendimento do que está acontecendo na hora de desenvolver um [[Software]].


## Tipos de Linguagem
---

São consideradas como **alto e baixo nível**, sendo as de alto nível mais fáceis de se entender pelas pessoas, por ser uma *linguagem natural*, e as de baixo nível são mais próximas da *linguagem de máquina*, o que acaba sendo mais complexo.
Existem outras formas de classificação podendo levar em conta o [[Paradigma de Programação]], [[Estrutura dos Tipos]], [[Grau de Abstração]], [[Geração]] ou seguir os padrões da **Association for Computing Machinery** que utiliza as seguintes categorias:

>[!Association for Computing Machinery] 
>- Linguagens aplicativas, ou de aplicação
>- Linguagens concorrentes, distribuídas e paralelas
>- Linguagens de fluxo de dados
>- Linguagens de projeto
>- Linguagens extensíveis
>- Linguagens de montagem e de macro
>- Linguagens de micro programação
>- Linguagens não determinísticas
>- Linguagens não procedurais
>- Linguagens orientadas a objeto
>- Linguagens de aplicação especializada
>- Linguagens de altíssimo nível


## Exemplo
---

Um exemplo de uma linguagem de programação é o C:
```C
int main(int argc, char *argv[]) {
	setlocale(LC_ALL, "Portuguese");
	float nota1=0;
	float nota2=0;
	float nota3=0;
	float media=0;
	printf("Insira nota 1: ");
	scanf("%f",&nota1);
	printf("Insira nota 2: ");
	scanf("%f",&nota2);
	printf("Insira nota 3: ");
	scanf("%f",&nota3);
	media = (nota1+nota2+nota3)/3;
if(media>=6){
	printf("Aluno aprovado.\n");
}else{ printf("Aluno reprovado.\n");
	} 
	printf("Média do aluno é: %f",media); 
}
```
