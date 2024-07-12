package xadras;

public class King extends Piece{

    public King(int xPos, int yPos, Color color) {
        super(xPos, yPos, color, color == Color.WHITE ? 'K' : 'k');
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        int xDiff = Math.abs(newXPos - getXPos());
        int yDiff = Math.abs(newYPos - getYPos());

        // o rei se move 1 casa em qualquer direção
        return xDiff <= 1 && yDiff <= 1;
    }
    
}
