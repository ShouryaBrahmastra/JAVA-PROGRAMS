abstract class Shape {
    abstract void calculateArea();

    abstract void display();
}

class Rectangle extends Shape {
    int length, breadth, area;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = 0;
    }

    void calculateArea() {
        area = length * breadth;
    }

    void display() {
        System.out.println("The area of the rectangle with sides " + length + " and " + breadth + " is " + area);
    }
}

class Triangle extends Shape {
    int base, height;
    double area;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
        this.area = 0;
    }

    void calculateArea() {
        area = 0.5 * base * height;
    }

    void display() {
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is " + area);
    }
}

class TSHAPE {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(8, 10);
        Triangle t = new Triangle(3, 10);
        r.calculateArea();
        r.display();
        t.calculateArea();
        t.display();
    }
}