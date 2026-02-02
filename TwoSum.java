// import java.util.ArrayList;
public class TwoSum{

    public int[] twosum(int[] nums, int target){
        // ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                sum = nums[i]+nums[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        // int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        // return arr;
        return new int[0];
    }
    public static void main(String[] args) {
        int a[] = {2,7,11,15};
        TwoSum obj = new TwoSum();
        
        int[] res = obj.twosum(a, 3);
        
        for(int k = 0;k<res.length;k++){
            System.out.println(k);
        }
    }
}