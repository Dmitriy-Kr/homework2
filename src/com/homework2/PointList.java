package com.homework2;

public class PointList {
    private Point[] points;
    private int size;

    public PointList() {
        points = new Point[5];
        size = 0;
    }

    int size(){
        return size;
    }

    void add(Point p) {
        if (size == points.length) {
            Point[] newPoints = new Point[points.length + 5];
            for (int i = 0; i < points.length; i++) {
                newPoints[i] = points[i];
            }
            points = newPoints;
        }
        points[size++] = p;
    }

    Point get(int index) {
        return points[index];
    }
}
