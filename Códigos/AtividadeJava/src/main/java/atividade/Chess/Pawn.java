package atividade.Chess;

public class Pawn extends Piece {

    public Pawn(Color color, Board position) {
        super(color, position);
    }

    @Override
    public boolean isValidMove(Board destination) {
        if (this.getColor() == Color.WHITE) {
            if (this.getPosition().getY() == 1 && destination.getY() == 3 && this.isFirstMove()) {
                return true;

            } else if (Math.abs(this.getPosition().getX() - destination.getX()) == 0 && Math.abs(this.getPosition().getY() - destination.getY()) == 1) {
                return true;

            }
        } 
        else {
            if (this.getPosition().getY() == 6 && destination.getY() == 4 && this.isFirstMove()) {
                return true;

            } else if (Math.abs(this.getPosition().getX() - destination.getX()) == 0 && Math.abs(this.getPosition().getY() - destination.getY()) == 1) {
                return true;

            }
        }
        return false;
    }

    @Override
    public void move(Board destination) {
        this.setPosition(destination);
        this.setFirstMove(false);
    }
}
