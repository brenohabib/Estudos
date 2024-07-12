package xadras;

public class MoveValidator {
    private Board board;

    public MoveValidator(Board board) {
        this.board = board;
    }

    public boolean isPathClear(int startX, int startY, int endX, int endY, Color pieceColor) {
        int xDirection = Integer.signum(endX - startX);
        int yDirection = Integer.signum(endY - startY);

        int currentX = startX + xDirection;
        int currentY = startY + yDirection;

        while (currentX != endX || currentY != endY) {
            if (board.getPiece(currentX, currentY) != null) {
                return false;
            }
            currentX += xDirection;
            currentY += yDirection;
        }

        // Verifica se a peça no destino é aliada
        Piece targetPiece = board.getPiece(endX, endY);
        if (targetPiece != null && targetPiece.getColor() == pieceColor) {
            return false;
        }

        return true;
    }
}
