package atividade2.Menu;

public class Menu extends Window{

    public Menu(String name, int sizeX, int sizeY) {
        super(name, sizeX, sizeY);
    }

    public void printMenu() {
        printHeader();
        printBody();
    }


}
