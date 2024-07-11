package xadras;

public class Pawn extends Piece{

    private boolean firstMove = true;

    public Pawn(int xPos, int yPos, Color color) {
        super(xPos, yPos, color);
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {

        //When he didn't moved, can move either 1 or 2 foward
        if(firstMove && (newYPos - this.yPos == 1 || newYPos - this.yPos == 2)) {
            firstMove = false;
            return true;
        }

        if(newYPos - this.yPos == 1) {
            return true;
        }

        


        return false;
    }
    
}
