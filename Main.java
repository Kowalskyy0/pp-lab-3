import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 20);

        System.out.println("Center: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}