package atividade2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final String title;
    private int sizeX;
    private int sizeY;
    private final List<String> menuBuffer;

    public Menu(String title, int sizeX, int sizeY) {
        this.title = title;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.menuBuffer = new ArrayList<>();
    }

    public void start() {
        buildTitle();
        for (int i = 0; i < sizeY; i++) {
            buildEmptyLine();
        }
        buildLine();
    }

    public void printMenu() {
        render();
    }

    private void buildTitle() {
        buildLine();
        buildCenteredText(title);
        buildLine();
    }

    private void buildLine() {
        menuBuffer.add("-".repeat(sizeX));
    }

    private void buildEmptyLine() {
        menuBuffer.add("|" + " ".repeat(sizeX - 2) + "|");
    }

    private void buildCenteredText(String text) {
        buildAlignedText(text);
    }

    public void text(String text, int line) {
        updateLine(line + 2, text, Alignment.CENTER);
    }

    public void text(String text, int line, Alignment position) {
        updateLine(line + 2, text, position);
    }

    private void updateLine(int line, String text, Alignment position) {
        if (line >= 0 && line < menuBuffer.size()) {
            String alignedText = getAlignedText(text, position);
            menuBuffer.set(line, alignedText);
        }
    }

    private void buildAlignedText(String text) {
        menuBuffer.add(getAlignedText(text, Alignment.CENTER));
    }

    private String getAlignedText(String text, Alignment position) {
        int padding = calculatePadding(text.length(), position);
        return "|" + " ".repeat(padding) + text +
                " ".repeat(Math.max(sizeX - text.length() - padding - 2, 0)) + "|";
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
        Scanner scanner = new Scanner(System.in);
        buildLine();
        System.out.print(label);
        return scanner.nextLine();
    }

    private void render() {
        for (String line : menuBuffer) {
            System.out.println(line);
        }
    }

    public void setSize(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
    }

    public enum Alignment {
        LEFT, RIGHT, CENTER
    }
}
