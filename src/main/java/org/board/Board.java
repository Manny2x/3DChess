package org.board;

import org.board.pieces.*;
import org.math.Location;
import org.math.Orientator;

import java.util.ArrayList;

public class Board {
    boolean turn;

    ArrayList<Piece> black;
    ArrayList<Piece> white;
    public Dimension dim;
    Orientator orientator;

    public Board(Dimension dim, Orientator orientator) {
        ArrayList<Piece> black = new ArrayList<>(){
            {
                add(new Bishop(true, dim, 1));
                add(new Bishop(true, dim, -1));

                add(new King(true, dim));
                add(new Queen(true, dim));

                add(new Knight());
                add(new Knight());

                add(new Rook(true, dim, 1));
                add(new Rook(true, dim, -1));

                for(int i = 0; i < 8; i++) add(new Pawn(true, dim));

            }
        };
        this.black = black;

        ArrayList<Piece> white = new ArrayList<>(){
            {
                add(new Bishop(false, dim, 1));
                add(new Bishop(false, dim, -1));

                add(new King(false, dim));
                add(new Queen(false, dim));

                add(new Knight());
                add(new Knight());

                add(new Rook(false, dim, 1));
                add(new Rook(false, dim, -1));

                for(int i = 0; i < 8; i++) add(new Pawn(false, dim));

            }
        };
        this.white = white;
        this.dim = dim;
        this.orientator = orientator;
        this.turn = false;
    }


    public String print(){



        return "";
    }

    public boolean isAvailable(Location location){
        return false;
    }

    public static class Dimension {
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
