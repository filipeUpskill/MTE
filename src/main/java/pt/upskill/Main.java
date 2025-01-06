package pt.upskill;

import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(4, 5);
        Point p4 = new Point(12,0);
        Point p5 = new Point(5,9);
        Point p6 = new Point(0,12);


        Circle c1 = new Circle(p1,12);
        Circle c2 = new Circle(p2,5);
        Circle c3 = new Circle(p3,7);

        Rectangle r1 = new Rectangle(p6,p2);
        Rectangle r2 = new Rectangle(p5,p2);
        Rectangle r3 = new Rectangle(p6,p4);


    }
}