package tugasmateri;
class Shape {
    public double getLuas() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getLuas() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getLuas() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getLuas() {
        return 0.5 * base * height;
    }
}

class Main {
    public static void main(String[] args) {
        Shape lingkaran = new Circle(5.0);
        Shape persegiPanjang = new Rectangle(4.0, 6.0);
        Shape segitiga = new Triangle(3.0, 8.0);

        printLuas(lingkaran);
        printLuas(persegiPanjang);
        printLuas(segitiga);

        System.out.println("Luas Lingkaran: " + getLuasAsString(lingkaran));
        System.out.println("Luas Persegi Panjang: " + getLuasAsString(persegiPanjang));
        System.out.println("Luas Segitiga: " + getLuasAsString(segitiga));

        Shape[] shapes = {new Circle(3.0), new Rectangle(5.0, 4.0), new Triangle(6.0, 2.0)};
        for (Shape shape : shapes) {
            System.out.println("Luas: " + shape.getLuas());
        }

        try {
        } catch (ClassCastException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void printLuas(Shape shape) {
        System.out.println("Luas: " + shape.getLuas());
    }

    public static String getLuasAsString(Shape shape) {
        return String.valueOf(shape.getLuas());
    }
}

