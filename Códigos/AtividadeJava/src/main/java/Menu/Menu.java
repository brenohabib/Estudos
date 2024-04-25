package Menu;

import java.util.Scanner;

public class Menu {
    private String title;
    private int sizeX;

    public Menu(String title, int sizeX) {
        this.sizeX = sizeX;
        this.title = title;
    }
    
    /**
     * Clear the screen and shows the menu.
     * This must be called to initialize the menu.
     * @param None
     * @return void
     */
    public void start() {
        clearScreen();
        printTitle();
        for (int i = 0; i < 5; i++) {
            printEmpty();
        }
        printLine();
    }

    private void printTitle() {
        printLine();
        text(this.title);
        printLine();
    }

    private void printLine() {
        for (int i = 0; i < sizeX; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private void printEmpty() {
        int paddle = 2;
        System.out.print("|");
        for (int i = 0; i < sizeX - paddle; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
    private void text(String text) {
        int rightPaddle = 1;
        int leftPaddle = 1;
        int middle = (sizeX / 2) - (text.length() / 2);
        if (text.length() % 2 != 0) {
            leftPaddle++;
        }

        if (sizeX % 2 != 0) {
            leftPaddle--;
        }

        System.out.print("|");
        for (int i = 0; i < middle - rightPaddle; i++) {
            System.out.print(" ");
        }
        System.out.print(text);

        for (int i = 0; i < middle - leftPaddle; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public void text(String text, int line) {
        int rightPaddle = 1;
        int leftPaddle = 1;
        line += 2;
        int middle = (sizeX / 2) - (text.length() / 2);
        System.out.print("\0337");
        System.out.print("\033[H");
        for (int i = 0; i < line; i++) {
            System.out.print("\033[1B");
        }
        if (text.length() % 2 != 0) {
            leftPaddle++;
        }

        if (sizeX % 2 != 0) {
            leftPaddle--;
        }

        System.out.print("|");
        for (int i = 0; i < middle - rightPaddle; i++) {
            System.out.print(" ");
        }
        System.out.print(text);

        for (int i = 0; i < middle - leftPaddle; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        System.out.print("\0338");
        
    }

    public void text(String text, int line, Alignment position) {
        int padding = calculatePadding(text.length(), position);
        line += 2;

        System.out.print("\0337");
        System.out.print("\033[H");
        for (int i = 0; i < line; i++) {
            System.out.print("\033[1B");
        }
        System.out.print("|");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(text);
    
        if (text.isEmpty()) {
            for (int i = 0; i < sizeX - padding - 2; i++) {
                System.out.print(" ");
            }
        }
        else {
            for (int i = 0; i < sizeX - text.length() - padding - 2; i++) {
                System.out.print(" ");
            }
        }
        System.out.println("|");
        System.out.print("\0338");
    }

    private int calculatePadding(int textLength, Alignment position) {
        int padding = 0;
        switch (position) {
            case LEFT:
                padding = 1;
                break;
            case CENTER:
                padding = (sizeX - textLength) / 2;
                break;
            case RIGHT:
                padding = sizeX - textLength - 3;
                break;
        }
        return Math.max(padding, 0);
    }
    public String input() {
        String label = "Input: ";
        int padding = calculatePadding(label.length(), Alignment.LEFT);
        Scanner input = new Scanner(System.in);
        System.out.print("|");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(label + "\0337");
    
        if (label.isEmpty()) {
            for (int i = 0; i < sizeX - padding - 2; i++) {
                System.out.print(" ");
            }
        }
        else {
            for (int i = 0; i < sizeX - label.length() - padding - 2; i++) {
                System.out.print(" ");
            }
        }
        System.out.println("|");
        printLine();

        System.out.print("\0338");
        String text = input.next();
        input.close();
        return text;
    }

    public String input(String label) {
        int padding = calculatePadding(label.length(), Alignment.LEFT);
        Scanner input = new Scanner(System.in);
        System.out.print("|");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(label + "\0337");
    
        if (label.isEmpty()) {
            for (int i = 0; i < sizeX - padding - 2; i++) {
                System.out.print(" ");
            }
        }
        else {
            for (int i = 0; i < sizeX - label.length() - padding - 2; i++) {
                System.out.print(" ");
            }
        }
        System.out.println("|");
        printLine();

        System.out.print("\0338");
        String text = input.next();
        input.close();
        return text;
    }

    private void clearScreen() {
        System.out.print("\033[H");
        System.out.print("\033[0J");
    }
}
