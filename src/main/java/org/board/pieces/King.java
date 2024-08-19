package org.board.pieces;

import org.board.Board;
import org.board.Piece;
import org.math.Location;

import java.util.ArrayList;

public class King extends Piece {
    Location loc;
    boolean colour;
    public King(boolean colour, Board.Dimension dim){
        this.colour = colour;
        loc = new Location(0, 0, dim.z);

    }
    @Override
    public char getSign() {
        return 'K';
    }

    @Override
    public boolean isMoveLegal(Location nextMove) {
        int[] changes = {Math.abs(nextMove.coords[0] - loc.coords[0]),
                Math.abs(nextMove.coords[1] - loc.coords[1]),
                Math.abs(nextMove.coords[2] - loc.coords[2])};

        for(int i : changes)
            if(i != 0 && i != 1) return false;

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
        return colour;
    }
}
