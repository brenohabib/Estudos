package atividade2.Menu.Segments;

public class Window {
    private String name;
    private int sizeX, sizeY;

    public Window(String name, int sizeX,int sizeY) {
        this.name = name;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    private void printLine() {
        for (int i = 0; i <= sizeX; i++) {
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
