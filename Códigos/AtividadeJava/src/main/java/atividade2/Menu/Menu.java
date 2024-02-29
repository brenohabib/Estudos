package atividade2.Menu;

import atividade2.Menu.Segments.Window;

public class Menu extends Window{

    public Menu(String name, int sizeX, int sizeY) {
        super(name, sizeX, sizeY);
    }

    public void printMenu() {
        printHeader();
    }
    private void printHeader() {
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

    private void printLine() {
        int paddle = 3;

        if(sizeX % 2 == 0) {
            paddle = 4;
        }

        if(name.length() % 2 == 0) {
            paddle--;
        }

        for (int i = 0; i <= sizeX + paddle; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    private void printLateral() {
        for (int i = 0; i <= sizeX; i++) {
            if(i == 0 || i == sizeX) {
                System.out.print('|');
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
