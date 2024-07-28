package org.board.pieces;

import org.board.Board;
import org.board.Piece;
import org.math.Location;

import java.util.ArrayList;

public class King extends Piece {
    Location loc;
    boolean colour;
    public King(boolean colour, Board board, int rOrL){
        this.colour = colour;
        loc = new Location(0, 0, board.dim.z);

    }
    @Override
    public char getSign() {
        return 0;
    }

    @Override
    public boolean isMoveLegal(Location nextMove) {
        int totalCurr = 0;
        int totalNext = 0;

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
