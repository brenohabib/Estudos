package xadras;

public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        // Inicializa peões
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(1, i, Color.WHITE);
            board[6][i] = new Pawn(6, i, Color.BLACK);
        }

        board[0][0] = new Rook(0, 0, Color.WHITE);
        board[0][7] = new Rook(0, 7, Color.WHITE);
        board[7][0] = new Rook(7, 0, Color.BLACK);
        board[7][7] = new Rook(7, 7, Color.BLACK);

        // Inicialize outras peças (cavalos, bispos, rainhas, reis) aqui
        // ...

        // Preenche o resto do tabuleiro com null
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = null;
            }
        }
    }

    public Piece getPiece(int x, int y) {
        if (isValidPosition(x, y)) {
            return board[x][y];
        }
        return null;
    }

    public void setPiece(int x, int y, Piece piece) {
        if (isValidPosition(x, y)) {
            board[x][y] = piece;
        }
    }

    public boolean movePiece(int startX, int startY, int endX, int endY) {
        if (isValidPosition(startX, startY) && isValidPosition(endX, endY)) {
            Piece piece = board[startX][startY];
            if (piece != null && piece.canMoveTo(endX, endY)) {
                board[endX][endY] = piece;
                board[startX][startY] = null;
                piece.move(endX, endY);
                return true;
            }
        }
        return false;
    }

    private boolean isValidPosition(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    sb.append(". ");
                } else {
                    sb.append(board[i][j].getIcon()).append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
