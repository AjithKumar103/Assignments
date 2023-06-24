package Abstraction;

public abstract class Shape {
    abstract double area();
}
class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    public double area(){
        return (height * base) / 2;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length * width;
    }
}
