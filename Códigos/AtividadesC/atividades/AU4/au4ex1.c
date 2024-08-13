#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

#define WIDTH 60
#define HEIGHT 10

#define SELECTED "\x1B[1;44m"
#define RESET "\x1B[0;0;0m"
#define LINEUP "\x1B[2A"

void printline(const char ch, const int length) {
    for (int i = 0; i < length; i++) {
        putchar(ch);
    }
    putchar('\n');
}

void printmainmenu(const int highlight, char* choices[], const int n_choices) {
    system("cls"); // Limpa a tela
    printline('-', WIDTH); // Imprime linha

    // Imprime o menu
    for (int i = 0; i < n_choices; i++) {
        puts((i == highlight) ? SELECTED : RESET);
        puts(LINEUP);
        putchar('|'); // Bordas laterais
        for (int j = 0; j < WIDTH - 2; j++) {
            if (i == highlight) {
                if (j < strlen(choices[i])) {
                    putchar(choices[i][j]); // String opção
                } else {
                    putchar(' '); // Opção destacada
                }
            } else {
                if (j < strlen(choices[i])) {
                    putchar(choices[i][j]); // String opção
                } else {
                    putchar(' '); // Opção normal
                }
            }
        }
        putchar('|');
        putchar('\n');
    }
    puts(LINEUP);
    puts(RESET);
    // Imprime linha
    printline('-', WIDTH);
}

int main() {
    char* choices[] = {
        "Adicionar produto",
        "Adicionar ao carrinho",
        "Exibir produto",
        "Exibir carrinho",
        "Sair"
    };
    const int n_choices = sizeof(choices) / sizeof(char*);
    int highlight = 0;
    int choice = 0;

    while (1) {
        printmainmenu(highlight, choices, n_choices);

        const int c = _getch(); // Espera por caracter
        switch (c) {
            case 72: // Tecla cima
                highlight = (highlight - 1 + n_choices) % n_choices;
                break;
            case 80: // Tecla baixo
                highlight = (highlight + 1) % n_choices;
                break;
            case 75: // Tecla esquerda / confirmar opção
                choice = highlight;
                if (choice == n_choices - 1) {
                    return 0; // sair
                }
                break;
            default:
                break;
        }
    }
}
