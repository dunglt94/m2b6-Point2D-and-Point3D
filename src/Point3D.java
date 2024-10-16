public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public Float[] getXYZ() {
        Float[] xyz = new Float[3];
        xyz[0] = super.getX();
        xyz[1] = super.getY();
        xyz[2] = this.z;
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" + super.getX() + ", " + super.getY() + ", " + this.z + "}";
    }
}
