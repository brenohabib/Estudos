package atividade2.Menu.Segments;

import java.util.Scanner;

public class Window {
    protected String label;
    protected int sizeX, sizeY;
    private int paddle;

    public Window(String name, int sizeX,int sizeY) {
        this.label = name;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        paddle = adjustPaddle();
    }

    protected void printHeader() {
        int halfSizeX = sizeX / 2;
        int halfNameLength = label.length() / 2;
        printLine();
        System.out.print('|');
        for (int i = 0; i <= halfSizeX - halfNameLength; i++) {
            System.out.print(' ');
            
        }
        System.out.print(label);

        for (int i = 0; i <= halfSizeX - halfNameLength; i++) {
            System.out.print(' ');

        }
        System.out.print('|');
        System.out.println();
        printLine();

    }
    

    protected void printLine() {
        for (int i = 0; i <= sizeX + paddle; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    protected void printLateral() {
        for (int i = 0; i <= sizeX + paddle; i++) {
            if(i == 0 || i == sizeX + paddle) {
                System.out.print('|');
            }
            else {
                System.out.print(' ');
            }
        }
        System.out.println();
    }

    protected void printBody() {
        for(int i = 0; i < sizeY; i++) {
            printLateral();
        }
        printLine();
    }

    private int adjustPaddle() {
        if(sizeX % 2 == 0) {
            paddle = 4;
        }

        if(label.length() % 2 == 0) {
            paddle = 3;
        }
        return paddle;
    }

    public String getLabel() {
        return label;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }
    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
}
