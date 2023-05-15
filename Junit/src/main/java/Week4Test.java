import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        Assert.assertEquals(Week4.max2Int(5, 6), 6);
    }

    @Test
    public void testMax2Int2() {
        Assert.assertEquals(Week4.max2Int(10, 2), 10);
    }

    @Test
    public void testMax2Int3() {
        Assert.assertEquals(Week4.max2Int(2, 5), 5);
    }

    @Test
    public void testMax2Int4() {
        Assert.assertEquals(Week4.max2Int(19, 6), 19);
    }

    @Test
    public void testMax2Int5() {
        Assert.assertEquals(Week4.max2Int(42, 34), 42);
    }

    @Test
    public void testMinArray1() {
        int[] a = {2, 5, 7, 32};
        Assert.assertEquals(Week4.minArray(a), 2);
    }

    @Test
    public void testMinArray2() {
        int[] a = {2, 4, 3, 1, 6};
        Assert.assertEquals(Week4.minArray(a), 1);
    }

    @Test
    public void testMinArray3() {
        int[] a = {2, 3, 6, 9, 2, 1};
        Assert.assertEquals(Week4.minArray(a), 1);
    }

    @Test
    public void testMinArray4() {
        int[] a = {2, 1};
        Assert.assertEquals(Week4.minArray(a), 1);
    }

    @Test
    public void testMinArray5() {
        int[] a = {9, 7, 4, 5, 2};
        Assert.assertEquals(Week4.minArray(a), 2);
    }

    @Test
    public void testCalculateBMI1() {
        Assert.assertEquals(Week4.calculateBMI(69, 1.72), "Thừa cân");
    }

    @Test
    public void testCalculateBMI2() {
        Assert.assertEquals(Week4.calculateBMI(70, 1.72), "Thừa cân");
    }

    @Test
    public void testCalculateBMI3() {
        Assert.assertEquals(Week4.calculateBMI(68, 1.72), "Thừa cân");
    }

    @Test
    public void testCalculateBMI4() {
        Assert.assertEquals(Week4.calculateBMI(71, 1.72), "Thừa cân");
    }

    @Test
    public void testCalculateBMI5() {
        Assert.assertEquals(Week4.calculateBMI(72, 1.72), "Thừa cân");
    }
}