#include <stdio.h>

int sum(int a, int b) {
    return a + b;
}

int main() {
    int add = sum(2, 4);
    printf("A soma e: %d", add);
    return 0;
}
