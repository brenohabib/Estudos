#include <stdio.h>

typedef struct Conta {
    int numeroConta;
    char nomeTitular[100];
    float saldo;
    char tipo[50];
} Conta;

void depositar(Conta *c, const float valor) {
    if (valor > 0) {
        c->saldo += valor;
        printf("Deposito de %.2f realizado com sucesso!\n", valor);
    } else {
        printf("Valor de deposito invalido.\n");
    }
}

void sacar(Conta *c, const float valor) {
    if (valor > 0 && valor <= c->saldo) {
        c->saldo -= valor;
        printf("Saque de %.2f realizado com sucesso!\n", valor);
    } else {
        printf("Valor de saque invalido ou saldo insuficiente.\n");
    }
}

void mostrarSaldo(const Conta *c) {
    printf("Saldo atual: %.2f\n", c->saldo);
}

int main() {
    Conta paulo;

    paulo.numeroConta = 123456;
    snprintf(paulo.nomeTitular, sizeof(paulo.nomeTitular), "Paulo Silva");
    paulo.saldo = 500.0;
    snprintf(paulo.tipo, sizeof(paulo.tipo), "Conta Corrente");

    int opcao;
    float valor;

    do {
        printf("\nMenu de Operacoes:\n");
        printf("1. Deposito\n");
        printf("2. Saque\n");
        printf("3. Mostrar Saldo\n");
        printf("4. Sair\n");
        printf("Escolha uma opcao: ");
        scanf("%d", &opcao);
        getchar();

        switch (opcao) {
            case 1:
                printf("Digite o valor do deposito: ");
                scanf("%f", &valor);
                getchar();
                depositar(&paulo, valor);
                break;
            case 2:
                printf("Digite o valor do saque: ");
                scanf("%f", &valor);
                getchar();
                sacar(&paulo, valor);
                break;
            case 3:
                mostrarSaldo(&paulo);
                break;
            case 4:
                printf("Saindo do programa.\n");
                break;
            default:
                printf("Opção invalida. Tente novamente.\n");
                break;
        }
    } while (opcao != 4);

    return 0;
}
