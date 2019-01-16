package main;

import shapes.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//            Shape s = Shape.parseShape("RECTANGLE:RED:10,15");
//            Shape s2 = Shape.parseShape("CIRCLE:BLUE:10");
//            System.out.println(s.calcArea());
//            System.out.println(s2.calcArea());
//            Shape circle = Shape.parseShape("CIRCLE:RED:10,15");
//            System.out.println(circle.calcArea());
        Main main = new Main();
        main.run();
    }

    private void run() {
        String[] strs = {"one", "two", "three", "four", "five"};
//        Arrays.sort(strs);
        Arrays.sort(strs, (o1, o2) -> o1.length()-o2.length() );
        System.out.println(Arrays.toString(strs));
    }
}
