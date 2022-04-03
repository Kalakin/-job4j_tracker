package oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point2 {

    private int x;

    private int y;

    private int z;

    public Point2(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point2(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point2 that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println("Point2[" + this.x + ", " + this.y + "]");
    }

    public double distance3d(Point2 that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

}