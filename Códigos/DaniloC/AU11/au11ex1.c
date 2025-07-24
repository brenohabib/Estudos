#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int value;
    struct Node *next;
    struct Node *prev;
} Node;

Node* createNode(int value) {
    Node* newNode = (Node*) malloc(sizeof(Node));
    if (newNode == NULL) {
        printf("Erro ao alocar memória\n");
        return NULL;
    }

    newNode->value = value;
    newNode->next = NULL;
    newNode->prev = NULL;
    return newNode;
}

void insertNodeBeginning(Node **head, int value) {
    Node *newNode = createNode(value);
    newNode->next = *head;

    if (*head != NULL) {
        (*head)->prev = newNode;
    }
    *head = newNode;
}

void insertNodeEnd(Node **head, int value) {
    Node *newNode = createNode(value);
    if (*head == NULL) {
        *head = newNode;
        return;
    }

    Node *temp = *head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newNode;
    newNode->prev = temp;
}

void removeNode(Node **head, int value) {
    Node *temp = *head;

    while (temp != NULL) {
        if (temp->value == value) {
            if (temp->prev != NULL) {
                temp->prev->next = temp->next;
            } else {
                *head = temp->next;
            }
            if (temp->next != NULL) {
                temp->next->prev = temp->prev;
            }
            free(temp);
            return;
        }
        temp = temp->next;
    }
    printf("Valor %d não encontrado na lista\n", value);
}

void removeNodeBeggining(Node **head) {
    if(*head == NULL) {
        printf("A lista está vazia");
        return;
    }

    Node *temp = *head;
    *head = (*head)->next;

    if(*head != NULL) {
       (*head)->prev = NULL;
    }
    free(temp);
    printf("Primeiro nó removido");
}

void removeNodeEnd(Node **head) {
    if (*head == NULL) {
        printf("A lista está vazia");
        return;
    }
    Node *temp = *head;
    if (temp->next==NULL) {
        free(temp);
        *head = NULL;
    } else {
        while(temp->next->next!=NULL) {
            temp = temp->next;
        }
        free(temp->next);
        temp->next = NULL;
    }
}

int search(Node *head, int value) {
    Node *temp = head;

    while(temp!=NULL) {
        if(temp->value == value) {
            return 1;
        }
        temp = temp->next;
    }
    return 0;
}

void printList(Node *head) {
    Node *temp = head;
    while (temp != NULL) {
        printf("%d ", temp->value);
        temp = temp->next;
    }
    printf("\n");
}

void printListReverse(Node *head) {
    Node *temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    while (temp != NULL) {
        printf("%d ", temp->value);
        temp = temp->prev;
    }
    printf("\n");
}

void freeList(Node *head) {
    Node *temp;
    while (head != NULL) {
        temp = head;
        head = head->next;
        free(temp);
    }
}

int main() {
    Node *head = NULL;

    insertNodeBeginning(&head, 10);
    insertNodeBeginning(&head, 20);
    insertNodeEnd(&head, 30);
    insertNodeEnd(&head, 40);

    printf("Lista: ");
    printList(head);
    printf("Lista Reversa: ");
    printListReverse(head);
    removeNodeEnd(&head);
    printList(head);
    freeList(head);
    return 0;
}
