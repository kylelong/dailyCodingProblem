/**
Given an array of integers, return a new array such that each element at index i 
of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */
 import java.util.*;
public class sumArrayExceptSelf{

    public static void main(String [] args){
        int [] arr = new int[]{1, 2, 3, 4, 5};
       System.out.println(Arrays.toString(sumArray(arr)));
       System.out.println(Arrays.toString(sumArray(new int[]{3, 2, 1})));
    }
    /**
    Returns array of that i is product of everythign but i itself
     */
    public static int [] sumArray(int [] arr){

        int [] ans = new int[arr.length];
        int num = 1;
        ans[0] = num;
        for(int i = 1; i < arr.length; i++){
            ans[i] = ans[i - 1] * arr[i - 1];
        }
        for(int i = arr.length - 1; i >= 0;  i--){
           ans[i] *= num;
        num *= arr[i];
        }
        return ans;
    }

}