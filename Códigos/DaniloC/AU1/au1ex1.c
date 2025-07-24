#include <stdio.h>
#include <math.h>

double soma_dos_quadrados() {
    int soma = 0;
    for(int i = 1; i <= 10; i++) {
        soma += pow(i, 2);
    }
    return soma;
}

double quadrado_da_soma() {
    int soma = 0;
    for(int i = 1; i <= 10; i++) {
        soma += i;
    }
    return pow(soma, 2);
}

double subtracao(double x, double y) {
    return x - y;
}

int main() {

    int valor1, valor2, resultado;

    valor1 = soma_dos_quadrados();
    valor2 = quadrado_da_soma();
    resultado = subtracao(valor1, valor2);

    printf("O valor final seria: %d", resultado);

    return 0;
}

