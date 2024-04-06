import geometry.Rectangle;

class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwod prostokata: " + rectangle.calculatePerimeter());
    }
}
