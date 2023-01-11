
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

interface Printable {
    void print();
}

class PrintableRectangle extends Rectangle implements Printable {
    public PrintableRectangle(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
    }
}

class Test {
    public static void main(String[] args) {
        Shape rectangle = new PrintableRectangle("Rectangle", 10, 20);
        rectangle.getArea();

        Shape circle = new Circle("Circle", 5);
        circle.getArea();

        Printable rectangleP = new PrintableRectangle("Rectangle", 15, 25);
        rectangleP.print();
    }
}