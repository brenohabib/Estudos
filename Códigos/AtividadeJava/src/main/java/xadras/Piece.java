package xadras;

public abstract class Piece {
    private char icon;
    protected int xPos;
    protected int yPos;
    private Color color;

    public Piece( int xPos, int yPos, Color color) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
    }

    public abstract boolean canMoveTo(int newXPos, int newYPos);

    public void move(int newXPos, int newYPos) {
        if (canMoveTo(newXPos, newYPos) && isValidPosition(newXPos, newYPos)) {
            this.xPos = newXPos;
            this.yPos = newYPos;
        }
    }

    private boolean isValidPosition(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [xPos=" + xPos + ", yPos=" + yPos + ", color=" + color + "]";
    }

    public char getIcon() {
        return icon;
    }

    public void setIcon(char icon) {
        this.icon = icon;
    }

}
