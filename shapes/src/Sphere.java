public class Sphere extends Shape {
    double radius;

    Sphere(double rad) {
        radius = rad;
    }

    double surface_area() {
        return 4 * 3.14 * (radius * radius);
    }

    double volume() {
        return 1.333 * 3.14 * (radius * radius);
    }

    public String toString() {
        String str = "";
        str = str + "Surface Area of Sphere: " + surface_area() + "\n";
        str = str + "Volume of Sphere: " + volume() + "\n";
        return str;
    }
}
