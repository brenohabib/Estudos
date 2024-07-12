package xadras;

public class MoveValidator {
    private Board board;

    public MoveValidator(Board board) {
        this.board = board;
    }

    public boolean isPathClear(int startX, int startY, int endX, int endY) {
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
        return true;
    }
}
