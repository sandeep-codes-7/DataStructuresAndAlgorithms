public class BinarySearch {
    public static int bsearch(int array[], int key){
// leetcode problem: 704 binary search
        int low = 0;
        int high = array.length;
        while(low<high){
            int mid = (low + (high - low))/2;
            if(array[mid]==key){
                return mid;
            }
            else if(key > array[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,5,10,298,299,400};
        System.out.println("found at index " + bsearch(a, 10));
    }
}
