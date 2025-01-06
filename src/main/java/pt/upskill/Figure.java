package pt.upskill;

public abstract class Figure {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("A figura é de cor %s", color);
    }

    public abstract double area();

    public abstract double perimetro();

}


