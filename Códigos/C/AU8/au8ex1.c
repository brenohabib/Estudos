#include <stdio.h>
#include <stdlib.h>
//#include <string.h>

typedef struct {
    char nome[50];
    int idade;
    int urgencia;

}Paciente;

typedef struct {
    Paciente *paciente;
    int num_paciente;
    int capacidade_fila;
}Fila;

void inicializarFila(void *fila) {
    fila = malloc(sizeof(Fila));
}

void adicionaPaciente(Paciente paciente, Fila fila) {
    printf("Nome: ");
    scanf("%c", paciente.nome);
    getchar();
    printf("Idade: ");
    scanf("%d", paciente.idade);
    getchar();
    printf("Urgencia (1 a 5)");
    scanf("%d", paciente.urgencia);

    fila.paciente = &paciente;
    printf("Paciente adicionado!");
}

int main() {

    adicionaPaciente();
}