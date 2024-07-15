package xadras;

public class King extends Piece{
    private MoveValidator moveValidator;

    public King(int xPos, int yPos, Color color, Board board) {
        super(xPos, yPos, color, color == Color.WHITE ? 'K' : 'k');
        this.moveValidator = new MoveValidator(board);
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        if (Math.abs(newXPos - getXPos()) <= 1 && Math.abs(newYPos - getYPos()) <= 1) {
            // o rei se move 1 casa em qualquer direção
            return moveValidator.isPathClear(getXPos(), getYPos(), newXPos, newYPos, getColor());
        }
        return false;
    }   
}
