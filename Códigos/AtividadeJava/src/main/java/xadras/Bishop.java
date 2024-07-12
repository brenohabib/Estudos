package xadras;

public class Bishop extends Piece {
    private MoveValidator moveValidator;

    public Bishop(int xPos, int yPos, Color color) {
        super(xPos, yPos, color, color == Color.WHITE ? 'B' : 'b');
        this.moveValidator = new MoveValidator(board);
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        int xDiff = Math.abs(newXPos - getXPos());
        int yDiff = Math.abs(newYPos - getYPos());

        // O bispo se move em diagonais
        return xDiff == yDiff;
    }
}
