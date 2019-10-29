//https://mail.google.com/mail/u/0/#search/daily+coding+problem/FMfcgxwDrlbPgWKtsPdGHtfDhPzBCnGc
//https://leetcode.com/problems/sliding-window-maximum/
import java.util.*;
public class SlidingWindowMaxium {
    public static void main(String [] args){
        int [] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int [] nums = maxSlidingWindow(arr, k);
        for(int n: nums){
            System.out.println(n);
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(nums.length == 0 || nums == null){
            return nums;
        }
        int slow= -1;
        int currIndex = -1;
        for(int i = k - 1; i < nums.length; i++){
            currIndex++;
            slow = currIndex;
            int max = Integer.MIN_VALUE;
            while(slow <= i){
                if(nums[slow] > max){
                    max = nums[slow];
                }
                slow++;
            }
            list.add(max);
        }
        int [] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
