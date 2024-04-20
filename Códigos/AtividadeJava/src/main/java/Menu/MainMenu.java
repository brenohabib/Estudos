package Menu;

public class MainMenu {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Teste", 80);
        mainMenu.printTitle();
        mainMenu.printText("texto", Alignment.LEFT);
        mainMenu.printLine();
        mainMenu.input("input: ");
        mainMenu.clearScreen();
    }   
}
