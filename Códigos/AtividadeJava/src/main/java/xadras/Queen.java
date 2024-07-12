package xadras;

public class Queen extends Piece {

    public Queen(int xPos, int yPos, Color color) {
        super(xPos, yPos, color, color == Color.WHITE ? 'Q' : 'q');
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        int xDiff = Math.abs(newXPos - getXPos());
        int yDiff = Math.abs(newYPos - getYPos());

        // a rainha se move horizontalmente ou verticalmente
        if (newXPos == getXPos() || newYPos == getYPos()) {
            return true;
        }
        // a rainha também se move em diagonais
        if (xDiff == yDiff) {
            return true;
        }

        return false;
    }
    
    
}
