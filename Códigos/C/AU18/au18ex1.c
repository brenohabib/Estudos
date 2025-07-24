#include <stdio.h>
#include <stdlib.h>

#define TAMANHO_TABELA 10

typedef struct No {
    int chave;
    int valor;
    struct No* proximo;
} No;

typedef struct {
    No* elementos[TAMANHO_TABELA];
} TabelaHash;

No* criarNo(int chave, int valor) {
    No* novoNo = (No*)malloc(sizeof(No));
    if (novoNo != NULL) {
        novoNo->chave = chave;
        novoNo->valor = valor;
        novoNo->proximo = NULL;
    }
    return novoNo;
}

int funcaoHash(int chave) {
    return chave % TAMANHO_TABELA;
}

void inicializarTabela(TabelaHash* tabela) {
    for (int i = 0; i < TAMANHO_TABELA; i++) {
        tabela->elementos[i] = NULL;
    }
}

void inserir(TabelaHash* tabela, int chave, int valor) {
    int indice = funcaoHash(chave);
    No* novoNo = criarNo(chave, valor);

    if (novoNo == NULL) {
        printf("Erro ao alocar memória!\n");
        return;
    }

    if (tabela->elementos[indice] == NULL) {
        tabela->elementos[indice] = novoNo;
    } else {
        No* atual = tabela->elementos[indice];
        while (atual->proximo != NULL) {
            atual = atual->proximo;
        }
        atual->proximo = novoNo;
    }
}

void imprimirTabela(TabelaHash* tabela) {
    for (int i = 0; i < TAMANHO_TABELA; i++) {
        printf("\nÍndice %d:", i);
        No* atual = tabela->elementos[i];

        if (atual == NULL) {
            printf(" -> NULL");
        } else {
            while (atual != NULL) {
                printf(" -> (Chave: %d, Valor: %d)", atual->chave, atual->valor);
                atual = atual->proximo;
            }
        }
    }
    printf("\n");
}

void liberarTabela(TabelaHash* tabela) {
    for (int i = 0; i < TAMANHO_TABELA; i++) {
        No* atual = tabela->elementos[i];
        while (atual != NULL) {
            No* temp = atual;
            atual = atual->proximo;
            free(temp);
        }
        tabela->elementos[i] = NULL;
    }
}

void dividirTabela(TabelaHash* tabelaOriginal, TabelaHash* Tabela1, TabelaHash* Tabela2) {
    inicializarTabela(Tabela1);
    inicializarTabela(Tabela2);

    for (int i = 0; i < TAMANHO_TABELA; i++) {
        No* atual = tabelaOriginal->elementos[i];
        while (atual != NULL) {
            if (atual->chave % 2 == 0) {
                inserir(Tabela1, atual->chave, atual->valor);
            }
            else {
                inserir(Tabela2, atual->chave, atual->valor);
            }
            atual = atual->proximo;
        }
    }
}

int main() {
    TabelaHash tabelaOriginal, Tabela1, Tabela2;

    inicializarTabela(&tabelaOriginal);

    inserir(&tabelaOriginal, 2, 20);   // par
    inserir(&tabelaOriginal, 5, 50);   // ímpar
    inserir(&tabelaOriginal, 8, 80);   // par
    inserir(&tabelaOriginal, 11, 110); // ímpar
    inserir(&tabelaOriginal, 14, 140); // par
    inserir(&tabelaOriginal, 17, 170); // ímpar

    printf("Estado da Tabela Hash Original:\n");
    imprimirTabela(&tabelaOriginal);

    dividirTabela(&tabelaOriginal, &Tabela1, &Tabela2);

    printf("\nEstado da Tabela1 (Chaves Pares):\n");
    imprimirTabela(&Tabela1);

    printf("\nEstado da Tabela2 (Chaves Ímpares):\n");
    imprimirTabela(&Tabela2);

    liberarTabela(&tabelaOriginal);
    liberarTabela(&Tabela1);
    liberarTabela(&Tabela2);

    return 0;
}