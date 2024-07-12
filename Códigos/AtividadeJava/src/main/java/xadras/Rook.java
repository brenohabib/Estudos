package xadras;

public class Rook extends Piece {
    private MoveValidator moveValidator;

    public Rook(int xPos, int yPos, Color color, Board board) {
        super(xPos, yPos, color, color == Color.WHITE ? 'R' : 'r');
        this.moveValidator = new MoveValidator(board);
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        if (getXPos() == newXPos || getYPos() == newYPos) {
            return moveValidator.isPathClear(getXPos(), getYPos(), newXPos, newYPos);
        }
        return false;
    }
}
