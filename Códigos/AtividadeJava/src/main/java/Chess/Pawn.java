package Chess;

public class Pawn extends Piece{
    private int posX;
    private int posY;
    private boolean isFirstMove = true;

    @Override
    public void move(int newX, int newY) {
        if(isValidMove(newX, newY)) {
            posX = newX;
            posY = newY;
            isFirstMove = false;
        }
        else{

        }
        
    }

    public boolean isValidMove(int newX, int newY) {

        // Verificar se movimento está dentro do tabuleiro
        if (newX < 0 || newX >= 8 || newY < 0 || newY >= 8) {
            return false;
        }

        if (posX == newX && posY + 2 == newY && isFirstMove) {
            return true; // Avanço de 2 casas, válido apenas do início
        }

        if (posX == newX && posY + 1 == newY) {
            return true; // Avanço de 1 casa
        }

        // Captura diagonal
        if (Math.abs(newX - posX) == 1 && newY - posY == 1) {
            return true;
        }
        return false;
    }
    
}
