
// import java.utils.*;

public class SingleNumber {

    // 136. Single number problem
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int res = 0;
        for ( int i : arr) {
            res^=i;
        }
        System.out.println(res);
    }
}
