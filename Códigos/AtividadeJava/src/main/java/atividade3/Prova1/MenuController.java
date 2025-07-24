package atividade3.Prova1;

import atividade2.Menu;

public class MenuController {
    public static String displayMainMenu() {
        Menu mainMenu = MenuFactory.createMainMenu();
        mainMenu.printMenu();
        return mainMenu.input("Digite uma opção: ");
    }

    public static String displayClientMenu() {
        Menu clientMenu = MenuFactory.createClientMenu();
        clientMenu.printMenu();
        return clientMenu.input("Digite uma opção: ");
    }

    public static String displayLocationMenu() {
        Menu locationMenu = MenuFactory.createLocationMenu();
        locationMenu.printMenu();
        return locationMenu.input("Digite uma opção: ");
    }
}
