package Abstraction;

public class ShapesMain {
    public static void main(String[] args) {
        Shape triangle = new Triangle(7,9);
        System.out.println(triangle.area());

        Shape rectangle = new Rectangle(25,12);
        System.out.println(rectangle.area());
    }
}
