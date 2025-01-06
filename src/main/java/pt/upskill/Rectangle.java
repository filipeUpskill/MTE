package pt.upskill;

import java.awt.*;

public class Rectangle {
public Point UpperLeft;
public Point BottomRight;

    public Rectangle(Point upperLeft, Point bottomRight) {
        this.UpperLeft = upperLeft;
        this.BottomRight = bottomRight;
    }

        public Point getUpperLeft () {
            return this.UpperLeft;
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
    }

