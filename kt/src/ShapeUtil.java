import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    /**
     * print info.
     *
     * @param shapes shapes
     * @return string
     */
    public String printInfo(List<GeometricObject> shapes) {
        String s = "";
        s = s + "Circle:\n";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                s = s + shapes.get(i).getInfo() + "\n";
            }
        }
        s = s + "Triangle:\n";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                s = s + shapes.get(i).getInfo() + "\n";
            }
        }
        return s;
    }
}
