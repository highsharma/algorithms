package algorithms.sort;

import java.util.Arrays;

public class QuickSort2 {

    public static void sort(int arr[], int min, int max) {
        if(max-min<=1) {
            return;
        } else {
            int pivot = arr[min];
            int lower = min;
            int higher = max;
            while(higher > lower) {
                do {
                    lower++;
                } while(lower<max && pivot>arr[lower] );
                do {
                    higher--;
                }while(pivot<arr[higher]);
                if(lower<higher) {
                    int temp = arr[higher];
                    arr[higher] = arr[lower];
                    arr[lower] = temp;
                }
            }
            int temp = pivot;
            arr[min] = arr[higher];
            arr[higher] = temp;
            sort(arr,min,higher);
            sort(arr,higher+1,max);
        }
    }

    public static void main(String args[]) {
        int arr[] = new int[] {2,1,9,6,5,3};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
