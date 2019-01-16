package shapes;

public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double calcArea() {
        return a*b;
    }
}
