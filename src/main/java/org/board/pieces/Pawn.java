package org.board.pieces;

import org.board.Board;
import org.board.Piece;
import org.math.Location;

import java.util.ArrayList;

public class Pawn extends Piece {
    Location lastLoc;
    Location loc;
    boolean colour;
    boolean enPassant;
    public Pawn(boolean colour, Board.Dimension dim){
        this.colour = colour;
        loc = new Location(0, 0, dim.z);
        this.lastLoc = loc;

        this.enPassant = false;
    }
    @Override
    public char getSign() {
        return 'P';
    }

    @Override
    public boolean isMoveLegal(Location nextMove) {
        boolean isLegal = false;
        if(lastLoc.coords == nextMove.coords) return false;

        return isLegal;

    }


    @Override
    public Location getLocation() {
        return this.loc;
    }

    @Override
    public void setLocation(Location location) {
        this.lastLoc = loc;
        this.loc = location;
    }

    @Override
    public boolean getColour() {
        return colour;
    }
}
