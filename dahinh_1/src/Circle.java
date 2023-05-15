public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * khởi tạo.
     *
     * @param center center
     * @param radius radius
     * @param color  color
     * @param filled filler
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[center=" + this.center.toString()
                + ",radius=%.1f,color=%s,filled="
                + this.filled + "]", this.radius, this.color);
    }

    /**
     * phương thức so sánh 2 điểm.
     *
     * @param obj obj
     * @return true or false
     */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point temp = (Point) obj;
            if (Math.abs(this.center.getPointX() - temp.getPointX()) <= 0.001
                    && Math.abs(this.center.getPointY() - temp.getPointY()) <= 0.001) {
                return true;
            }
        }
        return false;
    }
}
