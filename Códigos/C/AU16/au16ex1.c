#include <stdlib.h>
#include <stdio.h>

#define TAMANHO_TABELA 20
#define VAIA -1

typedef struct HashTable {
    int chaves [TAMANHO_TABELA];
    int values [TAMANHO_TABELA];
}HashTable;

int geraHash (int chave) {
    return chave % TAMANHO_TABELA;
}

void initTabela (HashTable * tabela) {
    for (int i = 0; i < TAMANHO_TABELA; i++) {
        tabela->chaves[i] = VAIA;
        tabela->values[i] = 0;
    }
}

void inserir (HashTable *tabela, int chave, int valor) {
    int hashIndice = geraHash(chave);

    while (tabela->chaves[hashIndice] != VAIA) {
        if (tabela->chaves[hashIndice] == chave) {
            printf("\nChave %d já existe, atualiando valor", chave);
            tabela->values[hashIndice] = valor;
            return;
        }
        hashIndice = (hashIndice + 1) % TAMANHO_TABELA;
    }
    tabela->chaves[hashIndice] = chave;
    tabela->values[hashIndice] = valor;
    printf("\nInserido (%d,%d) na posicao %d",chave, valor, hashIndice);
}

void imprimirTabelaHash(HashTable *tabela) {
    for(int i = 0; i < TAMANHO_TABELA; i++) {
        if(tabela->chaves[i]==VAIA) {
            printf("\nPosicao Vaia");
        }
        else {
            printf("\nPosicao %d:(%d,%d)",i,tabela->chaves[i], tabela->values[i]);
        }
    }
}
int main() {
    HashTable hashTable;
    initTabela(&hashTable);
    inserir(&hashTable, 345, 20);
    imprimirTabelaHash(&hashTable);

}