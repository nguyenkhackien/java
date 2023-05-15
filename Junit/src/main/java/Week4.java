import java.lang.Math;
import java.lang.String;
public class Week4 {
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        return Math.max(a, b);
    }

    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public static String calculateBMI(double weight, double height) {
        // Tinh BMI
        double BMI = weight / (height * height);
        BMI = Math.round(BMI * Math.pow(10, 1))/ Math.pow(10, 1);
        if (BMI < 18.5)
            return "Thiếu cân";
        else if (BMI >= 18.5 && BMI < 23) {
            return "Bình thường";
        } else if (BMI >= 23 && BMI < 25) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }

    public static void main(String[] args) {
        Week4 test = new Week4();
        System.out.println(test.calculateBMI(1.72, 69));
        double a=5.423252;
        double b=2.2353511;
        System.out.format(" Nap tien $%.2f. So du luc nay: $%.2f.",a,b);
    }
}
