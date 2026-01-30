public class MaxCountOfPositiveAndNegatives {
    //2529. max count of positives and negatives in an array
    public static int maxCount(int array[]){
        int pos=0,neg=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>0)pos++;
            else neg++;
        }
        if(pos>neg)return pos;
        else return neg;
        //return 0;
    }


    public static void main(String[] args) {
        int a[] = {-1,-1,-2,4,2,70,89};
        System.out.println(maxCount(a));
    }
}
