public class SumPairCount {
    /*
    given a sorted array nums={-1,1,5,5,7} target=6
    expected output: 3
    we need to return the count of pairs that are actually sums up the target value.

    problem is from geekforgeeks.
    */

    public static int countPairs(int[] nums, int target){

        int count = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,5,5,7};
        int res = countPairs(nums, 6);
        System.out.println(res);
    }
}
