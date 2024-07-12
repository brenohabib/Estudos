package xadras;

public class Knight extends Piece {

    public Knight(int xPos, int yPos, Color color) {
        super(xPos, yPos, color, color == Color.WHITE ? 'N' : 'n');
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        int xDiff = Math.abs(newXPos - getXPos());
        int yDiff = Math.abs(newYPos - getYPos());

        // O cavalo se move em um padrão de "L"
        return (xDiff == 2 && yDiff == 1) || (xDiff == 1 && yDiff == 2);
    }
}
