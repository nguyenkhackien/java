import java.util.Collections;
import java.util.List;

public class Week11 {
    /**
     * ham sap xep.
     *
     * @param arr tham so arr
     * @param <K> generic
     * @return List
     */
    public static <K extends Comparable<K>> List<K> sortGeneric(List<K> arr) {
        List<K> list = arr;
        Collections.sort(list);
        return list;
    }
}
