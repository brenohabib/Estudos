package xadras;

public class Pawn extends Piece {
    private boolean firstMove = true;

    public Pawn(int xPos, int yPos, Color color) {
        super(xPos, yPos, color, color == Color.WHITE ? 'P' : 'p');
    }

    @Override
    public boolean canMoveTo(int newXPos, int newYPos) {
        int direction = (getColor() == Color.WHITE) ? 1 : -1;
        
        // Movimento inicial: pode mover 2 casas para frente
        if (firstMove && newYPos == getYPos() && newXPos - getXPos() == 2 * direction) {
            firstMove = false;
            return true;
        }

        // Movimento padrão: pode mover 1 casa para frente
        if (newYPos == getYPos() && newXPos - getXPos() == direction) {
            firstMove = false;
            return true;
        }

        // Captura: pode mover 1 casa na diagonal
        if (Math.abs(newYPos - getYPos()) == 1 && newXPos - getXPos() == direction) {
            firstMove = false;
            return true;
        }

        return false;
    }
}
