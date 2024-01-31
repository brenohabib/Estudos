---
tags: 
referências: 
data: 2024-01-30
---
## O que são Funções e Procedimentos?

Funções e procedimentos são blocos de código que podem ser nomeados e chamados a partir de um programa. Uma função pode ser empregada para evitar repetição de código e assim facilitar a manutenção do código do programa.

### Procedimento

Executa apenas o código dentro dele, não retornando nenhum resultado.

 ```Java
 public static void hello(){
 	System.out.print("Hello World");
}
 ```

### Função

Executa um código e retorna um valor para ser utilizado.

 ```Java
 public static String hello(){
 	return "Hello World";
 }
 ```

### Argumentos

Argumentos (também conhecido como parâmetros) são variáveis em que se passa em um procedimento ou função em que se utiliza dentro do bloco de código

```Java
public static void hello(String world){
	System.out.print(world);
}

public static String hello(String world){
	return world; }
```