package atividade.Chess;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board board = new Board(8, 8);
        Scanner input = new Scanner(System.in);
        boolean playing = true;
        String command;

        for (int i = 0; i < board.getX(); i++) {
            board.setPiece(1, i, new Pawn(Color.WHITE, board, "P"));
        }

        for (int i = 0; i < board.getX(); i++) {
            board.setPiece(6, i, new Pawn(Color.BLACK, board, "P"));
        }

        while(playing){
            board.printBoard();
            command = input.next();
        }
        
        
    }
}
