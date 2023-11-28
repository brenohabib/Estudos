package chess;
import chess.pieces.*;

/* ---------------------------------
 * | H | N | B | Q | K | B | N | H |
 * | P | P | P | P | P | P | P | P |
 * |   |   |   |   |   |   |   |   |
 * |   |   |   |   |   |   |   |   |
 * |   |   |   |   |   |   |   |   |
 * |   |   |   |   |   |   |   |   |
 * | P | P | P | P | P | P | P | P |
 * | H | N | B | Q | K | B | N | H |
 * ---------------------------------
 */

public class Board {

    Piece[][] board = new Piece[8][8];

    public void printLine() {
        System.out.println("-------------------------------------------------");
    }

public void init() {
    pawnLine();
    kingLine(); 

}

public void pawnLine() {
    for (int i = 0; i < board.length; i++) {
        board[1][i] = new Pawn();
        board[6][i] = new Pawn();
    }
}

public void kingLine() {
    Piece[] kingRowPieces = {
        new Hook(), new Knight(), new Bishop(), new Queen(), new King(),
            new Bishop(), new Knight(), new Hook()
        };

    for (int i = 0; i < board.length; i++){
        board[0] = kingRowPieces;
        board[7] = kingRowPieces;
    }
}

public void printBoard() {
    printLine();
    for (int i = 0; i < 8; i++) {
        System.out.print("|");

        for (int j = 0; j < 8; j++) {
            Piece piece = board[i][j];

            if (piece != null) {
                System.out.print("  " + piece.getIcon() + "  |");

            } else {
                System.out.print("     |");

            }
        }
        System.out.println();
        printLine();
    }
}

    public Piece[][] getBoard() {
        return board;
    }

    public void setBoard(Piece piece, int x, int y) {
        board[x][y] = piece;
    }
}
