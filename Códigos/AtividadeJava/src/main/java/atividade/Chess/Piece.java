package atividade.Chess;

public abstract class Piece {

    private Color color;
    private Board position;
    private boolean firstMove;

    public Piece(Color color, Board position) {
        this.color = color;
        this.position = position;
        this.firstMove = true;
    }

    public Color getColor() {
        return color;
    }

    public Board getPosition() {
        return position;
    }

    public boolean isFirstMove() {
        return firstMove;
    }

    public void setPosition(Board position) {
        this.position = position;
    }

    public void setFirstMove(boolean firstMove) {
        this.firstMove = firstMove;
    }

    public abstract boolean isValidMove(Board destination);

    public abstract void move(Board destination);
}