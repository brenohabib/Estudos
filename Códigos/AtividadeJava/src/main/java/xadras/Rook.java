package xadras;

public class Rook extends Piece{
    private char icon = 'R';

    public Rook(int xPos, int yPos, Color color) {
        super(xPos, yPos, color);
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canMoveTo'");
    }

    public char getIcon() {
        return icon;
    }

    public void setIcon(char icon) {
        this.icon = icon;
    }

}
