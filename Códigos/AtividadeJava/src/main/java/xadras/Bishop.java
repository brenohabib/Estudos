package xadras;

public class Bishop extends Piece {

    public Bishop(int xPos, int yPos, Color color) {
        super(xPos, yPos, color, color == Color.WHITE ? 'B' : 'b');
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        int xDiff = Math.abs(newXPos - getXPos());
        int yDiff = Math.abs(newYPos - getYPos());

        // O bispo se move em diagonais
        return xDiff == yDiff;
    }
}
