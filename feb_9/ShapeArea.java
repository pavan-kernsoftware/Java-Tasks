package feb_9;

interface Shape {
    double calculateArea();
}
class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Square implements Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    public double calculateArea() {
        return side * side;
    }
}
public class ShapeArea {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
    }
}
