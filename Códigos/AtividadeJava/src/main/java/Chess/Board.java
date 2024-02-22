package Chess;

public class Board {
    private Piece[][] board = new Piece[8][8];

    public Piece[][] getBoard() {
        return board;
    }

    public void addPieceAt(int x, int y, Piece piece) {
        this.board[x][y] = piece;
    }

    public void init(){
        for(int i = 0; i < board.length; i++) {
            addPieceAt(i, 1, new Pawn());
            addPieceAt(i, 6, new Pawn());
        }
    }

}
