package xadras;

public class Bishop extends Piece {
    private MoveValidator moveValidator;

    public Bishop(int xPos, int yPos, Color color, Board board) {
        super(xPos, yPos, color, color == Color.WHITE ? 'B' : 'b');
        this.moveValidator = new MoveValidator(board);
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        if (Math.abs(newXPos - getXPos()) == Math.abs(newYPos - getYPos())) {
            return moveValidator.isPathClear(getXPos(), getYPos(), newXPos, newYPos, getColor());
        }
        return false;
    }
}
