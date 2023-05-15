import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * getinfo.
     *
     * @return info
     */
    public String getInfo() {
        String s = "Layer of crazy shapes:\n";
        for (int i = 0; i < shapes.size(); i++) {
            s = s + shapes.get(i).toString() + "\n";
        }
        return s;
    }

    /**
     * remove circle.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
                i = i - 1;
            }
        }
    }

    /**
     * xóa các hình trùng nhau.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                Shape temp1 = shapes.get(i);
                Shape temp2 = shapes.get(j);
                if (temp1 instanceof Circle && temp2 instanceof Circle
                        && ((Circle) temp1).getRadius() == ((Circle) temp2).getRadius()
                        && temp1.equals(((Circle) temp2).getCenter())) {
                    shapes.remove(j);
                    j--;
                }
                if (temp1 instanceof Rectangle && temp2 instanceof Rectangle
                        && ((Rectangle) temp1).getWidth() == ((Rectangle) temp2).getWidth()
                        && ((Rectangle) temp1).getLength() == ((Rectangle) temp2).getLength()
                        && temp1.equals(((Rectangle) temp2).getTopLeft())) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }
//    public static void main(String[] args) {
//        Layer layer = new Layer();
//        Point center1 = new Point(1, 2);
//        Point center2 = new Point(2, 3);
//        Point center3 = new Point(2.01,3);
//        Point topledt1 = new Point(2, 4);
//        Point topleft2 = new Point(2, 3);
//
//        Circle circle1 = new Circle(4.0, "RED", true);
//        circle1.setCenter(center2);
//        Circle circle2 = new Circle(2, "YELLOW", false);
//        circle2.setCenter(center2);
//        Circle circle3 = new Circle(4.0, "RED", true);
//        circle3.setCenter(center3);
//        Rectangle rectangle1 = new Rectangle(3, 2, "red", true);
//        Rectangle rectangle2 = new Rectangle(3, 2, "red", false);
//        Rectangle rectangle3 = new Rectangle(4, 2, "red", true);
//        rectangle1.setTopLeft(topledt1);
//        rectangle2.setTopLeft(topledt1);
//        rectangle3.setTopLeft(topleft2);
//        layer.addShape(circle1);
//        layer.addShape(circle2);
//        layer.addShape(circle3);
//        layer.addShape(rectangle1);
//        layer.addShape(rectangle2);
//        layer.addShape(rectangle3);
//        layer.removeDuplicates();
//        System.out.println(layer.getInfo());
//    }
}
