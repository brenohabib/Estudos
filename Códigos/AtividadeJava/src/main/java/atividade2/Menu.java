package atividade2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final String title;
    private int sizeX = 80;
    private int sizeY = 8;
    private final List<String> menuBuffer;

    public Menu(String title) {
        this.title = title;
        this.menuBuffer = new ArrayList<>();
        applyChanges();
    }

    public void applyChanges() {
        cleanBuffer();
        buildTitle();
        for (int i = 0; i < sizeY; i++) {
            buildEmptyLine();
        }
        buildLine();
    }
    private void cleanBuffer() {
        this.menuBuffer.clear();
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

    public TextAlignmentBuilder text(String text, int line) {
        return new TextAlignmentBuilder(text, line + 2);
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
        applyChanges();
    }

    public enum Alignment {
        LEFT, RIGHT, CENTER
    }

    // Classe interna para construir o alinhamento de texto
    public class TextAlignmentBuilder {
        private final String text;
        private final int line;

        public TextAlignmentBuilder(String text, int line) {
            this.text = text;
            this.line = line;
        }

        public void left() {
            updateLine(line, text, Alignment.LEFT);
        }

        public void center() {
            updateLine(line, text, Alignment.CENTER);
        }

        public void right() {
            updateLine(line, text, Alignment.RIGHT);
        }
    }
}
