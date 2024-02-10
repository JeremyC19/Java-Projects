public class ShapeArray {
    public static void main(String [] args) {
        Cone cone = new Cone(10.0,10.0);

        Cylinder cylinder = new Cylinder(10.0, 10.0);

        Sphere sphere = new Sphere(10.0);

       Shape [] ShapeArray = new Shape[3];
       ShapeArray[0] = cone;
       ShapeArray[1] = cylinder;
       ShapeArray[2] = sphere;


       for(int i = 0; i<=ShapeArray.length - 1; i++) {
           System.out.println(ShapeArray[i]);
        }
    }
}
