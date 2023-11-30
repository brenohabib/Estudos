package atividade.Chess;

public enum Color {
    WHITE,
    BLACK;

    public Color getOppositeColor() {
        if (this == WHITE) {
            return BLACK;
        } 
        else {
            return WHITE;
        }
    }

    public boolean isOppositeColor(Color color) {
        return this != color;
    }

    public boolean isSameColor(Color color) {
        return this == color;
    }
}
