package org.math;

public class Location {
    public int[] coords;

    public Location(int x, int y, int z){
        this.coords = new int[3];

        this.coords[0] = x;
        this.coords[1] = y;
        this.coords[2] = z;
    }
}
