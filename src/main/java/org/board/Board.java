package org.board;

import org.math.Location;
import org.math.Orientator;

import java.util.ArrayList;

public class Board {
    ArrayList<Piece> black;
    ArrayList<Piece> white;
    public Dimension dim;
    Orientator orientator;

    public Board(ArrayList<Piece> black, ArrayList<Piece> white, Dimension dim, Orientator orientator) {
        this.black = black;
        this.white = white;
        this.dim = dim;
        this.orientator = orientator;
    }


    public String print(){



        return "";
    }

    public boolean isAvailable(Location location){

    }

    public class Dimension {
        public int x;
        public int y;
        public int z;

        public Dimension(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
