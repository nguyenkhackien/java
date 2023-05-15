public class Rectangle extends Shape {
    protected double width;
    protected double length;

    protected Point topLeft;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * khởi tạo.
     *
     * @param width  chiều rộng
     * @param length chiều dài
     * @param color  màu sắc
     * @param filled fill
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * khởi tạo.
     *
     * @param topLeft topleft
     * @param width   width
     * @param length  length
     * @param color   color
     * @param filled  filled
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[topLeft=" + this.topLeft.toString()
                + ",width=%.1f,length=%.1f,color=%s,filled="
                + this.filled + "]", this.width, this.length, this.color);
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * equal.
     *
     * @param obj obj
     * @return true or false
     */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point temp = (Point) obj;
            if (Math.abs(temp.getPointX() - this.topLeft.getPointX()) <= 0.001
                    && Math.abs(temp.getPointY() - this.topLeft.getPointY()) <= 0.001) {
                return true;
            }
        }
        return false;
    }
}
