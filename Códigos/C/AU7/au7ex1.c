#include <stdio.h>
#include <stdlib.h>

int main() {
    int *p;
    int n;

    printf("Digite a quantidade posições para o array:");
    scanf("%d", &n);

    p = (int*) malloc(n * sizeof(int));

    if(p == NULL) {
        printf("Houve um erro ao alocar");
        return 1;
    }

    for(int i = 0; i < n; i++) {
        p[i] = i;
    }
    for(int i = 0; i < n; i++) {
        printf("%d\n", i + *p);
    }

    free(p);
    return 0;
}