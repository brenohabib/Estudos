package xadras;

public class Pawn extends Piece {
    private boolean firstMove = true;

    public Pawn(int xPos, int yPos, Color color) {
        super(xPos, yPos, color);
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        int direction = (getColor() == Color.WHITE) ? 1 : -1;
        
        // Movimento inicial: pode mover 2 casas para frente
        if (firstMove && newXPos == getXPos() && newYPos - getYPos() == 2 * direction) {
            firstMove = false;
            return true;
        }

        // Movimento padrão: pode mover 1 casa para frente
        if (newXPos == getXPos() && newYPos - getYPos() == direction) {
            firstMove = false;
            return true;
        }

        // Captura: pode mover 1 casa na diagonal
        if (Math.abs(newXPos - getXPos()) == 1 && newYPos - getYPos() == direction) {
            firstMove = false;
            return true;
        }

        return false;
    }

}
