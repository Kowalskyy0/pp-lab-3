import geometry.*;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[] {
                new Circle(new Point(0, 0), 1),
                new ColoredCircle(new Point(1, 1), 2, "Czerwony"),
                new Circle(new Point(2, 2), 3),
                new ColoredCircle(new Point(3, 3), 4, "Niebieski")
        };

        for (Circle circle : circles) {
            System.out.println("Area: " + circle.calculateArea());
            if (circle instanceof ColoredCircle) {
                System.out.println("Color: " + ((ColoredCircle) circle).getColor());
            }
        }
    }
}