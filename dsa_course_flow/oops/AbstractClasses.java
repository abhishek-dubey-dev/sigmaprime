package oops;

public class AbstractClasses {
    public static abstract class Shape {
        abstract double area();
    }

    public static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    public static class Rectangle extends Shape {
        double length, width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        // Abstract class cannot be instantiated
        // Shape shape = new Shape(); // This will give a compilation error

        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
