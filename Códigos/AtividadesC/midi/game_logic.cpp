#include "game_logic.h"
#include <iostream>

Crossword createCrossword(int rows, int cols) {
    Crossword crossword;
    crossword.rows = rows;
    crossword.cols = cols;
    crossword.board.resize(rows, std::vector<char>(cols, '.'));
    return crossword;
}

bool placeWord(Crossword &crossword, const std::string &word, int row, int col, bool horizontal) {
    if (horizontal) {
        if (col + word.length() > crossword.cols) return false;
        for (size_t i = 0; i < word.length(); ++i) {
            crossword.board[row][col + i] = word[i];
        }
    } else {
        if (row + word.length() > crossword.rows) return false;
        for (size_t i = 0; i < word.length(); ++i) {
            crossword.board[row + i][col] = word[i];
        }
    }
    return true;
}

void displayCrossword(const Crossword &crossword) {
    for (const auto &row : crossword.board) {
        for (const auto &cell : row) {
            std::cout << cell << ' ';
        }
        std::cout << std::endl;
    }
}
