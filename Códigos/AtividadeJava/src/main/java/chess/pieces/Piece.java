package chess.pieces;

public interface Piece {

    public void move(int x, int y);
    public void delete();
    public String getIcon();
    
}
