import java.util.HashSet;

public class FindSubArraysWithEqualSum {

    
    public static Boolean hasSubarrays(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length-1;i++){
            int sum = arr[i]+arr[i+1];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println(hasSubarrays(a));
    }
}
