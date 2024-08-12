#include <stdio.h>

typedef struct Produto {
    char nome[100];
    int quantidade;
    float preco;
} Produto;

int main() {
    Produto p[3];
    for (int i = 0; i < 3; ++i) {
        printf("Digite um nome:");
        scanf("%99[^\n]", p[i].nome);
        getchar(); // Limpa o caractere de nova linha deixado no buffer

        printf("Digite uma quantidade:");
        scanf("%d", &p[i].quantidade);
        getchar();

        printf("Digite um preco:");
        scanf("%f", &p[i].preco);
        getchar();
    }

    for (int i = 0; i < sizeof(p) / sizeof(p[0]); ++i) {
        printf("\nProduto %d:\n", i + 1);
        printf("Nome: %s\n", p[i].nome);
        printf("Quantidade: %d\n", p[i].quantidade);
        printf("Preco: %.2f\n", p[i].preco);
    }
    
    return 0;
}
