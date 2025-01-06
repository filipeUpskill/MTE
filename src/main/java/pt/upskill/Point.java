package pt.upskill;

public class Point {
    public int xAxis;
    public int yAxis;
    public Point(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public int getxAxis() {
        return xAxis;
    }
    public int getyAxis() {
        return yAxis;
    }
    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }
    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    @Override
    public String toString() {
        return "Point [xAxis=" + xAxis + ", yAxis=" + yAxis + "]";
    }
    
}
