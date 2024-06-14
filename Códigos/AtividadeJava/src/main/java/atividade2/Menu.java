package atividade2;

import java.util.Scanner;

public class Menu {
    private String title;
    private int sizeX;
    private int sizeY;

    public Menu(String title, int sizeX, int sizeY) {
        this.title = title;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    
    public void start() {
        clearScreen();
        printTitle();
        for (int i = 0; i < sizeY; i++) {
            printEmpty();
        }
        printLine();
    }

    private void printTitle() {
        printLine();
        printCenteredText(title);
        printLine();
    }

    private void printLine() {
        System.out.println("-".repeat(sizeX));
    }

    private void printEmpty() {
        System.out.println("|" + " ".repeat(sizeX - 2) + "|");
    }

    private void printCenteredText(String text) {
        int padding = (sizeX - text.length()) / 2;
        System.out.println("|" + " ".repeat(padding) + text + " ".repeat(sizeX - text.length() - padding - 2) + "|");
    }

    public void text(String text, int line) {
        setCursorToLine(line + 2);
        printCenteredText(text);
        resetCursor();
    }

    public void text(String text, int line, Alignment position) {
        setCursorToLine(line + 2);
        printAlignedText(text, position);
        resetCursor();
    }

    private void printAlignedText(String text, Alignment position) {
        int padding = calculatePadding(text.length(), position);
        System.out.print("|" + " ".repeat(padding) + text);
        System.out.println(" ".repeat(sizeX - text.length() - padding - 2) + "|");
    }

    private int calculatePadding(int textLength, Alignment position) {
        return switch (position) {
            case LEFT -> 1;
            case CENTER -> (sizeX - textLength) / 2;
            case RIGHT -> sizeX - textLength - 3;
        };
    }

    public String input() {
        return input("Input: ");
    }

    public String input(String label) {
        int padding = calculatePadding(label.length(), Alignment.LEFT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("|" + " ".repeat(padding) + label + "\0337");
        System.out.println(" ".repeat(sizeX - label.length() - padding - 2) + "|");
        printLine();
        System.out.print("\0338");
        return scanner.nextLine();
    }

    private void clearScreen() {
        System.out.print("\033[H\033[0J");
    }

    private void setCursorToLine(int line) {
        System.out.print("\0337\033[H");
        for (int i = 0; i < line; i++) {
            System.out.print("\033[1B");
        }
    }

    private void resetCursor() {
        System.out.print("\0338");
    }

    public void setSize(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
    }

    public enum Alignment {
        LEFT, RIGHT, CENTER
    }
}
