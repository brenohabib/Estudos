package Chess;

public abstract class Piece {
    private int posX;
    private int posY;

    public abstract void move(int x, int y);
    
    public boolean isValidMove(int newX, int newY){
        if (newX < 0 || newX >= 8 || newY < 0 || newY >= 8) {
            return false;
        }
        return false;
    }
}
