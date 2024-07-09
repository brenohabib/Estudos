package xadras;

public class Pawn extends Piece{

    private boolean firstMove = true;

    public Pawn(int xPos, int yPos, Color color) {
        super(xPos, yPos, color);
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        
        if (firstMove && ((newYPos - yPos == 1) || (newYPos - yPos == 2)))  {
            firstMove = false;
            return true;
        }

        return false;
    }
    
}
