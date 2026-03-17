import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    /*

    #15. 3Sum from leetcode:

    given an un-sorted array nums={-1,0,1,2,-1,-4}.
    we need to find triplets whose sum is 0 (Zero).
    we should not return duplicate triplets.

    approach:

    since there is no restriction for the order of data.
    let's sort the array fist.
    now, it's a sorted array and we need to find specific positions or numbers that sums up to the Zero!

    we will be using two pointer approach for this.


     */

    public static List<List<Integer>> ThreeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i+1]) continue;
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }
                else if(sum > 0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
     int[] nums = {-1,0,1,2,-1,-4};
     List<List<Integer>> res = ThreeSum(nums);
     // iterate res to get solution!
    }

}
