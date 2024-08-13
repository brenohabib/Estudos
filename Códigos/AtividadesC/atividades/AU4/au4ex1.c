#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

#define WIDTH 60
#define HEIGHT 10

#define SELECTED "\033[1;42m"
#define RESET "\033[0;0;0m"

void printLine(const char ch, const int length) {
    for (int i = 0; i < length; i++) {
        putchar(ch);
    }
    putchar('\n');
}

void printMenu(const int highlight, char* choices[], const int n_choices) {
    system("cls"); // Limpa a tela

    // Imprime linha
    printLine('-', WIDTH);

    // Imprime o menu
    for (int i = 0; i < n_choices; i++) {
        putchar('|'); // Bordas laterais
        puts((i == highlight) ? SELECTED : RESET);
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
        putchar(' ');
        putchar('\n');
    }

    // Imprime linha
    printLine('-', WIDTH);
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
        printMenu(highlight, choices, n_choices);

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
