package atividade2;

import java.util.Scanner;

public class Menu {
    private final String title;
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
        printAlignedText(text, Alignment.CENTER);
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
        if (text.length() > sizeX - 2) {
            for (String part : splitText(text)) {
                printAlignedText(part, position);
            }
        } else {
            int padding = calculatePadding(text.length(), position);
            System.out.print("|" + " ".repeat(padding) + text);
            System.out.println(" ".repeat(Math.max(sizeX - text.length() - padding - 2, 0)) + "|");
        }
    }

    private String[] splitText(String text) {
        int maxLen = sizeX - 6;
        int parts = (text.length() + maxLen - 1) / maxLen;
        String[] result = new String[parts];

        for (int i = 0; i < parts; i++) {
            int start = i * maxLen;
            int end = Math.min(start + maxLen, text.length());
            result[i] = text.substring(start, end);
        }

        return result;
    }

    private int calculatePadding(int textLength, Alignment position) {
        int padding = switch (position) {
            case LEFT -> 1;
            case CENTER -> (sizeX - textLength) / 2;
            case RIGHT -> sizeX - textLength - 3;
        };
        return Math.max(padding, 0);
    }

    public String input() {
        return input("Input: ");
    }

    public String input(String label) {
        int padding = calculatePadding(label.length(), Alignment.LEFT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("|" + " ".repeat(padding) + label + "\u001b7");
        System.out.println(" ".repeat(Math.max(sizeX - label.length() - padding - 2, 0)) + "|");
        printLine();
        System.out.print("\u001b8");
        return scanner.nextLine();
    }

    private void clearScreen() {
        System.out.print("\u001b[H\u001b[0J");
    }

    private void setCursorToLine(int line) {
        System.out.print("\u001b7\u001b[H");
        for (int i = 0; i < line; i++) {
            System.out.print("\u001b[1B");
        }
    }

    private void resetCursor() {
        System.out.print("\u001b8");
    }

    public void setSize(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
    }

    public enum Alignment {
        LEFT, RIGHT, CENTER
    }
}
