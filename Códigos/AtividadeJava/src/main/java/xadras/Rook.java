package xadras;

public class Rook extends Piece {

    public Rook(int xPos, int yPos, Color color) {
        super(xPos, yPos, color, color == Color.WHITE ? 'R' : 'r');
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        // A torre se move horizontalmente ou verticalmente
        if (newXPos == getXPos() || newYPos == getYPos()) {
            return true;
        }
        return false;
    }
}
