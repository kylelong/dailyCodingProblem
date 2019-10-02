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
    public static int [] sumArray(int [] a){
      int [] b = new int[a.length];
      b[0] = 1;
      for(int i = 1; i < a.length; i++){
          b[i] = b[i - 1] * a[i - 1];
      }
      int num = 1;
      for(int i = a.length - 1; i>= 0; i--){
          b[i] *= num;
          num *= a[i];
      }
      return b;
       
    }

}