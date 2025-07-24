#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

#define WIDTH 60
#define HEIGHT 15
#define SELECTED "\x1B[1;44m"
#define RESET "\x1B[0;0;0m"
#define LINEUP "\x1B[2A"

typedef struct Node {
    int value;
    struct Node *next;
    struct Node *prev;
} Node;

Node* head = NULL;

Node* createNode(int value) {
    Node* newNode = malloc(sizeof(Node));
    if (newNode == NULL) {
        printf("Erro ao alocar memoria\n");
        return NULL;
    }
    newNode->value = value;
    newNode->next = NULL;
    newNode->prev = NULL;
    return newNode;
}

void insertNodeBeginning(int value) {
    Node *newNode = createNode(value);
    newNode->next = head;
    if (head != NULL) {
        head->prev = newNode;
    }
    head = newNode;
    printf("No inserido no início com sucesso.\n");
}

void insertNodeEnd(int value) {
    Node *newNode = createNode(value);
    if (head == NULL) {
        head = newNode;
    } else {
        Node *temp = head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = newNode;
        newNode->prev = temp;
    }
    printf("No inserido no final com sucesso.\n");
}

void insertAfterValue(int afterValue, int newValue) {
    if (head == NULL) {
        printf("A lista esta vazia.\n");
        return;
    }
    Node *temp = head;
    while (temp != NULL && temp->value != afterValue) {
        temp = temp->next;
    }
    if (temp == NULL) {
        printf("Valor %d nao encontrado na lista.\n", afterValue);
    } else {
        Node *newNode = createNode(newValue);
        newNode->next = temp->next;
        newNode->prev = temp;
        if (temp->next != NULL) {
            temp->next->prev = newNode;
        }
        temp->next = newNode;
        printf("No inserido apos o valor %d com sucesso.\n", afterValue);
    }
}

void removeNode(int value) {
    if (head == NULL) {
        printf("A lista esta vazia.\n");
        return;
    }
    Node *temp = head;
    while (temp != NULL && temp->value != value) {
        temp = temp->next;
    }
    if (temp == NULL) {
        printf("Valor %d nao encontrado na lista.\n", value);
    } else {
        if (temp->prev != NULL) {
            temp->prev->next = temp->next;
        } else {
            head = temp->next;
        }
        if (temp->next != NULL) {
            temp->next->prev = temp->prev;
        }
        free(temp);
        printf("No com valor %d removido com sucesso.\n", value);
    }
}

void removeNodeBeginning() {
    if(head == NULL) {
        printf("A lista esta vazia.\n");
        return;
    }
    Node *temp = head;
    head = head->next;
    if(head != NULL) {
       head->prev = NULL;
    }
    free(temp);
    printf("Primeiro no removido com sucesso.\n");
}

void removeNodeEnd() {
    if (head == NULL) {
        printf("A lista esta vazia.\n");
        return;
    }
    if (head->next == NULL) {
        free(head);
        head = NULL;
    } else {
        Node *temp = head;
        while(temp->next != NULL) {
            temp = temp->next;
        }
        temp->prev->next = NULL;
        free(temp);
    }
    printf("Ultimo no removido com sucesso.\n");
}

void search(int value) {
    if (head == NULL) {
        printf("A lista esta vazia.\n");
        return;
    }
    Node *temp = head;
    int position = 1;
    while(temp != NULL) {
        if(temp->value == value) {
            printf("Valor %d encontrado na posicao %d.\n", value, position);
            return;
        }
        temp = temp->next;
        position++;
    }
    printf("Valor %d nao encontrado na lista.\n", value);
}

void reverseList() {
    if (head == NULL || head->next == NULL) {
        printf("A lista esta vazia ou contam apenas um elemento.\n");
        return;
    }
    Node *temp = NULL;
    Node *current = head;

    while (current != NULL) {
        temp = current->prev;
        current->prev = current->next;
        current->next = temp;
        current = current->prev;
    }

    if (temp != NULL) {
        head = temp->prev;
    }
    printf("A lista foi invertida com sucesso.\n");
}

int countNodes() {
    int count = 0;
    Node *temp = head;
    while (temp != NULL) {
        count++;
        temp = temp->next;
    }
    return count;
}

void printList() {
    if (head == NULL) {
        printf("A lista esta vazia.\n");
        return;
    }
    Node *temp = head;
    printf("Lista: ");
    while (temp != NULL) {
        printf("%d ", temp->value);
        temp = temp->next;
    }
    printf("\n");
}

void printListReverse() {
    if (head == NULL) {
        printf("A lista esta vazia.\n");
        return;
    }
    Node *temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    printf("Lista reversa: ");
    while (temp != NULL) {
        printf("%d ", temp->value);
        temp = temp->prev;
    }
    printf("\n");
}

void freeList() {
    while (head != NULL) {
        Node *temp = head;
        head = head->next;
        free(temp);
    }
    printf("A memoria foi liberada com sucesso.\n");
}

void printline(const char ch, const int length) {
    for (int i = 0; i < length; i++) {
        putchar(ch);
    }
    putchar('\n');
}

void printmenu(const int highlight, char* choices[], const int n_choices) {
    system("cls");
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

int main() {
    char* choices[] = {
        "1. Inserir no inicio",
        "2. Inserir no final",
        "3. Inserir apos um valor",
        "4. Remover um no especifico",
        "5. Remover o primeiro no",
        "6. Remover o ultimo no",
        "7. Buscar um valor",
        "8. Inverter a lista",
        "9. Contar numero de nos",
        "10. Exibir lista",
        "11. Exibir lista inversa",
        "12. Liberar a memoria e sair"
    };

    int n_choices = sizeof(choices) / sizeof(char*);
    int highlight = 0;
    int running = 1;
    int value, afterValue;

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
                system("cls");
                switch(highlight) {
                    case 0:
                        printf("Digite o valor a ser inserido no início: ");
                        scanf("%d", &value);
                        insertNodeBeginning(value);
                        break;
                    case 1:
                        printf("Digite o valor a ser inserido no final: ");
                        scanf("%d", &value);
                        insertNodeEnd(value);
                        break;
                    case 2:
                        printf("Digite o valor após o qual inserir: ");
                        scanf("%d", &afterValue);
                        printf("Digite o novo valor a ser inserido: ");
                        scanf("%d", &value);
                        insertAfterValue(afterValue, value);
                        break;
                    case 3:
                        printf("Digite o valor do nó a ser removido: ");
                        scanf("%d", &value);
                        removeNode(value);
                        break;
                    case 4:
                        removeNodeBeginning();
                        break;
                    case 5:
                        removeNodeEnd();
                        break;
                    case 6:
                        printf("Digite o valor a ser buscado: ");
                        scanf("%d", &value);
                        search(value);
                        break;
                    case 7:
                        reverseList();
                        break;
                    case 8:
                        printf("Número de nós na lista: %d\n", countNodes());
                        break;
                    case 9:
                        printList();
                        break;
                    case 10:
                        printListReverse();
                        break;
                    case 11:
                        freeList();
                        running = 0;
                        break;
                    default:;
                }
                if (running) {
                    printf("\nPressione qualquer tecla para continuar...");
                    getch();
                }
                break;
            case 27: // Tecla Esc
                running = 0;
                break;
            default:;
        }
    }

    return 0;
}