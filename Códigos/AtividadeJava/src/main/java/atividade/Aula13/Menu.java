package atividade.Aula13;

import java.util.Scanner;

import atividade.Aula13.Menu.SegmentPosition;

import java.util.concurrent.TimeUnit;

class Menu extends SegmentPosition {

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

    public static void searchMenu(Menu searchMenu, int productQuantity, Float productList[][], String[] nameList) {

        String value, quantity;
        int toBeShown = productQuantity;
        int productShowed = 0;
        while (toBeShown > 0) {

            value = String.format("%.2f", productList[0][productShowed]);
            quantity = String.format("%.0f", productList[1][productShowed]);
            searchMenu.printSegment(productShowed + " - " + nameList[productShowed], "      ",
                    "R$ " + value, "      Quantidade: " + quantity);

            productShowed++;
            toBeShown--;
        }
    
    }
}
