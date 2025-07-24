#include <stdio.h>

#define MAX 10000

void imprimeVetor(const char *vetor) {
    for(int i = 0; i < MAX; i++) {
        printf("\n[%d]:%c", (i+1), *(vetor+i));
    }
}

void preencheVetor(char *vetor, char elemento) {
    int i = 0;
    while (i<MAX) {
        *vetor = elemento;
        vetor++;
        i++;
        elemento++;
    }
}

int main() {
    char vetor[MAX];
    char elemento='█';
    preencheVetor(vetor, elemento);
    imprimeVetor(vetor);
}