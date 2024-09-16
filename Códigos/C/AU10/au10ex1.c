#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Planeta {
    char nome[50];
    double diametro;
    double distancia;
    struct Planeta* prox;
} Planeta;

Planeta* criarPlaneta(char* nome, double diametro, double distancia) {
    Planeta* novoPlaneta = malloc(sizeof(Planeta));
    strcpy(novoPlaneta->nome, nome);
    novoPlaneta->diametro = diametro;
    novoPlaneta->distancia = distancia;
    novoPlaneta->prox = NULL;
    return novoPlaneta;
}

void inserirInicio(Planeta** lista, char* nome, double diametro, double distancia) {
    Planeta* novoPlaneta = criarPlaneta(nome, diametro, distancia);
    novoPlaneta->prox = *lista;
    *lista = novoPlaneta;
}

void inserirFim(Planeta** lista, char* nome, double diametro, double distancia) {
    Planeta* novoPlaneta = criarPlaneta(nome, diametro, distancia);
    if (*lista == NULL) {
        *lista = novoPlaneta;
    } else {
        Planeta* temp = *lista;
        while (temp->prox != NULL) {
            temp = temp->prox;
        }
        temp->prox = novoPlaneta;
    }
}

void removerInicio(Planeta** lista) {
    if (*lista == NULL) {
        printf("A lista está vazia.\n");
        return;
    }
    Planeta* temp = *lista;
    *lista = (*lista)->prox;
    free(temp);
    printf("Planeta removido do início.\n");
}

void removerFim(Planeta** lista) {
    if (*lista == NULL) {
        printf("A lista está vazia.\n");
        return;
    }
    if ((*lista)->prox == NULL) {
        free(*lista);
        *lista = NULL;
    } else {
        Planeta* temp = *lista;
        while (temp->prox->prox != NULL) {
            temp = temp->prox;
        }
        free(temp->prox);
        temp->prox = NULL;
    }
    printf("Planeta removido do final.\n");
}

void exibirLista(Planeta* lista) {
    if (lista == NULL) {
        printf("A lista está vazia.\n");
        return;
    }
    Planeta* temp = lista;
    while (temp != NULL) {
        printf("Nome: %s\n", temp->nome);
        printf("Diâmetro: %.2f km\n", temp->diametro);
        printf("Distância do Sol: %.2f milhões de km\n\n", temp->distancia);
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
    printf("Lista liberada da memória.\n");
}

int main() {
    Planeta* lista = NULL;

    inserirInicio(&lista, "Mercurio", 4879.4, 57.91);
    inserirFim(&lista, "Venus", 12104, 108.2);
    inserirFim(&lista, "Terra", 12742, 149.6);
    inserirFim(&lista, "Marte", 6779, 227.9);

    printf("Lista de planetas após insercoes:\n");
    exibirLista(lista);

    removerInicio(&lista);

    printf("\nLista de planetas apos remover o primeiro:\n");
    exibirLista(lista);

    removerFim(&lista);

    printf("\nLista de planetas apos remover o ultimo:\n");
    exibirLista(lista);

    limparLista(&lista);

    return 0;
}
