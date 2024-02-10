public class Cone extends Shape {
    double radius;
    double height;

    Cone(double rad, double ht) {
        radius = rad;
        height = ht;
    }

    double surface_area() {
        return 3.14 * (radius * radius) + 3.14 * radius * Math.sqrt((radius * radius) + (height * height));
    }

    double volume() {
        return .333 * 3.14 * (radius * radius) * height;
    }

    public String toString() {
        String str = "";
        str = str + "Surface Area of Cone: " + surface_area() + "\n";
        str = str + "Volume of Cone: " + volume() + "\n";
        return str;
    }
}
