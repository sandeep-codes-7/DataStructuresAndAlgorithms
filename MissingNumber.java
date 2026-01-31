public class MissingNumber {


    //268. Missing number
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int n = arr.length;
        int expected = (n*(n+1))/2;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(expected-sum);
    }
}
