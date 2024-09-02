#include <stdio.h>
#include <stdlib.h>
//#include <string.h>

int main() {
    /*char palavra[20] = "Hello World";
    char *ptr;
    ptr = palavra;
    printf("Pimeiro caractere: %c", *ptr);

    for (int i = 0; i < 5; ++i) {
        ptr++;
        printf("%c", *ptr);
    }

    char **palavras;
    int num_palavras = 3;
    palavras = (char**) malloc(num_palavras *sizeof(char*));
    palavras[0] = strdup("Hello");
    palavras[1] = strdup("World");
    palavras[2] = strdup("!!!");

    for (int i = 0; i < num_palavras; i++) {
        printf("%s ", palavras[i]);
    }
    free(palavras);*/

    int x;
    printf("Digite a quantidade de posições para o array:");
    scanf("%d", &x);

    int *ptr = (int *) malloc(x * sizeof(int));
    for(int i = 0; i < x; i++) {
        ptr[i] = i;
        printf("%d", *ptr+i);
    }
    free(ptr);
}