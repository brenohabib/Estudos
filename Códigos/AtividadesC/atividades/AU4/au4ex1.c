#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <conio.h>
#include <string.h>

// Tamanho menu
#define WIDTH 60
#define HEIGHT 10

// Cores
#define SELECTED "\x1B[1;44m"
#define RESET "\x1B[0;0;0m"

// Cursor
#define LINEUP "\x1B[2A"

// Estrutura do Produtos
typedef struct{
    int codigoproduto;
    char descricao[200];
    float valor;
    int quantidade;
    int ativo; // 1 para ativo, 0 para inativo
} Produto;

// Estrutura do Carrinho
typedef struct{
    int numeroitem;
    int quantidade;
    Produto* produto;
    float valorunitario;
    float valortotal;
} Carrinho;

#define MAX_PRODUTOS 100
#define MAX_CARRINHO 50

Produto produtos[MAX_PRODUTOS];
int total_produtos = 0;
Carrinho carrinho[MAX_CARRINHO];
int total_itens_carrinho = 0;

void printline(const char ch, const int length) {
    for (int i = 0; i < length; i++) {
        putchar(ch);
    }
    putchar('\n');
}

void printmenu(const int highlight, char* choices[], const int n_choices) {
    system("cls"); // Limpa a tela
    printline('-', WIDTH); // Imprime linha

    // Imprime o menu
    for (int i = 0; i < n_choices; i++) {
        puts((i == highlight) ? SELECTED : RESET);
        puts(LINEUP);
        putchar('|'); // Bordas laterais
        for (int j = 0; j < WIDTH - 2; j++) {
            if (j < strlen(choices[i])) {
                putchar(choices[i][j]); // String opção
            } else {
                putchar(' '); // Espaço vazio
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

// Função para inserir produto
void inserir_produto() {
    if (total_produtos >= MAX_PRODUTOS) {
        printf("Limite de produtos atingido!\n");
        return;
    }
    Produto p;
    printf("Codigo do produto: ");
    scanf("%d", &p.codigoproduto);
    printf("Descricao: ");
    getchar(); // Limpa o buffer
    fgets(p.descricao, 200, stdin);
    p.descricao[strcspn(p.descricao, "\n")] = 0; // Remove o '\n' ao final
    printf("Valor: ");
    scanf("%f", &p.valor);
    printf("Quantidade em estoque: ");
    scanf("%d", &p.quantidade);
    p.ativo = true; // Produto ativo por padrão
    produtos[total_produtos++] = p;
    printf("Produto cadastrado com sucesso!\n");
    system("pause");
}

// Função para procurar produto
void procurar_produto() {
    int codigo;
    printf("Digite o codigo do produto: ");
    scanf("%d", &codigo);
    for (int i = 0; i < total_produtos; i++) {
        if (produtos[i].codigoproduto == codigo) {
            printf("Descricao: %s\n", produtos[i].descricao);
            printf("Valor: %.2f\n", produtos[i].valor);
            printf("Quantidade em estoque: %d\n", produtos[i].quantidade);
            printf("Status: %s\n", produtos[i].ativo ? "Ativo" : "Inativo");
            system("pause");
            return;
        }
    }
    printf("Produto nao encontrado!\n");
    system("pause");
}

// Função para alterar produto
void alterar_produto() {
    int codigo;
    printf("Digite o codigo do produto: ");
    scanf("%d", &codigo);
    for (int i = 0; i < total_produtos; i++) {
        if (produtos[i].codigoproduto == codigo) {
            printf("Novo valor: ");
            scanf("%f", &produtos[i].valor);
            printf("Nova quantidade em estoque: ");
            scanf("%d", &produtos[i].quantidade);
            printf("Alterar status (1-Ativo / 0-Inativo): ");
            scanf("%d", &produtos[i].ativo);
            printf("Produto alterado com sucesso!\n");
            system("pause");
            return;
        }
    }
    printf("Produto nao encontrado!\n");
    system("pause");
}

// Função para listar produtos
void listar_produtos() {
    printf("Lista de produtos:\n");
    for (int i = 0; i < total_produtos; i++) {
        printf("Codigo: %d, Descricao: %s, Valor: %.2f, Estoque: %d, Status: %s\n",
               produtos[i].codigoproduto, produtos[i].descricao, produtos[i].valor,
               produtos[i].quantidade, produtos[i].ativo ? "Ativo" : "Inativo");
    }
    system("pause");
}

// Função para incluir item no carrinho
void incluir_item() {
    if (total_itens_carrinho >= MAX_CARRINHO) {
        printf("Limite de itens no carrinho atingido!\n");
        return;
    }
    int codigo, quantidade;
    printf("Digite o codigo do produto: ");
    scanf("%d", &codigo);
    for (int i = 0; i < total_produtos; i++) {
        if (produtos[i].codigoproduto == codigo && produtos[i].ativo && produtos[i].quantidade > 0) {
            printf("Digite a quantidade: ");
            scanf("%d", &quantidade);
            if (quantidade > produtos[i].quantidade) {
                printf("Quantidade em estoque insuficiente!\n");
                system("pause");
                return;
            }
            Carrinho item;
            item.numeroitem = total_itens_carrinho + 1;
            item.quantidade = quantidade;
            item.produto = &produtos[i];
            item.valorunitario = produtos[i].valor;
            item.valortotal = item.valorunitario * item.quantidade;
            produtos[i].quantidade -= quantidade;
            carrinho[total_itens_carrinho++] = item;
            printf("Item adicionado ao carrinho!\n");
            system("pause");
            return;
        }
    }
    printf("Produto nao encontrado ou inativo!\n");
    system("pause");
}

// Função para fechar venda
void fechar_venda() {
    float total = 0.0;
    printf("Itens no carrinho:\n");
    for (int i = 0; i < total_itens_carrinho; i++) {
        printf("Item %d: %s, Quantidade: %d, Valor Unitario: %.2f, Valor Total: %.2f\n",
               carrinho[i].numeroitem, carrinho[i].produto->descricao, carrinho[i].quantidade,
               carrinho[i].valorunitario, carrinho[i].valortotal);
        total += carrinho[i].valortotal;
    }
    printf("Valor total da venda: %.2f\n", total);
    system("pause");
}

// Programa principal
void main() {
    char* main_choices[] = {
        "Cadastro do Produto",
        "Abrir Venda",
        "Sair"
    };
    char* regchoices[] = {
        "Inserir",
        "Procurar",
        "Alterar",
        "Listar",
        "Voltar"
    };
    char* salechoices[] = {
        "Incluir Item",
        "Fechar Venda",
        "Voltar"
    };

    char** current_choices = main_choices; // Ponteiro para as escolhas atuais
    int n_choices = sizeof(main_choices) / sizeof(char*);
    int highlight = 0;
    int running = true;

    while (running) {
        printmenu(highlight, current_choices, n_choices);

        const int c = getch(); // Espera por caracter
        switch (c) {
            case 72: // Tecla cima
                highlight = (highlight - 1 + n_choices) % n_choices;
                break;
            case 80: // Tecla baixo
                highlight = (highlight + 1) % n_choices;
                break;
            case 13: // Tecla Enter / confirmar opção
                if (current_choices == main_choices) {
                    if (highlight == 0) { // Cadastro do Produto
                        current_choices = regchoices;
                        n_choices = sizeof(regchoices) / sizeof(char*);
                        highlight = 0;
                    } else if (highlight == 1) { // Abrir Venda
                        current_choices = salechoices;
                        n_choices = sizeof(salechoices) / sizeof(char*);
                        highlight = 0;
                    } else if (highlight == 2) { // Sair
                        running = false;
                    }
                } else if (current_choices == regchoices) {
                    if (highlight == 0) {
                        inserir_produto();
                    } else if (highlight == 1) {
                        procurar_produto();
                    } else if (highlight == 2) {
                        alterar_produto();
                    } else if (highlight == 3) {
                        listar_produtos();
                    } else if (highlight == 4) { // Sair do submenu Cadastro
                        current_choices = main_choices;
                        n_choices = sizeof(main_choices) / sizeof(char*);
                        highlight = 0;
                    }
                } else if (current_choices == salechoices) {
                    if (highlight == 0) {
                        incluir_item();
                    } else if (highlight == 1) {
                        fechar_venda();
                    } else if (highlight == 2) { // Sair do submenu Venda
                        current_choices = main_choices;
                        n_choices = sizeof(main_choices) / sizeof(char*);
                        highlight = 0;
                    }
                }
            break;
            case 27: // Tecla Esc / voltar ao menu principal
                if (current_choices != main_choices) {
                    current_choices = main_choices;
                    n_choices = sizeof(main_choices) / sizeof(char*);
                    highlight = 0;
                }
            break;
            default:
                break;
        }
    }
}
