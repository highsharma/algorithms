package algorithms.search;

public class BinarySearch {
    public static int binarySearch(int arr[], int elem, int start, int end){
        if(start == end) {
            if(arr[start] == elem){
                return start;
            }else {
                return -1;
            }
        }else {
            int mid = (start+end)/2;
            if(elem == arr[mid]) {
                return mid;
            } else if(elem < arr[mid]) {
                return binarySearch(arr,elem,start, mid-1);
            } else {
                return binarySearch(arr,elem,mid+1,end);
            }
        }
    }

    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr,7,0, arr.length-1));

    }

}
