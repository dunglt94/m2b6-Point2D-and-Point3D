import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Point2D");
        Point2D point1 = new Point2D(10, 5);
        System.out.println(point1);
        point1.setXY(5, 10);
        System.out.println(Arrays.toString(point1.getXY()));
        System.out.println(point1);

        System.out.println("Point3D");
        Point3D point2 = new Point3D(7, 4, 9);
        System.out.println(point2);
        point2.setXYZ(5, 10, 15);
        System.out.println(Arrays.toString(point2.getXYZ()));
        System.out.println(point2);
    }
}
