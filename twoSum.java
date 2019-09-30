import java.util.*;
public class twoSum{
    public static void main(String [] args){
        int [] arr = new int[]{10, 15, 3, 7};
        System.out.println(hasTwoSum(arr, 17)); //true
        System.out.println(hasTwoSum(arr, 18)); //true
        System.out.println(hasTwoSum(arr, 25)); // true
        System.out.println(hasTwoSum(arr, 11)); //false
        System.out.println(hasTwoSum(arr, 19)); //false
        System.out.println(hasTwoSum(arr, 26)); //false
      
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