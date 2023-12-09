package atividade.Chess;

public abstract class Piece {

    private Color color;
    private Board position;
    private boolean firstMove;
    private String icon;

    public Piece(Color color, Board position, String icon) {
        this.color = color;
        this.position = position;
        this.firstMove = true;
        this.icon = icon;
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

    public String getIcon() {
        return icon;
    }

    public abstract boolean isValidMove(Board destination);

    public abstract void move(Board destination);
}
