#include <stdio.h>
#include <stdlib.h>
#define TAMANHO_TABELA 10

typedef struct No {
    int valor;
    struct No* proximo;
} No;

typedef struct {
    No* elementos[TAMANHO_TABELA];
} TabelaHash;

No* criarNo(int valor) {
    No* novoNo = (No*)malloc(sizeof(No));
    if (novoNo != NULL) {
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

void inserir(TabelaHash* tabela, int valor) {
    int indice = funcaoHash(valor);
    No* novoNo = criarNo(valor);
    
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

void buscar(TabelaHash* tabela, int valor) {
    int indice = funcaoHash(valor);
    No* atual = tabela->elementos[indice];
    int encontrado = 0;
    
    while (atual != NULL) {
        if (atual->valor == valor) {
            printf("Valor %d encontrado no índice %d\n", valor, indice);
            encontrado = 1;
            break;
        }
        atual = atual->proximo;
    }
    
    if (!encontrado) {
        printf("Valor %d não encontrado\n", valor);
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
                printf(" -> %d", atual->valor);
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

int diff(TabelaHash* tabela) {
    int qtd_null = TAMANHO_TABELA;
    for(int i = 0; i < TAMANHO_TABELA; i++) {
        No* atual = tabela->elementos[i];
        if (atual != NULL) {
            qtd_null--;
        }
    }
    return qtd_null;
}

float calcporc(int qtd) {
    return ((float)qtd / TAMANHO_TABELA) * 100;
}

No* clonarNo(No* no) {
    if (no == NULL) {
        return NULL;
    }

    No* novoNo = criarNo(no->valor);

    return novoNo;
}

TabelaHash* clonarTabelaHash(TabelaHash* tabelaOriginal) {
    TabelaHash* tabelaClone = (TabelaHash*)malloc(sizeof(TabelaHash));

    inicializarTabela(tabelaClone);

    for (int i = 0; i < TAMANHO_TABELA; i++) {
        No* atual = tabelaOriginal->elementos[i];

        if (atual == NULL) {
            continue;
        }
        tabelaClone->elementos[i] = clonarNo(atual);
        No* noClonado = tabelaClone->elementos[i];
        while (atual->proximo != NULL) {
            atual = atual->proximo;
            noClonado->proximo = clonarNo(atual);
            noClonado = noClonado->proximo;
        }
    }

    return tabelaClone;
}

int main() {
    float porcentagem;
    TabelaHash tabela;
    inicializarTabela(&tabela);

    // Calcula porcentagem de elementos nulos, retornando 100%, pois a tabela está totalmente nula
    porcentagem = calcporc(diff(&tabela));
    printf("%.2f%%\n", porcentagem);

    inserir(&tabela, 5);
    inserir(&tabela, 15);
    inserir(&tabela, 25);
    inserir(&tabela, 7);
    inserir(&tabela, 17);

    // Calcula a porcentagem de elementos nulos, retornando 80%, pois 2 índices de 10 estão preenchidos
    porcentagem = calcporc(diff(&tabela));
    printf("%.2f%%\n", porcentagem);
    
    printf("\nTabela Hash Original após inserções:");
    imprimirTabela(&tabela);
    
    printf("\nBuscando valores:\n");
    buscar(&tabela, 15);
    buscar(&tabela, 25);
    buscar(&tabela, 10);

    TabelaHash *tabelaclone = clonarTabelaHash(&tabela);
    printf("\nClone da Tabela Hash:");
    imprimirTabela(tabelaclone);

    liberarTabela(&tabela);
    liberarTabela(tabelaclone);
    
    return 0;
}