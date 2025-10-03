package Abstraction;

public class Circle extends Shape {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);           // call parent constructor
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2  * Math.PI * radius;
    }
}
