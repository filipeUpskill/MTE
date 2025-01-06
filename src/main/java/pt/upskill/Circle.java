package pt.upskill;

import java.awt.*;

public class Circle {

    private Point CenterPoint;
    private double Radius;
    private static final double PI = 3.14;


public Circle(Point CenterPoint, double Radius) {
    this.CenterPoint = CenterPoint;
    this.Radius = Radius;
}
public Point getCenterPoint() {
    return CenterPoint;
}
public void setCenterPoint(Point CenterPoint) {
    this.CenterPoint = CenterPoint;
}
public double getRadius() {
    return Radius;
}
public void setRadius(double Radius) {
    this.Radius = Radius;
}

    public double perimetro() {
    return 2 * PI * this.Radius;
}
}