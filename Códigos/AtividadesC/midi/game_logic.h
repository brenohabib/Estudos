#ifndef GAME_LOGIC_H
#define GAME_LOGIC_H

#include <vector>
#include <string>

struct Crossword {
    std::vector<std::vector<char>> board;
    int rows;
    int cols;
};

Crossword createCrossword(int rows, int cols);
bool placeWord(Crossword &crossword, const std::string &word, int row, int col, bool horizontal);
void displayCrossword(const Crossword &crossword);

#endif
