import java.util.Scanner;

public class InfyProblem1 {
    public static void main(String[] args) {
        int n;
        int q;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        n = sc.nextInt();
        // System.out.println(n);
        int[] A = new int[n];
        for(int i = 0;i<n;i++){
            A[i] = sc.nextInt();
        }

        System.out.print("enter q: ");
        q = sc.nextInt();
        // System.out.println(n);
        System.out.println("enter queries: ");
        int[][] queries = new int[q][3];
        for(int i = 0;i<q;i++){
           for(int j=0;j<3;j++){
            queries[i][j] = sc.nextInt();
           }
        }

        int sum = 0;
        for(int i = 0;i<n;i++){
            
        }





        sc.close();
    }
}
