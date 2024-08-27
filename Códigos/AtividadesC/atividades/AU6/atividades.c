#include <stdio.h>

void at1() {
    int var1, var2;
    printf("Endereço da var1: %p\n", (void*)&var1);
    printf("Endereço da var2: %p\n", (void*)&var2);
    if (&var1 > &var2) {
        printf("Maior endereço: var1 (%p)\n", (void*)&var1);
    } else {
        printf("Maior endereço: var2 (%p)\n", (void*)&var2);
    }
}

void at2() {
    int arr[5];
    int *p = arr;
    printf("Digite 5 números inteiros:\n");
    for (int i = 0; i < 5; i++) {
        scanf("%d", p + i);
    }
    printf("O dobro dos valores lidos:\n");
    for (int i = 0; i < 5; i++) {
        printf("%d ", 2 * (*(p + i)));
    }
    printf("\n");
}

void at3() {
    int a, *b, **c, ***d;
    printf("Digite um valor inteiro:");
    scanf("%d", &a);
    b = &a;
    c = &b;
    d = &c;
    printf("Dobro: %d\n",2 * (*b));
    printf("Triplo: %d\n", 3 * (**c));
    printf("Quádruplo: %d\n", 4 * (***d));
}

void at4() {
    int var1, var2;
    printf("Digite dois valores inteiros:\n");
    scanf("%d %d", &var1, &var2);
    if (&var1 > &var2) {
        printf("Conteúdo do maior endereço: %d\n", var1);
    } else {
        printf("Conteúdo do maior endereço: %d\n", var2);
    }
}

void at5() {
    int arr[5];
    printf("Digite 5 números inteiros:\n");
    for (int i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }
    printf("Endereços das posições contendo valores pares:\n");
    for (int i = 0; i < 5; i++) {
        if (arr[i] % 2 == 0) {
            printf("%p\n", (void*)&arr[i]);
        }
    }
}

void at6() {
    int arr[5];
    int *p = arr;
    printf("Digite 5 números inteiros:\n");
    for (int i = 0; i < 5; i++) {
        scanf("%d", p + i);
    }
    for (int i = 0; i < 5; i++) {
        *(p + i) += 1;
    }
    printf("Valores após somar 1:\n");
    for (int i = 0; i < 5; i++) {
        printf("%d ", *(p + i));
    }
    printf("\n");
}

void at7(const int *arr, const int size) {
    printf("Valores do array:\n");
    for (int i = 0; i < size; i++) {
        printf("%d ", *(arr + i));
    }
    printf("\n");
}

void at8(int *a, int *b) {
    if (*a < *b) {
        const int temp = *a;
        *a = *b;
        *b = temp;
    }
}

void at9(int *arr, const int size, const int valor) {
    for (int i = 0; i < size; i++) {
        *(arr + i) = valor;
    }
}

void at10() {
    int matriz[3][3];
    int *p = (int*)matriz;
    int soma = 0;
    printf("Digite os valores da matriz 3x3:\n");
    for (int i = 0; i < 9; i++) {
        scanf("%d", p + i);
        soma += *(p + i);
    }
    printf("Soma dos elementos: %d\n", soma);
}

void at11() {
    char str1[100], str2[100];
    const char *p1 = str1;
    char *p2 = str2;
    printf("Digite uma string: ");
    fgets(str1, sizeof(str1), stdin);
    while (*p1 != '\0') {
        *p2 = *p1;
        p1++;
        p2++;
    }
    *p2 = '\0';
    printf("String original: %s", str1);
    printf("String copiada: %s", str2);
}

void at12() {
    int x = 10;
    int *p = &x;
    *p = 20;
    printf("%d\n", x);
}

int main() {

    // at1();
    // at2();
    // at3();
    // at4();
    // at5();
    // at6();
    // at7(arr, size); // passe o array e o tamanho
    // at8(&a, &b); // passe os dois valores
    // at9(arr, size, valor); // passe o array, tamanho e valor
    // at10();
    // at11();
    // at12();
    
    return 0;
}
