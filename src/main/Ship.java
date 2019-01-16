package main;

public class Ship {
    private int x = 10;
    void doJob() {
        var y = 10;
        class LocalClass {
            public void test() {
                x = 20;
                System.out.println(x + " " + y);
            }
        }

    }
}
