import java.util.*;
public class twoSum{
    public static void main(String [] args){
        int [] arr = new int[]{3, 2, 4};
        int [] sum = twoSum(arr, 6);
        for(int s: sum){
            System.out.println(s);
        }
        System.out.println(hasTwoSum(arr, 17)); //true
        System.out.println(hasTwoSum(arr, 18)); //true
        System.out.println(hasTwoSum(arr, 25)); // true
        System.out.println(hasTwoSum(arr, 11)); //false
        System.out.println(hasTwoSum(arr, 19)); //false
        System.out.println(hasTwoSum(arr, 26)); //false
      
    }
    public static int[] twoSum(int[] nums, int target) {
          HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
          int a = 0; int b = 0;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
            if(map.containsKey(target - nums[i])){
                if(i != map.get(target - nums[i])){
                    a = map.get(target - nums[i]);
                    b = i;
                return new int[]{map.get(target - nums[i]), i };
                }
            }
        }
        return new int[]{a, b};
    }
    public static boolean hasTwoSum (int [] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], i);
            if(map.containsKey(target - arr[i])){
                return true; //indices i, map.get(target - arr[i])
            }
        }
        return false;
    }
}