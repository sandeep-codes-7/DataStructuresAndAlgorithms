public class CountNegativesInAnSortedArray {


    public static int count(int a[][],int rows, int cols){

        int counts = 0;
        for(int i = 0;i<rows;i++)
            for(int j = 0;j<cols;j++)
                if(a[i][j]<0)counts++;

        return counts;
    }

    //1351. Count negatives of an sorted array
    public static void main(String[] args) {
        int arr[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int res = count(arr,4 , 4);
        System.out.println(res);
    }
}
