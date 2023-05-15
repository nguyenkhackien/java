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
        return Math.sqrt((this.pointX - point.getPointX()) * (this.pointX - point.getPointX())
                + (this.pointY - point.getPointY()) * (this.pointY - point.getPointY()));
    }

    public boolean same(Point point) {
        return (this.pointX == point.getPointX() && this.pointY == point.getPointY());
    }
}
