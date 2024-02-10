public class Cylinder extends Shape {
    double radius;
    double height;

    Cylinder(double rad, double ht) {
        radius = rad;
        height = ht;
    }

    double surface_area() {
        return 2 * 3.14 * radius * height + (2 * 3.14) * (radius * radius);
    }

    double volume() {
        return 3.14 * (radius * radius) * height;
    }

    public String toString() {
        String str = "";
        str = str + "Surface Area of Cylinder: " + surface_area() + "\n";
        str = str + "Volume of Cylinder: " + volume() + "\n";
        return str;
    }
}
