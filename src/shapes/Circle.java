package shapes;

public class Circle extends Shape {
    private int diameter;

    public Circle(int diameter, String color) {
        super(color);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public double calcArea() {
        return Math.PI*diameter*diameter/4;
    }
}
