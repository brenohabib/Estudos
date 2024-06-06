#include <stdio.h>

int sum_even(int num) {
    if (num <= 0)
    {
        return 0;
    }
    return num + sum_even(num-2);
}

int main() {
    int num_a, sum;

    printf("Digite o número limite da soma: ");
    scanf("%i", &num_a);
    if (num_a % 2 != 0)
    {
        num_a -= 1;
    }
    sum = sum_even(num_a);
    printf("%i", sum);
    return 0;
}
