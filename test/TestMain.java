abstract class Shape {
    int radius;
    int height;
    double volume;

    Shape() {

    }

    Shape(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    Shape(int radius) {
        this.radius = radius;
    }

    abstract void volume();

    abstract void total_cost(int weight_per_volume, int price_per_weight);

}

class Sphere extends Shape {
    Sphere(int radius) {
        super(radius);
    }

    void volume() {
        volume = (4 * 3.14 * radius * radius * radius) / 3;
        System.out.println("The volume is" + volume);
    }

    void total_cost(int weight_per_volume, int price_per_weight) {
        System.out.println("Total cost is " + (volume * weight_per_volume * price_per_weight));
    }
}

class Cylinder extends Shape {
    Cylinder(int radius, int height) {
        super(radius, height);
    }

    void volume() {
        volume = (3.14 * radius * radius * height);
        System.out.println("The volume is" + volume);
    }

    void total_cost(int weight_per_volume, int price_per_weight) {
        System.out.println("Total cost is " + (volume * weight_per_volume * price_per_weight));
    }
}

class TestMain {
    public static void main(String[] args) {
        Sphere s = new Sphere(3);
        s.volume();
        s.total_cost(3, 4);
        Cylinder c = new Cylinder(3, 5);
        c.volume();
        c.total_cost(3, 4);
    }
}