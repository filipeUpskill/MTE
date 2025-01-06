package pt.upskill;

import java.awt.*;

import static java.lang.Math.abs;

public class Rectangle {
    public Point UpperLeft;
    public Point BottomRight;
    public double Lado1;
    public double Lado2;
    public double Lado3;
    public double Lado4;

    public Rectangle(Point upperLeft, Point bottomRight) {
        this.UpperLeft = upperLeft;
        this.BottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return this.UpperLeft;
    }

    public Point getBottomRight() {
        return this.BottomRight;
    }

    public void setUpperLeft(Point upperLeft) {
        this.UpperLeft = upperLeft;
    }

    public void setBottomRight(Point bottomRight) {
        this.BottomRight = bottomRight;
    }

    public double perimetro() {
        return calcularAltura()*2 + calcularLargura() * 2;
    }

    public double area() {
        return calcularAltura()*calcularLargura();
    }

    public String toString() {
        return String.format("O perimetro do retângulo: %.2f", perimetro());
    }

    public double calcularAltura() {
        return abs(this.getBottomRight().getxAxis() - this.getUpperLeft().getxAxis());
    }
    public double calcularLargura() {
        return abs(this.getBottomRight().getyAxis() - this.getUpperLeft().getyAxis());
    }


}

