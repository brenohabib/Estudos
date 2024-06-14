#include "game_interface.h"
#include <iostream>

void runGame() {
    int rows = 10;
    int cols = 10;
    Crossword crossword = createCrossword(rows, cols);
    
    std::string word;
    int row, col;
    char direction;
    bool horizontal;
    
    while (true) {
        std::cout << "Palavra (ou 'exit' para sair): ";
        std::cin >> word;
        if (word == "exit") break;
        
        std::cout << "Posição inicial (linha coluna): ";
        std::cin >> row >> col;
        
        std::cout << "Direção (h para horizontal, v para vertical): ";
        std::cin >> direction;
        horizontal = (direction == 'h');
        
        if (placeWord(crossword, word, row, col, horizontal)) {
            std::cout << "Palavra adicionada com sucesso!" << std::endl;
        } else {
            std::cout << "Não foi possível adicionar a palavra." << std::endl;
        }
        
        displayCrossword(crossword);
    }
}
