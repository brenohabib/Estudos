package xadras;

public abstract class Piece {
    protected int xPos;
    protected int yPos;
    private Color color;

    public Piece(int xPos, int yPos, Color color) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
    }

    public abstract boolean canMoveTo(int newXPos, int newYPos);

    public void move(int newXPos, int newYPos) {
        if (canMoveTo(newXPos, newYPos)) {
            this.xPos = newXPos;
            this.yPos = newYPos;
        }
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

}
