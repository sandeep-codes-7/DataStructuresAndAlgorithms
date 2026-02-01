public class SearchInsertPosition {
    //35. search insertion position
    public static int getpos(int arr[], int target){
        int high = arr.length-1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target)return mid;
            else if(target > arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        System.out.println(getpos(arr, 9));
    }
}
