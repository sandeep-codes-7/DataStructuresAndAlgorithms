// import java.util.ArrayList;

public class PlusOne {
    public static int[] plusone(int a[]){
        return a;
    }

    public static void main(String[] args) {
        int some[] = {1,2,3};
        //System.out.println(some[some.length-1]%10 == some[some.length-1]);
        int[] res = plusone(some);
        for (int i = 0; i < res.length; i++) {
            System.out.print(i);
        }
    }
}
