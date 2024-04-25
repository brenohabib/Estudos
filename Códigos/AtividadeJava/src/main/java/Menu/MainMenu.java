package Menu;

public class MainMenu {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Vending Machine", 80);
        mainMenu.start();
        mainMenu.text("Credit: R$20.00", 1, Alignment.RIGHT);
        mainMenu.input();
    }
}
