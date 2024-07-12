package xadras;

public class Queen extends Piece {
    private MoveValidator moveValidator;

    public Queen(int xPos, int yPos, Color color, Board board) {
        super(xPos, yPos, color, color == Color.WHITE ? 'Q' : 'q');
        this.moveValidator = new MoveValidator(board);
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        int xDiff = Math.abs(newXPos - getXPos());
        int yDiff = Math.abs(newYPos - getYPos());

        if (xDiff == yDiff || newXPos == getXPos() || newYPos == getYPos()) {
            return moveValidator.isPathClear(getXPos(), getYPos(), newXPos, newYPos);
        }
        return false;
    }
}
