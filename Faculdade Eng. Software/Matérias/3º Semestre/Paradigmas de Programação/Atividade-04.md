---
tags:
  - paradigma
referências: 
data: 2024-02-24
---
1) Defina a diferença entre: Sintaxe e Semântica. Enviar até o dia 26/02/2024, formatado.

	A **Lógica Proposicional** se assemelha a um universo onde as frases são comparáveis a peças de Lego, sendo combinadas para formar estruturas complexas que podem ser avaliadas como verdadeiras ou falsas, a **Semântica** pode ser interpretada como o significado dessas estruturas.

2) Utilizando as estruturas de controle, que são representação de modelagem, como visto
na última pesquisa que você realizou, construa um algoritmo para calcular este reajuste
salarial: uma empresa quer reajustar os salários dos Gerentes em 20%, dos Técnicos em
30% e dos demais funcionários em 40%.

>Algoritmo
>
	Para cada funcionário na lista de funcionários:
    Se o funcionário for um Gerente:
        Reajustar o salário em 20%
    Senão, se o funcionário for um Técnico:
        Reajustar o salário em 30%
    Senão:
        Reajustar o salário em 40%
	Fim Para


>Java
>
>``` Java
>package paradigmas;
>
>public class Reajuste {
>
    public static float gerente(float salario) {
>	    return salario += salario * 0.2;
> 	}
>
    public static float tecnico(float salario) {
>	    return salario += salario * 0.3;
> 	}
>
    public static float funcionario(float salario) {
>	    return salario += salario * 0.4;
> 	}
>}
>```
