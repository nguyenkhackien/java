public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return this.pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return this.pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point point) {
        return Math.sqrt(this.pointX * this.pointX + this.pointY * this.pointY);
    }

    /**
     * equal.
     * @param obj obj
     * @return true or false
     */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point temp = (Point) obj;
            return temp.equals(this);
        }
        return false;
    }

    public String toString() {
        return String.format("(%.1f,%.1f)", this.pointX, this.pointY);
    }
}
