package atividade2.Menu;

import atividade2.Menu.Segments.Window;

public class Menu extends Window{

    public Menu(String name, int sizeX, int sizeY) {
        super(name, sizeX, sizeY);
    }

    public void printMenu() {
        printLine();
        for(int i = 0; i < super.getSizeY(); i++) {
            printLateral();
        }
        printLine();
    }
    private void printHeader() {
        //TODO
    }

    private void printLine() {
        for (int i = 0; i <= super.getSizeX(); i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    private void printLateral() {
        for (int i = 0; i <= super.getSizeX(); i++) {
            if(i == 0 || i == super.getSizeX()) {
                System.out.print('|');
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
