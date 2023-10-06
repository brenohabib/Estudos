package atividade.Aula13;

import java.util.Scanner;

import atividade.Aula13.Menu.SegmentPosition;

import java.util.concurrent.TimeUnit;
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

    public static void main(String[] args) throws InterruptedException {

        int mainMenuSize = 60;
        int productMenuSize = 50;
        int maxProducts = 50;

        Menu mainMenu = new Menu("Menu", mainMenuSize);
        Menu productMenu = new Menu("Produtos", productMenuSize);
        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        String[] nameList = new String[maxProducts];
        float[][] productList = new float[2][maxProducts];
        int productAmount = 0;

        boolean isRunning = true, inProduct = false, inOrdination = false, inSearch = false;

        int menuCommand, productCommand, removeCommand;

        while (isRunning) {

            mainMenu.printTitle();
            mainMenu.printBody();
            System.out.println();
            menuCommand = mainMenu.intInput(intInput);

            if (menuCommand == 1) {

                inProduct = true;

            }

            if (menuCommand == 2) {

                inOrdination = true;

            }
            if(menuCommand == 3){
            
                inSearch = true;
            
            }
            
            if (menuCommand == 4) {

                isRunning = false;

            }

            while (inProduct) {

                productMenu.printTitle();
                productMenu.printSegment();
                productMenu.printSegment("1 - Adicionar", "  2 - Remover", "  3 - Voltar");

                productMenu.printLine();
                System.out.println();
                productCommand = productMenu.intInput(intInput);

                if (productCommand == 1) {
                    if (productList.length < 50) {

                        productMenu.printTitle();
                        nameList[productAmount] = productMenu.stringInput(stringInput, "Nome");
                        productList[0][productAmount] = productMenu.floatInput(intInput, "Valor");
                        productList[1][productAmount] = productMenu.intInput(intInput, "Quantidade");

                        productAmount++;

                    }

                    else if (productList.length >= 50) {

                        productMenu.printTitle();
                        productMenu.printSegment("A quantidade de produtos excede 50!", SegmentPosition.CENTER);
                        productMenu.printLine();

                        TimeUnit.SECONDS.sleep(2);

                    }

                }

                if (productCommand == 2 && productAmount > 0) {

                    productMenu.printTitle();
                    productMenu.printSegment("Qual produto deseja remover?");
                    productMenu.printLine();
                    System.out.println();
                    productMenu.printSegment();

                    int toBeShown = productAmount;
                    int productShowed = 0;
                    while (toBeShown > 0) {

                        if (toBeShown - 2 <= -1) {

                            productMenu.printSegment(productShowed + " - " + nameList[productShowed]);
                            toBeShown -= 1;
                        }

                        else if (toBeShown >= 2) {

                            productMenu.printSegment(productShowed++ + " - " + nameList[productShowed], "    ",
                                    productShowed++ + " - " + nameList[productShowed]);
                            toBeShown -= 2;
                        }

                    }

                    productMenu.printLine();
                    System.out.println();

                    removeCommand = productMenu.intInput(intInput);

                    if (nameList[removeCommand] != null) {

                        nameList[removeCommand] = null;
                        productList[0][removeCommand] = 0;
                        productList[1][removeCommand] = 0;

                        productAmount--;
                    }

                    else if (nameList[removeCommand] == null) {

                        productMenu.printTitle();
                        productMenu.printSegment();
                        productMenu.printSegment("Não há esse produto para remover!");
                        productMenu.printLine();
                        System.out.println();

                        TimeUnit.SECONDS.sleep(2);
                    }

                } else if (productCommand == 2 && productAmount <= 0) {

                    productMenu.printTitle();
                    productMenu.printSegment();
                    productMenu.printSegment("Não há produtos para remover!");
                    productMenu.printLine();
                    System.out.println();

                    TimeUnit.SECONDS.sleep(2);

                }

                if (productCommand == 3) {

                    inProduct = false;

                }

            } // produto

        }
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

        if (texts.length % 2 != 0) {

            spacesAfter++;

        }
        
        if (texts.length % 2 != 0 && totalTextLength % 2 != 0) {

            spacesAfter -= 3;

        }
        if(texts.length % 2 == 0 && totalTextLength % 2 != 0){
        
            spacesAfter--;
        
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
    enum SegmentPosition {
    LEFT, CENTER, RIGHT
}
    public void printSegment(String text, SegmentPosition position) {

        int titleSize = title.length();
        int menuSize = size;
        int paddle = 0;

        if (titleSize % 2 != 0 || menuSize % 2 != 0) {
            paddle = 1;
        }

        System.out.print("|");

        int spacesBefore = 0;
        int spacesAfter = 0;

        switch (position) {
            case LEFT:
                spacesBefore = 1;
                spacesAfter = size - text.length() - spacesBefore - paddle + 3;
                break;
            case CENTER:
                spacesBefore = (size - text.length() - paddle) / 2;
                spacesAfter = size - text.length() - spacesBefore - paddle;
                break;
            case RIGHT:
                spacesBefore = size - text.length() - paddle;
                spacesAfter = 1;
                break;
        }

        for (int i = 0; i < spacesBefore; i++) {
            System.out.print(" ");
        }

        System.out.print(text);

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
    
    public void printTitle() {

        int titleSize = title.length();
        int menuSize = size;

        System.out.println("\033[1J");
        System.out.println("\033[H");

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
    
    public void printBody() {

        printSegment();
        printSegment("(1) - Produtos",
    "                 (3) - Buscar produto");
        printSegment("(2) - Métodos de Ordenação",
                "     (4) - Sair do Sistema");
        printLine();


    }
    
    public int intInput(Scanner input) {

        int command;

        printSegment(" input:\033[s", SegmentPosition.LEFT);

        printLine();
        System.out.print("\033[u ");
        command = input.nextInt();
        System.out.println();

        return command;
    }

    public int intInput(Scanner input, String label) {

        int command;

        printSegment(" " + label + ":\033[s", SegmentPosition.LEFT);

        printLine();
        System.out.print("\033[u ");
        command = input.nextInt();
        System.out.println();

        return command;
    }

    public String stringInput(Scanner input, String label) {

        String command;

        printSegment(" " + label + ":\033[s", SegmentPosition.LEFT);

        printLine();
        System.out.print("\033[u ");
        command = input.nextLine();
        System.out.println();

        return command;

    }

    public float floatInput(Scanner input, String label) {

        float command;

        printSegment(" " + label + ":\033[s", SegmentPosition.LEFT);

        printLine();
        System.out.print("\033[u ");
        command = input.nextFloat();
        System.out.println();

        return command;
    }
}
