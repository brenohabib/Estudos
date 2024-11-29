#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
    int data;
    struct Node *next;
    struct Node *proximo;
}Node;

Node *createNode(const int data) {
    Node *createNode(int d);
    const auto newNode = (Node *) malloc(sizeof(Node));

    newNode->data = data;
    newNode->proximo = NULL;
    return newNode;
}

void insertNode(struct Node **head, const int data) {
    struct Node* newNode = createNode(data);
    if(*head == NULL) {
        *head = newNode;
        return;
    }

    struct Node *temp = *head;

    while(temp-> proximo != NULL) {
        temp = temp->proximo;
    }

    temp-> proximo = newNode;
}

void printNode(struct Node *head) {
    Node *temp = head;

    while(temp!= NULL) {
        printf("%d->", temp->data);
        temp = temp->proximo;
    }

    printf("NULL\n");
}

int main() {
    Node* head = NULL;

    insertNode(&head, 40);
    insertNode(&head, 10);
    insertNode(&head, 20);
    insertNode(&head, 30);
    insertNode(&head, 60);
    insertNode(&head, 40);

    printNode(head);
}
