// Import your library
// Do not change the name of the Solution class
public class Solution {
    /**
     * phuong thuc tinh day so fibonacci.
     *
     * @param n tinh so fibonacci thu n
     * @return gia tri fibonacci thu n
     */
    public static long fibonacci(long n) {
        long[] arr = new long[100];
        if (n < 0) {
            return -1;
        } else {
            for (int i = 0; i <= n; i++) {
                if (i == 0 || i == 1) {
                    arr[i] = i;
                } else {
                    arr[i] = arr[i - 1] + arr[i - 2];
                }
                if (arr[i] < 0) {
                    return Long.MAX_VALUE;
                }
            }
        }
        return arr[(int) n];
    }
}