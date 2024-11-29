#include <stdio.h>

typedef struct Aluno {
    char nome[100];
    int idade;
    int matricula;
    float notas[3];
} Aluno;

int main() {
    Aluno p[3];
    for (int i = 0; i < 3; ++i) {
        printf("Digite o nome:");
        scanf("%99[^\n]", p[i].nome);
        getchar(); // Limpa o caractere de nova linha deixado no buffer

        printf("Digite a idade:");
        scanf("%d", &p[i].idade);
        getchar();

        printf("Digite a matricula:");
        scanf("%d", &p[i].matricula);
        getchar();

        for(int j = 0; j < sizeof(p[i].notas) / sizeof(p[i].notas[0]); ++j) {
            printf("Digite a %d nota:", j + 1);
            scanf("%f", &p[i].notas[j]);
            getchar();
        }
    }

    for (int i = 0; i < sizeof(p) / sizeof(p[0]); ++i) {
        const float media = (p[i].notas[0] + p[i].notas[1] + p[i].notas[2]) / (sizeof(p[i].notas) / sizeof(p[i].notas[0]));
        printf("\nAluno %d:\n", i + 1);
        printf("Nome: %s\n", p[i].nome);
        printf("Idade: %d\n", p[i].idade);
        printf("Matricula: %d\n", p[i].matricula);
        printf("Media das notas: %.2f\n", media);
    }

    return 0;
}
