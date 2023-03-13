package QuickSort;

import BubbleSort.BubbleSort;

import java.util.Arrays;

public class QuickSortRunner {

    public static void main(String[] args) {

        int arr[] = {3,5,4};
        System.out.println("QuickSort islemi oncesi array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("**************************************************");
        System.out.println("QuickSort islemi sonrasi: ");
        QuickSort.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println("**************************************************");

    }

}
