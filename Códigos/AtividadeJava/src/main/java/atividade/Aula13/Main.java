package atividade.Aula13;

/*1. Entrada de Dados:
a. Permitir ao usuário inserir até 50 produtos.
b. Cada produto terá um nome (string) e um preço (float).
c. Os produtos devem ser armazenados em vetores e matrizes sendo:
i. Uma do tipo string para armazenar o nome do produto
ii. Uma matriz do tipo float 2x50 que irá armazenar o valor do produto e a
quantidade do produto em estoque.

2. Funções e Procedimentos:
a. Implementar funções para os métodos de ordenação: Bubble Sort, Insertion Sort e
Selection Sort.
b. Implementar um procedimento para exibir a lista de produtos.
c. Implementar uma função para buscar um produto pelo nome e retornar seu preço.

3. Ordenação:
a. Permitir ao usuário escolher o método de ordenação.
b. Permitir ao usuário escolher se deseja ordenar por nome ou por preço.

4. Interface:
a. Exibir um menu para o usuário com as seguintes opções:
b. Inserir produto.
c. Exibir produtos.
d. Ordenar produtos por nome.
e. Ordenar produtos por preço.
f. Buscar produto por nome.
g. Sair.

5. Funcionalidades:
a. Implementar uma função que identifique e remova produtos duplicados (com base no
nome) após a inserção.
b. Implementar uma função que calcule e retorne a média de preço dos produtos
inseridos.
c. Permitir ao usuário escolher a ordem da ordenação (crescente ou decrescente) quando

selecionar as opções de ordenar por nome ou preço. 

*/

public class Main {

    public static void main(String[] args) {

        int menuSize = 75;
        int segmentSize = 20;

        Menu menu = new Menu("Menu" , menuSize);
        menu.printMenu();

        for (int i = 0; i < segmentSize / 8 - 1; i++) {

            menu.printSegment();

        }

        menu.printSegment("(1) - Adicionar Produto",
                "          (4) - Remover Produto");
        menu.printSegment("(2) - Exibir Produtos",
              "            (5) - Buscar por nome");
        menu.printSegment("(3) - Métodos de Ordenação",
                   "       (6) - Sair do Sistema");

        menu.printLine();

    }
}

class Product {

    private String name;
    private float value;
    private int quantity;

    public Product(String name, float value, int quantity) {

        this.name = name;
        this.value = value;
        this.quantity = quantity;

    }

    public String getName() {

        return name;

    }

    public float getValue() {

        return value;

    }

    public int getQuantity() {

        return quantity;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setValue(float value) {

        this.value = value;

    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;

    }
}

class Menu {

    private int size;
    private String title;


    public Menu(String title, int size) {

        this.title = title;
        this.size = size;
    }

    public void printSegment() {

        int titleSize = title.length();
        int menuSize = size;
        int paddle = 0;

        if (titleSize % 2 != 0 || menuSize % 2 != 0) {

            paddle = 1;

        }

        System.out.print("|");

        for (int i = 0; i < size - paddle; i++) {

            System.out.print(" ");

        }

        System.out.print("|\n");

    }

    public void printSegment(String... texts) {

        int titleSize = title.length();
        int menuSize = size;
        int paddle = 0;


        
        if (titleSize % 2 != 0 || menuSize % 2 != 0) {
            paddle = 1;
        }
        
        System.out.print("|");

        int totalTextLength = 0;

        for (String text : texts) {
            totalTextLength += text.length();
        }

        int totalSpaces = size - totalTextLength - texts.length - paddle;


        int spacesBefore = totalSpaces / 2;
        int spacesAfter = totalSpaces / 2;


        
        if (totalTextLength % 2 != 0) {
        
            spacesAfter += 2;

        }
        

        for (int i = 0; i < spacesBefore; i++) {
            System.out.print(" ");
        }

        for (String text : texts) {
            System.out.print(text);
            System.out.print(" ");
        }

        for (int i = 0; i < spacesAfter; i++) {
            System.out.print(" ");
        }

        System.out.print("|\n");
    }
    
    

    public void printLine() {

        int titleSize = title.length();
        int menuSize = size;
        int paddle = 0;

        if (titleSize % 2 == 0 && menuSize % 2 == 0) {
            paddle = 1;
        }

        if (titleSize % 2 != 0 && menuSize % 2 == 0) {
            paddle = 2;
        }
        for (int i = 0; i <= menuSize + paddle; i++) {

            System.out.print("-");

        }
    }
    
    public void printMenu() {


        int titleSize = title.length();
        int menuSize = size;

        printLine();
        System.out.print("\n|");

        for (int i = 0; i < menuSize / 2 - titleSize / 2; i++) {

            System.out.print(" ");

        }
        System.out.print(title);
        for (int i = 0; i < menuSize / 2 - titleSize / 2; i++) {

            System.out.print(" ");

        }
        System.out.print("|\n");

        printLine();

        System.out.println();
    }
}
