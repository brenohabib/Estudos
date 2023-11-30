package atividade.Chess;

public class Main {

    public static void main(String[] args) {
        Board board = new Board(8, 8); // Initialize 8x8 chessboard

        for (int i = 0; i < 8; i++) {
            Board pawnBoard = new Board(i, 1);
            board.setPiece(i, 1, new Pawn(Color.WHITE, pawnBoard));
        }

        for (int i = 0; i < 8; i++) {
            Board pawnBoard = new Board(i, 6);
            board.setPiece(i, 6, new Pawn(Color.BLACK, pawnBoard));
        }
        
        board.printBoard();
    }
}