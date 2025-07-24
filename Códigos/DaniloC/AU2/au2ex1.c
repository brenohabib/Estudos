#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int randomRange(int min, int max) {
    return (rand() % (max - min + 1)) + min;
}

void randomv(int size, int vetor[]) {
    for (int i = 0; i < size; ++i) {
        vetor[i] = randomRange(-100, 100);
    }
}

void randomm(int size, int matriz[size][size]) {
    for (int i = 0; i < size; ++i) {
        for(int j = 0; j < size; j++) {
            matriz[i][j] = randomRange(-100, 100);
        }
    }
}

void printArray(int vetor[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", vetor[i]);
    }
    printf("\n\n");
}

void printMatriz(int size, int matriz[size][size]) {
    for (int i = 0; i < size; ++i) {
        for(int j = 0; j < size; j++) {
            printf("%d ", matriz[i][j]);
        }
        printf("\n");
    }
    printf("\n\n");
}

int findmax(int size, int matriz[size][size]) {
    int value = INT_MIN;

    for (int i = 0; i < size; ++i) {
        for(int j = 0; j < size; j++) {
            if (matriz[i][j] > value) {
                value = matriz[i][j];
            }
        }
    }
    return value;
}

void ex1() {  // Altere para void já que não retorna nada
    int vetor[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    const int size = sizeof(vetor) / sizeof(vetor[0]);

    printf("Array antes de preencher:\n");
    printArray(vetor, size);

    randomv(size, vetor);

    printf("Array depois de preencher:\n");
    printArray(vetor, size);
}

void ex2() {
    int size = 4;

    int matriz[size][size];

    randomm(size, matriz);
    printf("Matriz preenchida com valores aleatorios:\n");
    printMatriz(size, matriz);
}

void ex3() {
    int size = 5;

    int matriz[size][size];

    randomm(size, matriz);
    printMatriz(size, matriz);
    printf("Max value: %d", findmax(size, matriz));

}

int main() {
    srand(time(NULL));
    ex1();
    //ex2();
    //ex3();


    return 0;
}
