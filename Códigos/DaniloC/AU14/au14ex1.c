#include <stdio.h>
#include <stdlib.h>

#define MAX 5

typedef struct Queue {
    int items [MAX];
    int inicio,final;
}Queue;

Queue* createQueue() {
    Queue *f = (Queue*) malloc(sizeof(Queue));
    f->inicio = -1;
    f->final = -1;
    return f;
}

int voidQueue(Queue *q) {
    return q->inicio==-1;
}

int fullQueue(Queue *q) {
    return (q->final + 1) % MAX == q->inicio;
}

void enfileirar (Queue *q, int value) {
    if(fullQueue(q)) {
        printf("Fila cheia");
        return;
    }

    if(voidQueue(q)) {
        q->inicio = 0;
    }

    q->final = (q->final + 1) % MAX;
    q->items[q->final] = value;
}