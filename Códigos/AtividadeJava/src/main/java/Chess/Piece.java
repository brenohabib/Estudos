package Chess;

public abstract class Piece {
    private int posX;
    private int posY;

    public abstract void move(int x, int y);
    public abstract boolean isValidMove();
}
