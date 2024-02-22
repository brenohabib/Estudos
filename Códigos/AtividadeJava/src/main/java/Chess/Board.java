package Chess;

public class Board {
    private int[][] board = new int[8][8];

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public void init(){
        for(int i = 0; i < board.length; i++) {
            setBoard(this.board[i][1] = new Pawn());

        }
    }
}
