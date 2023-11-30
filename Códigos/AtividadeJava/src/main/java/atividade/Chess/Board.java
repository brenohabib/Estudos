package atividade.Chess;

public class Board {

    private Piece[][] pieces;
    private int x;
    private int y;

    public Board(int x, int y) {
        this.pieces = new Piece[x][y];
        this.x = x;
        this.y = y;
    }

    public Piece getPiece(int x, int y) {
        if (x < 0 || x >= x || y < 0 || y >= y) {
            throw new IllegalArgumentException("Invalid coordinates");
        }
        return pieces[x][y];
    }

    public void setPiece(int x, int y, Piece piece) {
        if (x < 0 || x >= 8 || y < 0 || y >= 8) {
            throw new IllegalArgumentException("Invalid coordinates");
        }
        pieces[x][y] = piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void printBoard() {
        for(int i = 0; i < getY(); i++){
            printLine();
            printPipeLine();
        }
        printLine();
    }
    
    public void printLine() {
        for(int i = 0; i < getX() * 6 + 1; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public void printPipeLine() {
        for(int i = 0; i < getX() + 1; i++){
            System.out.print("|     ");
        }
        System.out.println();
    }
}