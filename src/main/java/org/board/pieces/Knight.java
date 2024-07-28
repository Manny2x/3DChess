package org.board.pieces;

import org.board.Piece;
import org.math.Location;

import java.util.ArrayList;

public class Knight extends Piece {
    @Override
    public char getSign() {
        return 0;
    }

    @Override
    public boolean isMoveLegal(Location nextMove) {
        return false;
    }

    @Override
    public Location getLocation() {
        return null;
    }

    @Override
    public void setLocation(Location location) {

    }

    @Override
    public boolean getColour() {
        return false;
    }
}
