#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#define MAX 5

typedef struct Fila {
    int id[MAX];
    char nome[MAX][50];
    char usuario[MAX][100];
    int inicio, fim;
} Fila;

int verifvazia(Fila *f) {
    return f->inicio == f->fim;
}

int verifcheia(Fila *f) {
    return (f->fim + 1) % MAX == f->inicio;
}

Fila *criarFila() {
    Fila f = malloc(sizeof(Fila));
    f->inicio = 0;
    f->fim = 0;
    return f;
}

void adicionar(Fila *f, int id, char nome[], char usuario[]) {
    if (verifcheia(f)) {
        printf("A fila está cheia!\n");
        return;
    }
    f->id[f->fim] = id;
    strcpy(f->nome[f->fim], nome);
    strcpy(f->usuario[f->fim], usuario);
    f->fim = (f->fim + 1) % MAX;
}

void imprimir(Fila *f) {
    if (verifvazia(f)) {
        printf("A fila está vazia!\n");
        return;
    }
    printf("imprimindo: ID=%d, Nome=%s, Usuario=%s\n", f->id[f->inicio], f->nome[f->inicio], f->usuario[f->inicio]);
    f->inicio = (f->inicio + 1) % MAX; 
}

void exibirFila(Fila *f) {
    if(verifvazia(f)) {
        printf("A fila está vazia.\n");
        return;
    }

    int temp = f->inicio;
    printf("Usuários na fila de espera:\n");

    while(temp != f->fim) {
        printf("%s\n", *f->nome);
        temp = f->inicio + 1;
    }
}

int main() {
    Fila *f = criarFila();

    adicionar(f, 1, "João", "joao");
    exibirFila(f);
    return 0;
}