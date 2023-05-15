import java.util.*;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>() ;
        int sum = 0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        for(int i=0;i<s.length();i++){
            sum+=map.get(s.charAt(i));
        }
        return sum;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        System.out.println(map.get(target-nums[0]));
        for(int i=0;i<nums.length;i++){
            if( map.containsKey( target-nums[i] ) ){
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        String s ="MCMXCIV";
        System.out.println(solution.romanToInt(s));
        System.out.println(s);
        int[] a = {2,7,11,15};
        int[] result = solution.twoSum(a,9);
        System.out.println(result);
    }
}
