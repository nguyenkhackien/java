public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return String.format("Square[topLeft=" + this.topLeft.toString()
                + ",side=%.1f,color=%s,filled="
                + this.filled + "]", this.width, this.color);
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
