import java.util.Collections;
import java.util.List;

public class Week11 {
    /**
     * Sort.
     *
     * @param arr tham so arr
     * @param <T> generic
     * @return List
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
        List<T> list = arr;
        Collections.sort(list);
        return list;
    }
}
