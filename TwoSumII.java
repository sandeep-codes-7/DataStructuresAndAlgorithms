public class TwoSumII {
    /*

    # leetcode 167
    - given a sorted Array nums={2,7,11,15} target=9
    - need to find the positions of pairs that sums up to the target

    Since the array is sorted and the question asked us to find a specific pair that sums up to the target.
    we are going to use twopointer approach to solve this problem.

     */

    public static int[] twoSum(int nums[], int target){
        int l=0;
        int r = nums.length-1;
        while(l<r){
            int sum = nums[l]+nums[r];
            if(sum == target) return new int[] {l+1,r+1};
            else if(sum>target) r--;
            else l++;
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int[] res = twoSum(nums, 9);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
