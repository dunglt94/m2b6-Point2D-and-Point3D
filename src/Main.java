import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(3, 5);
        System.out.println(point1);
        System.out.println(Arrays.toString(point1.getXY()));

        Point3D point2 = new Point3D(7, 4, 9);
        System.out.println(point2);
        System.out.println(Arrays.toString(point2.getXYZ()));
    }
}
