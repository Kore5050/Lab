package lab;

// abstract class for a shape
abstract class Shape {
    abstract void calculateArea(); // abstract method to calculate area
}

// subclass Circle, inherits from Shape
class Circle extends Shape {
    int radius; // instance variable for radius

    // constructor for Circle
    Circle(int radius) {
        this.radius = radius;
    }

    // implementation of calculateArea method for Circle
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is: " + area); // print out the area of the circle
    }
}

// subclass Rectangle, inherits from Shape
class Rectanglee extends Shape {
    int length, width; // instance variables for length and width

    // constructor for Rectangle
    Rectanglee(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // implementation of calculateArea method for Rectangle
    @Override
    void calculateArea() {
        int area = length * width;
        System.out.println("Area of rectangle is: " + area); // print out the area of the rectangle
    }
}

// main class to demonstrate the use of the Shape, Circle, and Rectangle classes
public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5); // create a new Circle object with radius 5
        circle.calculateArea(); // call the calculateArea method on the Circle object

        Rectanglee rectangle = new Rectanglee(4, 6); // create a new Rectangle object with length 4 and width 6
        rectangle.calculateArea(); // call the calculateArea method on the Rectangle object
    }
}