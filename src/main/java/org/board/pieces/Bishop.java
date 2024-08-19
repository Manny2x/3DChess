package org.board.pieces;

import org.board.Board;
import org.board.Piece;
import org.math.Location;

import java.util.ArrayList;

public class Bishop extends Piece {
    Location loc;
    boolean colour;
    public Bishop(boolean colour, Board.Dimension dim, int rOrL){
        this.colour = colour;
        loc = new Location(0, 0, dim.z);
    }
    @Override
    public char getSign() {
        return 'B';
    }

    @Override
    public boolean isMoveLegal(Location nextMove) {
        int[] changes = {Math.abs(nextMove.coords[0] - loc.coords[0]),
                Math.abs(nextMove.coords[1] - loc.coords[1])
                , Math.abs(nextMove.coords[2] - loc.coords[2])};
        for(int i : changes)
            for(int j : changes)
                if(i == j) return true;
        return false;
    }

    @Override
    public Location getLocation() {
        return loc;
    }

    @Override
    public void setLocation(Location location) {
        this.loc = location;
    }

    @Override
    public boolean getColour() {
        return false;
    }
}
