#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

// Tamanho do menu
#define WIDTH 60
#define HEIGHT 10

// Cores
#define SELECTED "\x1B[1;44m"
#define RESET "\x1B[0;0;0m"

// Cursor
#define LINEUP "\x1B[2A"

typedef struct {
    char nome[100];
    int idade;
    int matricula;
} Estudante;

Estudante* estudantes = NULL;
int total_estudantes = 0;

void printline(const char ch, const int length) {
    for (int i = 0; i < length; i++) {
        putchar(ch);
    }
    putchar('\n');
}

void printmenu(const int highlight, char* choices[], const int n_choices) {
    system("cls"); // Limpa a tela
    printline('-', WIDTH);

    for (int i = 0; i < n_choices; i++) {
        puts((i == highlight) ? SELECTED : RESET);
        puts(LINEUP);
        putchar('|');
        for (int j = 0; j < WIDTH - 2; j++) {
            if (j < strlen(choices[i])) {
                putchar(choices[i][j]);
            } else {
                putchar(' ');
            }
        }
        putchar('|');
        putchar('\n');
    }
    puts(LINEUP);
    puts(RESET);
    printline('-', WIDTH);
}

void adicionar_estudante() {
    Estudante e;
    printf("Nome do estudante: ");
    getchar(); // Limpa o buffer
    fgets(e.nome, 100, stdin);
    e.nome[strcspn(e.nome, "\n")] = 0;
    printf("Idade: ");
    scanf("%d", &e.idade);
    printf("Matricula: ");
    scanf("%d", &e.matricula);

    total_estudantes++;
    estudantes = realloc(estudantes, total_estudantes * sizeof(Estudante));
    if (estudantes == NULL) {
        printf("Erro ao alocar memoria!\n");
        exit(1);
    }
    estudantes[total_estudantes - 1] = e;
    printf("Estudante adicionado com sucesso!\n");
    system("pause");
}

void remover_estudante() {
    int matricula;
    printf("Digite a matricula do estudante a ser removido: ");
    scanf("%d", &matricula);

    for (int i = 0; i < total_estudantes; i++) {
        if (estudantes[i].matricula == matricula) {
            for (int j = i; j < total_estudantes - 1; j++) {
                estudantes[j] = estudantes[j + 1];
            }
            total_estudantes--;
            estudantes = realloc(estudantes, total_estudantes * sizeof(Estudante));
            if (total_estudantes > 0 && estudantes == NULL) {
                printf("Erro ao realocar memoria!\n");
                exit(1);
            }
            printf("Estudante removido com sucesso!\n");
            system("pause");
            return;
        }
    }
    printf("Estudante nao encontrado!\n");
    system("pause");
}

void listar_estudantes() {
    if (total_estudantes == 0) {
        printf("Nenhum estudante cadastrado!\n");
    } else {
        printf("Lista de estudantes:\n");
        for (int i = 0; i < total_estudantes; i++) {
            printf("Nome: %s, Idade: %d, Matricula: %d\n",
                   estudantes[i].nome, estudantes[i].idade, estudantes[i].matricula);
        }
    }
    system("pause");
}

int main() {
    char* choices[] = {
        "Adicionar Estudante",
        "Remover Estudante",
        "Listar Estudantes",
        "Sair"
    };

    int n_choices = sizeof(choices) / sizeof(char*);
    int highlight = 0;
    int running = true;

    while (running) {
        printmenu(highlight, choices, n_choices);

        const int c = getch();
        switch (c) {
            case 72: // Tecla cima
                highlight = (highlight - 1 + n_choices) % n_choices;
                break;
            case 80: // Tecla baixo
                highlight = (highlight + 1) % n_choices;
                break;
            case 13: // Tecla Enter
                if (highlight == 0) {
                    adicionar_estudante();
                } else if (highlight == 1) {
                    remover_estudante();
                } else if (highlight == 2) {
                    listar_estudantes();
                } else if (highlight == 3) {
                    running = false;
                }
                break;
            case 27: // Tecla Esc / sair do programa
                running = false;
                break;
            default:
                break;
        }
    }

    free(estudantes);

    return 0;
}
