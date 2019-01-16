package shapes;

import main.InvalidShapeStringException;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    public static Shape parseShape(String str) throws InvalidShapeStringException {
        int p1 = str.indexOf(':');
        if (p1==-1) throw new InvalidShapeStringException("Wrong shape string: " + str);
        int p2 = str.lastIndexOf(':');
        if (p2==p1) throw new InvalidShapeStringException("Wrong shape string: " + str);
        String type = str.substring(0, p1);
        String color = str.substring(p1+1, p2);
        try {
            if (type.equals("RECTANGLE")) {
                String tail = str.substring(p2 + 1);
                int p = tail.indexOf(',');
                String s1 = tail.substring(0, p);
                String s2 = tail.substring(p + 1);
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                return new Rectangle(a, b, color);
            }
            if (type.equals("CIRCLE")) {
                String tail = str.substring(p2 + 1);
                int diameter = Integer.parseInt(tail);
                return new Circle(diameter, color);
            }
            throw new InvalidShapeStringException("Wrong shape string: " + str);
        } catch (NumberFormatException ex) {
            throw new InvalidShapeStringException("Wrong shape string: " + str);
        }
    }
}
