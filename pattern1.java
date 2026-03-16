public class pattern1 {

    public static void drawpattern(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1 || i==j || i+j==n-1)
                System.out.print("*   ");
                else System.out.print("    ");
            }
            System.out.println("\n");
        }

    }
    public static void main(String a[]){
        drawpattern(9);
    }
}
