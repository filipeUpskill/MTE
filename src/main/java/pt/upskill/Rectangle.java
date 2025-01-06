package pt.upskill;

import java.awt.*;

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
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
        this.Lado3 = Lado3;
        this.Lado4 = Lado4;
    }

        public Point getUpperLeft () {
            return this.UpperLeft;
        }

    public double getLado1() {
        return Lado1;
    }

    public void setLado1(double lado1) {
        Lado1 = lado1;
    }

    public double getLado2() {
        return Lado2;
    }

    public void setLado2(double lado2) {
        Lado2 = lado2;
    }

    public double getLado3() {
        return Lado3;
    }

    public void setLado3(double lado3) {
        Lado3 = lado3;
    }

    public double getLado4() {
        return Lado4;
    }

    public void setLado4(double lado4) {
        Lado4 = lado4;
    }

    public void setUpperLeft (Point upperLeft){
            this.UpperLeft = upperLeft;
        }

        public Point getBottomRight () {
            return this.BottomRight;
        }

        public void setBottomRight (Point bottomRight){
            this.BottomRight = bottomRight;
        }

        public double perimetro() {
        return this.Lado1 + this.Lado2 + this.Lado3 + this.Lado4;
        }

        public double area() {
        return this.Lado1 * this.Lado2;
        }

    public String toString() {
        return String.format("O perimetro do retângulo: %.2f", perimetro());
    }
    }

