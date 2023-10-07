package atividade.Aula13;

import java.util.Scanner;

import atividade.Aula13.Menu.SegmentPosition;

import java.util.concurrent.TimeUnit;
/*

2. Funções e Procedimentos:
b. Implementar um procedimento para exibir a lista de produtos.
c. Implementar uma função para buscar um produto pelo nome e retornar seu preço.

3. Ordenação:
b. Permitir ao usuário escolher se deseja ordenar por nome ou por preço.

5. Funcionalidades:
b. Implementar uma função que calcule e retorne a média de preço dos produtos
inseridos.
c. Permitir ao usuário escolher a ordem da ordenação (crescente ou decrescente) quando
selecionar as opções de ordenar por nome ou preço.

*/
public class Main {

    public static void main(String[] args) throws InterruptedException {

        int mainMenuSize = 60;
        int productMenuSize = 50;
        int ordinationMenuSize = 71;
        int searchMenuSize = 120;
        int maxProducts = 50;

        Menu mainMenu = new Menu("Menu", mainMenuSize);
        Menu productMenu = new Menu("Produtos", productMenuSize);
        Menu ordinationMenu = new Menu("Ordenações", ordinationMenuSize);
        Menu searchMenu = new Menu("Buscar Produto", searchMenuSize);

        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        String[] nameList = new String[maxProducts];
        
        Float[][] productList = new Float[2][maxProducts];
        int productQuantity = 0;

        boolean isRunning = true, inProduct = false, inOrdination = false, inSearch = false;

        boolean isAscending = true;

        boolean nameFound = false;

        String currentOrdination = "Bubble Sort";
        String currentOrder = "Crescente";
        String currentSearch = "Nome";

        String[] sortConfiguration = { currentSearch, currentOrdination, currentOrder };

        int menuCommand, productCommand, removeCommand, ordinationCommand, searchCommand;

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
            if (menuCommand == 3) {

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
                    if (productQuantity < 50) {
                        int exchangeCommand = 0;
                        
                        productMenu.printTitle();
                        nameList[productQuantity] = productMenu.stringInput(stringInput, "Nome");
                        productList[0][productQuantity] = productMenu.floatInput(intInput, "Valor");
                        productList[1][productQuantity] = productMenu.floatInput(intInput, "Quantidade");
                        
                        int namePos = Menu.searchName(nameList, nameList[productQuantity], productMenu);

                        if (namePos < productQuantity) {
                            
                            String value;
                            String quantity;

                            productMenu.printTitle();
                            productMenu.printSegment();
                            productMenu.printSegment("Deseja trocar o produto abaixo?");

                            value = String.format("%.2f", productList[0][namePos]);
                            quantity = String.format("%.0f", productList[1][namePos]);
                            productMenu.printSegment(namePos + " - " + nameList[namePos], "      ",
                                    "R$ " + value, "      Quantidade: " + quantity);

                            productMenu.printSegment();
                            productMenu.printSegment("1 - Sim", "     2 - Não");
                            productMenu.printLine();
                            System.out.println();
                            exchangeCommand = productMenu.intInput(intInput);

                            if (exchangeCommand == 1) {

                                nameList[namePos] = nameList[productQuantity];
                                productList[0][namePos] = productList[0][productQuantity];
                                productList[1][namePos] = productList[1][productQuantity];

                                productMenu.printTitle();
                                productMenu.printSegment("Produto Trocado!");
                                productMenu.printLine();
                                System.out.println();

                                TimeUnit.SECONDS.sleep(2);

                            }
                            
                            else {

                                nameList[productQuantity] = nameList[namePos];
                                productList[0][productQuantity] = productList[0][namePos];
                                productList[1][productQuantity] = productList[1][namePos];
                            }

                        }
                        else{
                        
                            productQuantity++;
                        
                        }
                        
                    }

                    else if (productQuantity >= 50) {

                        productMenu.printTitle();
                        productMenu.printSegment("A quantidade de produtos excede 50!");
                        productMenu.printLine();

                        TimeUnit.SECONDS.sleep(2);

                    }

                }

                if (productCommand == 2 && productQuantity > 0) {

                    productMenu.printTitle();
                    productMenu.printSegment("Qual produto deseja remover?");
                    productMenu.printLine();
                    System.out.println();
                    productMenu.printSegment();

                    int toBeShown = productQuantity;
                    int productShowed = 0;
                    while (toBeShown > 0) {

                        if (toBeShown - 2 <= -1) {

                            productMenu.printSegment(productShowed + " - " + nameList[productShowed]);
                            toBeShown -= 1;
                        }

                        else if (toBeShown >= 2) {

                            productMenu.printSegment(productShowed + " - " + nameList[productShowed++], "    ",
                                    productShowed + " - " + nameList[productShowed++]);
                            toBeShown -= 2;
                        }

                    }

                    productMenu.printLine();
                    System.out.println();

                    removeCommand = productMenu.intInput(intInput);

                    if (nameList[removeCommand] != null) {

                        for (int i = removeCommand; i < productQuantity - 1; i++) {
                            nameList[i] = nameList[i + 1];
                            productList[0][i] = productList[0][i + 1];
                            productList[1][i] = productList[1][i + 1];
                        }

                        nameList[productQuantity - 1] = null;
                        productList[0][productQuantity - 1] = 0f;
                        productList[1][productQuantity - 1] = 0f;

                        productQuantity--;

                    }

                    else if (nameList[removeCommand] == null) {

                        productMenu.printTitle();
                        productMenu.printSegment();
                        productMenu.printSegment("Não há esse produto para remover!");
                        productMenu.printLine();
                        System.out.println();

                        TimeUnit.SECONDS.sleep(2);
                    }

                } else if (productCommand == 2 && productQuantity <= 0) {

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

            while (inOrdination) {

                ordinationMenu.printTitle();
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("1 - Bubble", "   2 - Insertion", "   3 - Selection", "   4 - Voltar");
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("Usando: " + currentOrdination);
                ordinationMenu.printSegment("Ordem:    " + currentOrder);
                ordinationMenu.printSegment("Procurando por:  " + currentSearch);
                ordinationMenu.printLine();
                System.out.println();

                ordinationCommand = ordinationMenu.intInput(intInput);

                if (ordinationCommand == 1) {

                    currentOrdination = "Bubble Sort";

                }

                if (ordinationCommand == 2) {

                    currentOrdination = "Insertion Sort";

                }

                if (ordinationCommand == 3) {

                    currentOrdination = "Selection Sort";

                }
                if (ordinationCommand == 4) {

                    inOrdination = false;
                    break;

                }

                ordinationMenu.printTitle();
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("1 - Crescente", "  2 - Decrescente", "  3 - Voltar");
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("Usando: " + currentOrdination);
                ordinationMenu.printSegment("Ordem:    " + currentOrder);
                ordinationMenu.printSegment("Procurando por:  " + currentSearch);

                ordinationMenu.printLine();
                System.out.println();

                ordinationCommand = ordinationMenu.intInput(intInput);

                if (ordinationCommand == 1) {

                    currentOrder = "Crescente";
                    isAscending = true;

                }
                if (ordinationCommand == 2) {

                    currentOrder = "Decrescente";
                    isAscending = false;

                }

                ordinationMenu.printTitle();
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("1 - Nome", "  2 - Preço", "  3 - Voltar");
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("Usando: " + currentOrdination);
                ordinationMenu.printSegment("Ordem:    " + currentOrder);
                ordinationMenu.printSegment("Procurando por:  " + currentSearch);

                ordinationMenu.printLine();
                System.out.println();

                ordinationCommand = ordinationMenu.intInput(intInput);

                if (ordinationCommand == 1) {

                    currentSearch = "Nome";

                }
                if (ordinationCommand == 2) {

                    currentSearch = "Preço";
                }

                String[] aux = {currentSearch, currentOrdination, currentOrder};

                for (int i = 0; i < 3; i++){
                
                    sortConfiguration[i] = aux[i];

                }

                Sort.chooseSort(sortConfiguration, nameList, productList);

            } //ordenação

            while (inSearch) {

                searchMenu.printTitle();

                searchMenu.printSegment("Ordenação atual: " + currentOrdination +
                        ", Ordem " + currentOrder +
                            ", Procurando pelo " +currentSearch, SegmentPosition.LEFT);

                searchMenu.printSegment();

                searchMenu.printSegment("1 - Buscar por nome",
                              "          2 - Mostrar todos os produtos",
                              "          3 - Voltar");

                searchMenu.printLine();
                System.out.println();

                searchCommand = searchMenu.intInput(intInput);
                int namePos = 0;

                if (searchCommand == 1) {

                    searchMenu.printTitle();
                    searchMenu.printSegment();

                    String nameInput = searchMenu.stringInput(stringInput, "Nome");

                    namePos = Menu.searchName(nameList, nameInput, searchMenu);

                    if (namePos >= 0) {

                        nameFound = true;

                    } else {

                        nameFound = false;

                    }

                    if (nameFound) {

                        searchMenu.printTitle();
                        searchMenu.printSegment();

                        String value = String.format("%.2f", productList[0][namePos]);
                        String quantity = String.format("%.0f", productList[1][namePos]);

                        searchMenu.printSegment("Nome do produto: ", nameList[namePos]);
                        searchMenu.printSegment("Valor do produto: R$", value);
                        searchMenu.printSegment("Quantidade total: ", quantity);
                        searchMenu.printSegment();

                        searchMenu.printSegment("1 - Voltar");
                        searchMenu.printLine();

                        System.out.println();
                        searchMenu.intInput(intInput);

                    }
                    if (!nameFound) {

                        searchMenu.printTitle();
                        searchMenu.printSegment();
                        searchMenu.printSegment("Produto não encontrado!");
                        searchMenu.printLine();
                        System.out.println();

                        TimeUnit.SECONDS.sleep(2);

                    }
                }
                
                if (searchCommand == 2) { // Adicionar páginas
                    searchMenu.printTitle();

                    int toBeShown = productQuantity;
                    int productShowed = 0;

                    String value;
                    String quantity;

                    Sort.chooseSort(sortConfiguration, nameList, productList);

                    while (toBeShown > 0) {

                        value = String.format("%.2f", productList[0][productShowed]);
                        quantity = String.format("%.0f", productList[1][productShowed]);
                        searchMenu.printSegment(productShowed + " - " + nameList[productShowed], "      ",
                                "R$ " + value, "      Quantidade: " + quantity);

                        productShowed++;
                        toBeShown--;
                    }

                    if (productQuantity == 0) {

                        searchMenu.printSegment("Nenhum produto encontrado");

                    }
                    searchMenu.printSegment("1 - Voltar", SegmentPosition.LEFT);
                    searchMenu.printLine();
                    System.out.println();

                    searchCommand = searchMenu.intInput(intInput);
                }

                if (searchCommand == 3) {

                    inSearch = false;

                }
            } //Busca
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
        if (texts.length % 2 == 0 && totalTextLength % 2 != 0) {

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
        UNILEFT,LEFT,RIGHT
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
            case UNILEFT:
                spacesBefore = 1;
                spacesAfter = size - text.length() - spacesBefore - paddle + 3;
                break;
            case LEFT:
                spacesBefore = 1;
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

    public static int searchName(String[] nameList,String nameToFind ,Menu menu) {
        boolean nameFound = false;
        int currentNamePos = 0;

        for (String name : nameList) {

            if (nameToFind.toLowerCase().equalsIgnoreCase(name) && !nameFound) {

                nameFound = true;
                break;
            }
            currentNamePos++;
        }
        if (nameFound) {

            return currentNamePos;

        } else {

            return -1;

        }
    }

    public int intInput(Scanner input) {

        int command;

        printSegment(" input:\033[s", SegmentPosition.UNILEFT);

        printLine();
        System.out.print("\033[u ");
        command = input.nextInt();
        System.out.println();

        return command;
    }

    public int intInput(Scanner input, String label) {

        int command;

        printSegment(" " + label + ":\033[s", SegmentPosition.UNILEFT);

        printLine();
        System.out.print("\033[u ");
        command = input.nextInt();
        System.out.println();

        return command;
    }

    public String stringInput(Scanner input, String label) {

        String command;

        printSegment(" " + label + ":\033[s", SegmentPosition.UNILEFT);

        printLine();
        System.out.print("\033[u ");
        command = input.nextLine();
        System.out.println();

        return command;

    }

    public float floatInput(Scanner input, String label) {

        float command;

        printSegment(" " + label + ":\033[s", SegmentPosition.UNILEFT);

        printLine();
        System.out.print("\033[u ");
        command = input.nextFloat();
        System.out.println();

        return command;
    }
}
class Sort {

    public static Float[] selectionSort(Float[] array, boolean isAscending) {

        for (int i = 0; i < array.length - 1; i++) {
            int key = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] != null){
                    if (isAscending && array[j] < array[key]) {
                        key = j;
                    }

                    else if (!isAscending && array[j] > array[key]) {
                        key = j;
                    }
                }
            }
            Float temp = array[key];
            array[key] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static String[] selectionSort(String[] array, boolean isAscending) {
        for (int i = 0; i < array.length - 1; i++) {
            int key = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] != null){
                    if (isAscending && array[j].compareTo(array[key]) < 0) {
                        key = j;
                    } else if (!isAscending && array[j].compareTo(array[key]) > 0) {
                        key = j;
                    }
                }
            }
            String temp = array[key];
            array[key] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static Float[] insertionSort(Float[] array, boolean isAscending) {
        Float key;
        int i, j;
        for (i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;

            if(array[j] != null){
                while (j >= 0 && (isAscending && key < array[j])) {
                    array[j + 1] = array[j];
                    j--;
                }

                while (j >= 0 && (!isAscending && key > array[j])) {
                    array[j + 1] = array[j];
                    j--;
                }
            }
            array[j + 1] = key;
        }
        return array;
    }

    public static String[] insertionSort(String[] array, boolean isAscending) {
        
        String key;
        int i, j;

        for (i = 1; i < array.length; i++) {
                key = array[i];
                j = i - 1;

                while (j >= 0 && (isAscending && key.compareTo(array[j]) < 0) && array[j] != null) {
                    array[j + 1] = array[j];
                    j--;
                }

                while (j >= 0 && (!isAscending && key.compareTo(array[j]) > 0) && array[j] != null) {
                    array[j + 1] = array[j];
                    j--;
                }

                array[j + 1] = key;
        }
        return array;
    }

    public static Float[] bubbleSort(Float[] array, boolean isAscending) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] != null && array[j + 1] != null) {
                    if ((isAscending && array[j] > array[j + 1]) || (!isAscending && array[j] < array[j + 1])) {
                        float temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static String[] bubbleSort(String[] array, boolean isAscending) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                
                if (array[j] != null && array[j + 1] != null) {
                    if (array[j].compareTo(array[j + 1]) > 0) {
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        return array;
    }
    
    public static void chooseSort(String[] data, String[] nameList, Float[][] productList) {

        boolean ascending = true;

        if (data[2].equals("Crescente")) {
            ascending = true;
        }
        if (data[2].equals("Decrescente")) {
            ascending = false;
        }
        

        if (data[0].equals("Nome")) {

            if (data[1].equals("Bubble Sort")) {

                Sort.bubbleSort(nameList, ascending);

            }

            if (data[1].equals("Insertion Sort")) {

                Sort.insertionSort(nameList, ascending);

            }

            if (data[1].equals("Selection Sort")) {

                Sort.selectionSort(nameList, ascending);

            }

        }
        
        if (data[0].equals("Preço")) {
            
            if (data[1].equals("Bubble Sort")) {

                Sort.bubbleSort(productList[0], ascending);
                Sort.bubbleSort(productList[1], ascending);

            }

            if (data[1].equals("Insertion Sort")) {

                Sort.insertionSort(productList[0], ascending);
                Sort.insertionSort(productList[1], ascending);

            }

            if (data[1].equals("Selection Sort")) {

                Sort.selectionSort(productList[0], ascending);
                Sort.selectionSort(productList[1], ascending);


            }
        }
    }
}
