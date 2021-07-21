package com.homework2;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    boolean containsPoint(Point p) {
        return radius >= center.distanceTo(p);
    }
}
