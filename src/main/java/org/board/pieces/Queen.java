package org.board.pieces;

import org.board.Piece;
import org.math.Location;

import java.util.ArrayList;

public class Queen extends Piece {
    @Override
    public char getSign() {
        return 0;
    }

    @Override
    public boolean isMoveLegal(Location nextMove) {
        return false;
    }
 dces DC
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
