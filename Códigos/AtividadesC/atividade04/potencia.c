#include <stdio.h>

int potencia(int base, int expoente)
{
    if (expoente == 1)
    {
        return base;
    }
    else if (expoente == 0)
    {
        return 1;
    }
    return base * potencia(base, expoente - 1);
}

int main()
{
    int num_a, num_b, result;

    printf("Digite o numero da base: ");
    scanf("%i", &num_a);

    printf("Digite o numero do expoente: ");
    scanf("%i", &num_b);

    result = potencia(num_a, num_b);

    printf("%i", result);

    return 0;
}