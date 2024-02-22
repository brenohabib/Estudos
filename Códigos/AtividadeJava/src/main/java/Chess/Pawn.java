package Chess;

public class Pawn extends Piece{
    private int posX;
    private int posY;
    private boolean isFirstMove = true;

    @Override
    public void move(int x, int y) {
        if(isValidMove()) {
            posX = x;
            posY = y;
        }
        isFirstMove = false;
    }

    @Override
    public boolean isValidMove(){
        return true;
    }
    
}
