import geometry.*;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(0, 0);
        double radius = 20.0;
        String color = "Czerwony";

        ColoredCircle coloredCircle = new ColoredCircle(center, radius, color);

        System.out.println("Kolor kola: " + coloredCircle.getColor());
        System.out.println("Promień kola: " + coloredCircle.getRadius());
        System.out.println("Obwód kola: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole kola: " + coloredCircle.getArea());
    }
}