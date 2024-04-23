package Menu;

public class MainMenu {
    public static void main(String[] args) {
        String text;
        Menu mainMenu = new Menu("Teste", 80);
        mainMenu.clearScreen();
        mainMenu.printTitle();
        mainMenu.printText("texto", Alignment.LEFT);
        mainMenu.printLine();
        text = mainMenu.input("input: ");
        mainMenu.clearScreen();
        System.out.println(text);
    }   
}
