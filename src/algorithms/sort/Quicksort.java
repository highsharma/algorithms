package algorithms.sort;

import java.util.Arrays;

public class Quicksort {
    public static void sort(int[] arr, int min, int max){
        if(max-min<=1){
            return;
        }
        int pivot = arr[min];
        int lower = min+1;
        int higher = min+1;
        for(int i = min+1; i<max; i++){
            if(arr[i] < pivot) {
                int temp = arr[lower];
                arr[lower] = arr[i];
                arr[i] = temp;
                higher++;
                lower++;
            }
            else {
                higher++;
            }

        }
        int temp = pivot;
        arr[min] = arr[lower-1];
        arr[lower-1] = temp;
        lower = lower-1;
        sort(arr,min,lower);
        sort(arr,lower+1,higher);

    }

    public static void main(String args[]) {
        int arr[] = new int[] {2,1,9,6,5,3};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
