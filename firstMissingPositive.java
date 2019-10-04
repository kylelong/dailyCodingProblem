import java.util.*;
class firstMissingPositive {
    public static void main(String [] args){
        int [] nums = new int[]{1,2,0};
        System.out.println(firstMissingPositive(nums)); //3
        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));  //2
        System.out.println(firstMissingPositive(new int[]{7,8,9,11,12}));  //1
        System.out.println(firstMissingPositive(new int[]{-1, -2})); //1

    }
    public static int firstMissingPositive(int[] nums) {
        if(nums.length == 1 && nums[0] != 1) return 1;
        Arrays.sort(nums);
        int ans = 0;
        int end = Integer.MAX_VALUE;
        for(int i = 1; i < end; i++){
            if(binarySearch(nums, i) == -1){
                ans = i;
                return ans;
            }
        }
        return ans;
    }
 public static int binarySearch(int [] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while(low <= high){
            mid = low + ((high - low) / 2);
            if(target < arr[mid]){
                high = mid - 1;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}