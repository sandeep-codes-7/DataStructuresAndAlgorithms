import java.util.Arrays;

public class TripletSum{
    /*
        Triplet Sum from geeks for geeks
        similar to ThreeSum from Leetcode.

        given: arr[] = [1, 4, 45, 6, 10, 8], target = 13
        expected output: true

        we need to find a triplet whose sum is equal to the target number. and if exist, we need to return true else false.
        here, the order is not necessary, so we can sort the array and apply two pointer approach.

    */

    public static boolean tripletSum(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = arr[i]+arr[l]+arr[r];
                if(sum == target) return true;
                else if(sum > target) r--;
                else l++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 45, 6, 10, 8};
        boolean res = tripletSum(nums, 13);
        System.out.println(res);
    }
}