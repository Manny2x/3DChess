package org.board;

import org.math.Location;
import java.util.ArrayList;

public abstract class Piece {
    public abstract char getSign();
    public abstract boolean isMoveLegal(Location nextMove);
    public abstract Location getLocation();
    public abstract void setLocation(Location location);

    public abstract boolean getColour();
    public boolean getState(Board board){
        if(!this.getColour()) return board.white.contains(this);
        else return board.black.contains(this);
    }
}
