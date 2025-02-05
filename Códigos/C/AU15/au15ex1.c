#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int value;
    struct Node *next;
}Node;

Node *crtnode(int value) {
    Node *newNode = malloc(sizeof(Node));
    newNode->next = NULL;
    newNode->value = value;
    return newNode;
}

int isempty(Node *top) {
    return top==NULL;
}

void stack(Node **top, int value) {
    Node *newNode = crtnode(value);
    newNode->next = *top;
    *top = newNode;
}

void pop(Node **top) {
    if(isempty(*top)) {
        printf("Pilha vazia");
    }
    Node *rmv = *top;
    int nodevalue = rmv->value;
    *top = (*top)->next;
    free(rmv);
    printf("Valor %d removido", nodevalue);
}

void printpile(Node *top) {
    if(isempty(top)) {
        printf("Pilha vazia");
        return;
    }
    while(top != NULL) {
        printf("%d->", top->value);
        top = top->next;
    }
    printf("\n");
}

int main() {
    Node *top = NULL;
    stack(&top, 10);
    stack(&top, 20);
    stack(&top, 30);
    printpile(top);
    return 0;
}