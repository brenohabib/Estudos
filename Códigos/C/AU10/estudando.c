#include <stdio.h>
#include <stdlib.h>
#include <string.h>


typedef struct Planeta {
    char nome[50];
    double diametro;
    double distsol;
    struct Planeta* prox;
}Planeta;

Planeta* criarPlaneta(char* nome, double diametro, double distsol) {
    Planeta* planeta = malloc(sizeof(Planeta));
    strcpy(planeta->nome, nome);
    planeta->diametro = diametro;
    planeta->distsol = distsol;
    planeta->prox = NULL;
    return planeta;
}

void inserirInicioPlaneta(Planeta** lista, char* nome, double diametro, double distsol) {
    Planeta* novoPlaneta = criarPlaneta(nome, diametro, distsol);
    novoPlaneta->prox = *lista;
    *lista = novoPlaneta;
}

void inserirFinalPlaneta(Planeta** lista, char* nome, double diametro, double distsol) {
    Planeta* novoPlaneta = criarPlaneta(nome, diametro, distsol);
    if(*lista == NULL) {
        *lista = novoPlaneta;
    } else {
        Planeta* temp = *lista;
        while (temp->prox != NULL) {
            temp = temp->prox;
        }
        temp->prox = novoPlaneta;
    }
}

void exibirLista(Planeta* lista) {
    if (lista == NULL) {
        printf("A lista esta vazia");
        return;
    }
    Planeta* temp = lista;
    while(temp != NULL) {
        printf("Nome do planeta: %s\n", temp->nome);
        printf("Diametro do planeta: %.2f\n", temp->diametro);
        printf("Distancia do Sol: %.2f\n\n", temp->distsol);
        temp = temp->prox;
    }
}

void limparLista(Planeta** lista) {
    Planeta* temp;
    while (*lista != NULL) {
        temp = *lista;
        *lista = (*lista)->prox;
        free(temp);
    }
    printf("Memoria liberada com sucesso");
}

int main() {
    Planeta* lista = NULL;

    inserirInicioPlaneta(&lista, "Mercúrio", 4879.4, 57.91) ;
    inserirFinalPlaneta(&lista, "Vênus", 12104, 108.2);
    inserirFinalPlaneta(&lista, "Terra", 12742, 149.6);
    inserirFinalPlaneta(&lista, "Marte", 6779, 227.9);

    exibirLista(lista);

    limparLista(&lista);

    return 0;
}
