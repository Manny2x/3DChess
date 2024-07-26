package org.board;

import org.math.Orientator;

import java.util.ArrayList;

public class Board {
    ArrayList<Piece> black;
    ArrayList<Piece> white;
    Dimension dim;
    Orientator orientator;

    public Board(ArrayList<Piece> black, ArrayList<Piece> white, Dimension dim, Orientator orientator) {
        this.black = black;
        this.white = white;
        this.dim = dim;
        this.orientator = orientator;
    }

    public class Dimension {
        int x;
        int y;
        int z;
    }
}
