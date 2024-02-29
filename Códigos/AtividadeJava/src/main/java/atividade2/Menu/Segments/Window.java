package atividade2.Menu.Segments;

import java.util.Scanner;

public class Window {
    protected String name;
    protected int sizeX, sizeY;
    private int paddle;

    public Window(String name, int sizeX,int sizeY) {
        this.name = name;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        paddle = adjustPaddle();
    }

    protected void printHeader() {
        int halfSizeX = sizeX / 2;
        int halfNameLength = name.length() / 2;
        printLine();
        System.out.print('|');
        for (int i = 0; i <= halfSizeX - halfNameLength; i++) {
            System.out.print(' ');
            
        }
        System.out.print(name);

        for (int i = 0; i <= halfSizeX - halfNameLength; i++) {
            System.out.print(' ');

        }
        System.out.print('|');
        System.out.println();
        printLine();

    }

    protected int input() {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        input.close();
        return value;
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

        if(name.length() % 2 == 0) {
            paddle = 3;
        }
        return paddle;
    }

    public String getName() {
        return name;
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
