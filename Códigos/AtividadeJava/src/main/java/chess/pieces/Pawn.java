package chess.pieces;

import chess.Board;

public class Pawn implements Piece{
    String icon;

    public Pawn(){
        icon = "P";
    }

    @Override
    public void move(int x, int y) {
        
    }

    @Override
    public void delete() {
        
    }

    @Override
    public String getIcon() {
        return icon;
    }
}
