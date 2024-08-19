package org.board.pieces;

import org.board.Board;
import org.board.Piece;
import org.math.Location;

import java.util.ArrayList;

public class Queen extends Piece {
    Location loc;
    boolean colour;
    public Queen(boolean colour, Board.Dimension dim){
        this.colour = colour;
        loc = new Location(0, 0, dim.z);

    }
    @Override
    public char getSign() {
        return 'Q';
    }

    @Override
    public boolean isMoveLegal(Location nextMove) {
        boolean diagonal = false;
        boolean orthogonal;

        int eq = 0;
        for(int i = 0; i < 2; i++)
            if(nextMove.coords[i] == this.loc.coords[i]) eq++;
        orthogonal = eq == 2;

        int[] changes = {Math.abs(nextMove.coords[0] - loc.coords[0]),
                Math.abs(nextMove.coords[1] - loc.coords[1]),
                Math.abs(nextMove.coords[2] - loc.coords[2])};
        for(int i : changes)
            for(int j : changes)
                if(i == j) diagonal = true;
        return diagonal || orthogonal;
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
