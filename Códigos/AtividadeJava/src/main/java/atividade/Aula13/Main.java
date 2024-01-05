package atividade.Aula13;

import java.util.Scanner;

import atividade.Aula13.Menu.SegmentPosition;

import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) throws InterruptedException {

        int mainMenuSize = 60;
        int productMenuSize = 50;
        int ordinationMenuSize = 71;
        int searchMenuSize = 120;
        int maxProducts = 50;

        Menu mainMenu = new Menu("Menu", mainMenuSize);
        Menu productMenu = new Menu("Produtos", productMenuSize);
        Menu ordinationMenu = new Menu("Ordenações", ordinationMenuSize);
        Menu searchMenu = new Menu("Buscar Produto", searchMenuSize);

        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        String[] nameList = new String[maxProducts];

        Float[][] productList = new Float[2][maxProducts];
        int productQuantity = 0;

        boolean isRunning = true, inProduct = false, inOrdination = false, inSearch = false;

        boolean nameFound = false;

        String currentOrdination = "Bubble Sort";
        String currentOrder = "Crescente";
        String currentSearch = "Nome";

        String[] sortConfiguration = { currentSearch, currentOrdination, currentOrder };

        int menuCommand, productCommand, removeCommand, ordinationCommand, searchCommand;

        while (isRunning) {

            mainMenu.printTitle();
            mainMenu.printBody();
            System.out.println();
            menuCommand = mainMenu.intInput(intInput);

            if (menuCommand == 1) {

                inProduct = true;

            }

            if (menuCommand == 2) {

                inOrdination = true;

            }
            if (menuCommand == 3) {

                inSearch = true;

            }

            if (menuCommand == 4) {

                isRunning = false;

            }

            while (inProduct) {

                productMenu.printTitle();
                productMenu.printSegment();
                productMenu.printSegment("1 - Adicionar", "  2 - Remover", "  3 - Voltar");

                productMenu.printLine();
                System.out.println();
                productCommand = productMenu.intInput(intInput);

                if (productCommand == 1) {
                    if (productQuantity < 50) {
                        int exchangeCommand = 0;
                        
                        productMenu.printTitle();
                        nameList[productQuantity] = productMenu.stringInput(stringInput, "Nome");
                        productList[0][productQuantity] = productMenu.floatInput(intInput, "Valor");
                        productList[1][productQuantity] = productMenu.floatInput(intInput, "Quantidade");
                        
                        int namePos = Menu.searchName(nameList, nameList[productQuantity], productMenu);

                        if (namePos < productQuantity) {
                            
                            String value;
                            String quantity;

                            productMenu.printTitle();
                            productMenu.printSegment();
                            productMenu.printSegment("Deseja trocar o produto abaixo?");

                            value = String.format("%.2f", productList[0][namePos]);
                            quantity = String.format("%.0f", productList[1][namePos]);
                            productMenu.printSegment(namePos + " - " + nameList[namePos], "      ",
                                    "R$ " + value, "      Quantidade: " + quantity);

                            productMenu.printSegment();
                            productMenu.printSegment("1 - Sim", "     2 - Não");
                            productMenu.printLine();
                            System.out.println();
                            exchangeCommand = productMenu.intInput(intInput);

                            if (exchangeCommand == 1) {

                                nameList[namePos] = nameList[productQuantity];
                                productList[0][namePos] = productList[0][productQuantity];
                                productList[1][namePos] = productList[1][productQuantity];

                                productMenu.printTitle();
                                productMenu.printSegment("Produto Trocado!");
                                productMenu.printLine();
                                System.out.println();

                                TimeUnit.SECONDS.sleep(2);

                            }
                            
                            else {

                                nameList[productQuantity] = nameList[namePos];
                                productList[0][productQuantity] = productList[0][namePos];
                                productList[1][productQuantity] = productList[1][namePos];
                            }

                        }
                        else{
                        
                            productQuantity++;
                        
                        }
                        
                    }

                    else if (productQuantity >= 50) {

                        productMenu.printTitle();
                        productMenu.printSegment("A quantidade de produtos excede 50!");
                        productMenu.printLine();

                        TimeUnit.SECONDS.sleep(2);

                    }

                }

                if (productCommand == 2 && productQuantity > 0) {

                    productMenu.printTitle();
                    productMenu.printSegment("Qual produto deseja remover?");
                    productMenu.printLine();
                    System.out.println();
                    productMenu.printSegment();

                    int toBeShown = productQuantity;
                    int productShowed = 0;
                    while (toBeShown > 0) {

                        if (toBeShown - 2 <= -1) {

                            productMenu.printSegment(productShowed + " - " + nameList[productShowed]);
                            toBeShown -= 1;
                        }

                        else if (toBeShown >= 2) {

                            productMenu.printSegment(productShowed + " - " + nameList[productShowed++], "    ",
                                    productShowed + " - " + nameList[productShowed++]);
                            toBeShown -= 2;
                        }

                    }

                    productMenu.printLine();
                    System.out.println();

                    removeCommand = productMenu.intInput(intInput);

                    if (nameList[removeCommand] != null) {

                        for (int i = removeCommand; i < productQuantity - 1; i++) {
                            nameList[i] = nameList[i + 1];
                            productList[0][i] = productList[0][i + 1];
                            productList[1][i] = productList[1][i + 1];
                        }

                        nameList[productQuantity - 1] = null;
                        productList[0][productQuantity - 1] = 0f;
                        productList[1][productQuantity - 1] = 0f;

                        productQuantity--;

                    }

                    else if (nameList[removeCommand] == null) {

                        productMenu.printTitle();
                        productMenu.printSegment();
                        productMenu.printSegment("Não há esse produto para remover!");
                        productMenu.printLine();
                        System.out.println();

                        TimeUnit.SECONDS.sleep(2);
                    }

                } else if (productCommand == 2 && productQuantity <= 0) {

                    productMenu.printTitle();
                    productMenu.printSegment();
                    productMenu.printSegment("Não há produtos para remover!");
                    productMenu.printLine();
                    System.out.println();

                    TimeUnit.SECONDS.sleep(2);

                }

                if (productCommand == 3) {

                    inProduct = false;

                }

            } // produto

            while (inOrdination) {

                ordinationMenu.printTitle();
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("1 - Bubble", "   2 - Insertion", "   3 - Selection", "   4 - Voltar");
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("Usando: " + currentOrdination);
                ordinationMenu.printSegment("Ordem:    " + currentOrder);
                ordinationMenu.printSegment("Procurando por:  " + currentSearch);
                ordinationMenu.printLine();
                System.out.println();

                ordinationCommand = ordinationMenu.intInput(intInput);

                if (ordinationCommand == 1) {

                    currentOrdination = "Bubble Sort";

                }

                if (ordinationCommand == 2) {

                    currentOrdination = "Insertion Sort";

                }

                if (ordinationCommand == 3) {

                    currentOrdination = "Selection Sort";

                }
                if (ordinationCommand == 4) {

                    inOrdination = false;
                    break;

                }

                ordinationMenu.printTitle();
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("1 - Crescente", "  2 - Decrescente", "  3 - Voltar");
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("Usando: " + currentOrdination);
                ordinationMenu.printSegment("Ordem:    " + currentOrder);
                ordinationMenu.printSegment("Procurando por:  " + currentSearch);

                ordinationMenu.printLine();
                System.out.println();

                ordinationCommand = ordinationMenu.intInput(intInput);

                if (ordinationCommand == 1) {

                    currentOrder = "Crescente";

                }
                if (ordinationCommand == 2) {

                    currentOrder = "Decrescente";

                }

                ordinationMenu.printTitle();
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("1 - Nome", "  2 - Preço", "  3 - Voltar");
                ordinationMenu.printSegment();
                ordinationMenu.printSegment("Usando: " + currentOrdination);
                ordinationMenu.printSegment("Ordem:    " + currentOrder);
                ordinationMenu.printSegment("Procurando por:  " + currentSearch);

                ordinationMenu.printLine();
                System.out.println();

                ordinationCommand = ordinationMenu.intInput(intInput);

                if (ordinationCommand == 1) {

                    currentSearch = "Nome";

                }
                if (ordinationCommand == 2) {

                    currentSearch = "Preço";
                }

                String[] aux = {currentSearch, currentOrdination, currentOrder};

                for (int i = 0; i < 3; i++){
                
                    sortConfiguration[i] = aux[i];

                }

                Sort.chooseSort(sortConfiguration, nameList, productList);

            } //ordenação

            while (inSearch) {

                searchMenu.printTitle();

                searchMenu.printSegment("Ordenação atual: " + currentOrdination +
                        ", Ordem " + currentOrder +
                            ", Procurando pelo " +currentSearch, SegmentPosition.LEFT);

                searchMenu.printSegment();

                searchMenu.printSegment("1 - Buscar por nome",
                              "          2 - Mostrar todos os produtos",
                              "          3 - Voltar");

                searchMenu.printLine();
                System.out.println();

                searchCommand = searchMenu.intInput(intInput);
                int namePos = 0;

                if (searchCommand == 1) {

                    searchMenu.printTitle();
                    searchMenu.printSegment();

                    String nameInput = searchMenu.stringInput(stringInput, "Nome");

                    namePos = Menu.searchName(nameList, nameInput, searchMenu);

                    if (namePos >= 0) {

                        nameFound = true;

                    } else {

                        nameFound = false;

                    }

                    if (nameFound) {

                        searchMenu.printTitle();
                        searchMenu.printSegment();

                        String value = String.format("%.2f", productList[0][namePos]);
                        String quantity = String.format("%.0f", productList[1][namePos]);

                        searchMenu.printSegment("Nome do produto: ", nameList[namePos]);
                        searchMenu.printSegment("Valor do produto: R$", value);
                        searchMenu.printSegment("Quantidade total: ", quantity);
                        searchMenu.printSegment();

                        searchMenu.printSegment("1 - Voltar");
                        searchMenu.printLine();

                        System.out.println();
                        searchMenu.intInput(intInput);

                    }
                    if (!nameFound) {

                        searchMenu.printTitle();
                        searchMenu.printSegment();
                        searchMenu.printSegment("Produto não encontrado!");
                        searchMenu.printLine();
                        System.out.println();

                        TimeUnit.SECONDS.sleep(2);

                    }
                }
                
                if (searchCommand == 2) { 
                    searchMenu.printTitle();

                    Sort.chooseSort(sortConfiguration, nameList, productList);

                    Float avarage = 0f;
                    for(int i = 0; i < productQuantity; i++){
                    
                        avarage += productList[0][i]/productQuantity;
                    
                    }
                    String stringAvarage = String.format("%.2f", avarage);
                    searchMenu.printSegment("Média de preço: R$" + stringAvarage + ' ', SegmentPosition.RIGHT);

                    Menu.searchMenu(searchMenu, productQuantity, productList, nameList);

                    if (productQuantity == 0) {

                        searchMenu.printSegment("Nenhum produto encontrado");

                    }
                    searchMenu.printSegment("1 - Voltar", SegmentPosition.LEFT);
                    searchMenu.printLine();
                    System.out.println();

                    searchCommand = searchMenu.intInput(intInput);
                }

                if (searchCommand == 3) {

                    inSearch = false;

                }
            } //Busca
        }
    }
}
