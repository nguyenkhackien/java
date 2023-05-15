public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * khoi tao.
     *
     * @param p1 p1
     * @param p2 p2
     * @param p3 p3
     */

    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        if (a + b == c || a + c == b || b + c == a || a == 0 || b == 0 || c == 0) {
            throw new RuntimeException();
        }
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public Point getP3() {
        return this.p3;
    }

    @Override
    public double getPerimeter() {
        double edge1 = p1.distance(p2);
        double edge2 = p2.distance(p3);
        double edge3 = p3.distance(p1);
        return (edge1 + edge3 + edge2);
    }

    @Override
    public double getArea() {
        double area = (Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY()))) / 2;
        return area;
    }

    @Override
    public String getInfo() {
        return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
                p1.getPointX(), p1.getPointY(), p2.getPointX(), p2.getPointY(),
                p3.getPointX(), p3.getPointY());
    }
}
