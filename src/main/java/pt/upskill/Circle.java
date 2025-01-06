package pt.upskill;

import java.awt.*;

public class Circle {

    private Point CenterPoint;
    private double Radius;


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
        return 6.28 * this.Radius;
    }

    public double area() {
        return Math.PI * this.Radius * this.Radius;
    }
}