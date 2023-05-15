public class Cylinder extends Circle {
    private double height = 1;
    protected static final double PI = 3.14;

    /**
     * phương thức khởi tạo.
     */
    public Cylinder() {
    }

    public Cylinder(double radius) {
        this.setRadius(radius);
    }

    public Cylinder(double radius, double height) {
        this.setRadius(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * tính thể tích.
     *
     * @return thể tích
     */
    public double getVolume() {

        return this.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + this.height + "]";
    }

    @Override
    public double getArea() {
        return Cylinder.PI * this.getRadius() * this.getRadius();
    }
}
