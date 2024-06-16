#include <stdio.h>

int sum(int a, int b) {
    return a + b;
}
int sub(int a, int b) {
    return a - b;
}
int mult(int a, int b) {
    return a * b;
}
double div(double a, double b) {
    return a / b;
}

int main() {
    int a, b, option;
    double answer;

    printf("Digite 2 números para o cálculo: ");
    scanf("%d %d", &a, &b);

    printf("Selecione uma opção:\n");
    printf("[1] soma\n");
    printf("[2] subtração\n");
    printf("[3] multiplicação\n");
    printf("[4] divisão\n");
    scanf("%d", &option);

    switch(option) {
        case 1:
            answer = sum(a, b);
            printf("Resultado: %.2lf\n", answer);
            break;
        case 2:
            answer = sub(a, b);
            printf("Resultado: %.2lf\n", answer);
            break;
        case 3:
            answer = mult(a, b);
            printf("Resultado: %.2lf\n", answer);
            break;
        case 4:
            if (b != 0) {
                answer = div(a, b);
                printf("Resultado: %.2lf\n", answer);
            } else {
                printf("Erro: Divisão por zero não é permitida.\n");
            }
            break;
        default:
            printf("Opção inválida.\n");
    }

    return 0;
}
