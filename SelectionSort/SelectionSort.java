package SelectionSort;

public class SelectionSort {

    public static void selectionSort(int arr[]){

        //int count = 0;

        int min; // Saginda kalan sayilarin en kucugunun index'ini tutacagiz.

        for(int i = 0; i<arr.length; i++){
            min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
                //count++;
            }
            // swap islemi
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        //System.out.println("Count: " + count);

    }

}
