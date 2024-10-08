package org.board.pieces;

import org.board.Board;
import org.board.Piece;
import org.math.Location;

import java.util.ArrayList;

public class Rook extends Piece {
    Location loc;
    boolean colour;
    public Rook(boolean colour, Board.Dimension dim, int rOrL){
        this.colour = colour;
        if(rOrL == 0) loc = new Location(dim.x, dim.y, dim.z);
        else if(rOrL == 1) loc = new Location(dim.x, 0, dim.z);

    }
    @Override
    public char getSign() {
        return 'R';
    }


    @Override
    public boolean isMoveLegal(Location nextMove){
        //Rooks can only move horizontally or vertically
        int eq = 0;
        for(int i = 0; i < 2; i++)
            if(nextMove.coords[i] == this.loc.coords[i]) eq++;
        return eq == 2;
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
