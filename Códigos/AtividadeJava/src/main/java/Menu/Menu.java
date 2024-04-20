package Menu;

import java.util.Scanner;

public class Menu {
    private String title;
    private int sizeX;

    public Menu(String title, int sizeX) {
        this.sizeX = sizeX;
        this.title = title;
    }

    public void printTitle() {
        printLine();
        printText(this.title);
        printLine();
    }

    public void printLine() {
        for (int i = 0; i < sizeX; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void printEmpty() {
        int paddle = 2;
        System.out.print("|");
        for (int i = 0; i < sizeX - paddle; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public void printText(String text) {
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

    public void printText(String text, Alignment position) {
        int padding = calculatePadding(text.length(), position);
    
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

    public void clearScreen() {
        System.out.print("\033[H");
        System.out.print("\033[0J");
    }
}
