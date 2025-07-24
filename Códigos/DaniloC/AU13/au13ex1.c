#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_NAME 51

typedef struct Node {
    char name[MAX_NAME];
    struct Node* next;
} Node;

Node* last = NULL;

void addPerson(char* name) {
    Node* newNode = malloc(sizeof(Node));
    strncpy(newNode->name, name, MAX_NAME - 1);
    newNode->name[MAX_NAME - 1] = '\0';

    if (last == NULL) {
        newNode->next = newNode;
        last = newNode;
    } else {
        newNode->next = last->next;
        last->next = newNode;
        last = newNode;
    }
}

void removePerson() {
    if (last == NULL) {
        return;
    }

    Node* first = last->next;

    if (first == last) {
        free(first);
        last = NULL;
    } else {
        last->next = first->next;
        free(first);
    }
}

void displayList() {
    if (last == NULL) {
        printf("A lista está vazia.\n");
        return;
    }

    Node* current = last->next;
    int position = 1;

    printf("Lista de Espera:\n");
    do {
        printf("%d. %s\n", position++, current->name);
        current = current->next;
    } while (current != last->next);
}

int main() {
    printf("Adicionando pessoas à lista...\n");
    addPerson("Alice");
    addPerson("Bob");
    addPerson("Charlie");

    printf("\nExibindo lista de espera:\n");
    displayList();

    printf("\nAtendendo a próxima pessoa...\n");
    removePerson();

    printf("\nExibindo lista de espera:\n");
    displayList();

    printf("\nAtendendo a próxima pessoa...\n");
    removePerson();

    printf("\nExibindo lista de espera:\n");
    displayList();

    printf("\nAtendendo a próxima pessoa...\n");
    removePerson();

    printf("\nExibindo lista de espera:\n");
    displayList();

    return 0;
}