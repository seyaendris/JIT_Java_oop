
interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    double width, height;
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    public double getArea() {
        return width * height;
    }
}

class Circle implements Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Test {
    public static void main(String[] args) {
        Shape s = new Rectangle(3, 4);
        System.out.println("Area of rectangle: " + s.getArea());
        s = new Circle(5);
        System.out.println("Area of circle: " + s.getArea());
    }
}