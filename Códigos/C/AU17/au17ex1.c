#include <stdio.h>
#include <stdlib.h>
#define TAMANHO_TABELA 10

#define PRIORIDADE_ALTA 0
#define PRIORIDADE_MEDIA 1
#define PRIORIDADE_BAIXA 2


typedef struct No {
    int valor;
    int prioridade;
    struct No* proximo;
} No;

typedef struct {
    No* elementos[TAMANHO_TABELA];
} TabelaHash;

No* criarNo(int valor, int prioridade) {
    No* novoNo = (No*)malloc(sizeof(No));
    if (novoNo != NULL) {
        novoNo->valor = valor;
        novoNo->prioridade = prioridade;
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

const char* prioridadechar(int prioridade) {
    switch (prioridade) {
        case 0:
            return "alta";
        case 1:
            return "media";
        case 2:
            return "baixa";
        default:
            return "invalido";
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
                printf(" -> %d %s", atual->valor, prioridadechar(atual->prioridade));
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

    No* novoNo = criarNo(no->valor, no->prioridade);

    return novoNo;
}

TabelaHash* clonarTabela(TabelaHash* tabelaOriginal) {
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

// Não entendi, mas facilita usando no qsort
int compararNos(const void* a, const void* b) {
    No* primeiro = *(No**)a;
    No* segundo = *(No**)b;

    if (primeiro->prioridade != segundo->prioridade) {
        return primeiro->prioridade - segundo->prioridade;
    }

    return primeiro->valor - segundo->valor;
}

void ordenarTabela(TabelaHash* tabela) {
    No* todosNos[TAMANHO_TABELA * TAMANHO_TABELA] = {NULL};
    int contador = 0;

    for (int i = 0; i < TAMANHO_TABELA; i++) {
        No* atual = tabela->elementos[i];
        while (atual != NULL) {
            todosNos[contador++] = atual;
            atual = atual->proximo;
        }
    }

    for (int i = 0; i < TAMANHO_TABELA; i++) {
        tabela->elementos[i] = NULL;
    }

    qsort(todosNos, contador, sizeof(No*), compararNos);

    for (int i = 0; i < contador; i++) {
        int novoIndice = funcaoHash(todosNos[i]->valor);

        if (tabela->elementos[novoIndice] == NULL) {
            tabela->elementos[novoIndice] = todosNos[i];
            todosNos[i]->proximo = NULL;
        } else {
            No* atual = tabela->elementos[novoIndice];
            while (atual->proximo != NULL) {
                atual = atual->proximo;
            }
            atual->proximo = todosNos[i];
            todosNos[i]->proximo = NULL;
        }
    }
}

void inserir(TabelaHash* tabela, int valor, int prioridade) {
    int indice = funcaoHash(valor);
    No* novoNo = criarNo(valor, prioridade);

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
    ordenarTabela(tabela);
}

int main() {
    float porcentagem;
    TabelaHash tabela;
    inicializarTabela(&tabela);

    // Calcula porcentagem de elementos nulos, retornando 100%, pois a tabela está totalmente nula
    porcentagem = calcporc(diff(&tabela));
    printf("%.2f%%\n", porcentagem);

    inserir(&tabela, 5, PRIORIDADE_ALTA);
    inserir(&tabela, 15, PRIORIDADE_MEDIA);
    inserir(&tabela, 25, PRIORIDADE_BAIXA);
    inserir(&tabela, 7, PRIORIDADE_ALTA);
    inserir(&tabela, 17, PRIORIDADE_MEDIA);

    // Calcula a porcentagem de elementos nulos, retornando 80%, pois 2 índices de 10 estão preenchidos
    porcentagem = calcporc(diff(&tabela));
    printf("%.2f%%\n", porcentagem);

    printf("\nTabela Hash Original após inserções:");
    imprimirTabela(&tabela);

    printf("\nBuscando valores:\n");
    buscar(&tabela, 15);
    buscar(&tabela, 25);
    buscar(&tabela, 10);

    TabelaHash *tabelaclone = clonarTabela(&tabela);
    printf("\nClone da Tabela Hash:");
    imprimirTabela(tabelaclone);

    liberarTabela(&tabela);
    liberarTabela(tabelaclone);
    
    return 0;
}