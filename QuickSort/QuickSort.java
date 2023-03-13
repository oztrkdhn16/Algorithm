package QuickSort;

public class QuickSort {

    // Bu zamana kadar gordugumuz en hizli Sorting Algorihm
    public static int partition(int dizi[], int alt, int ust){

        // Dizinin Son elemanini pivot seciyoruz.
        int pivot = dizi[ust];
        int i = (alt-1);
        //Ilk iterasyondaki yer degistirme islemine uygun hale getiriyoruz.
        //Kucukleri sola, buyukleri saga ayiriyoruz.
        for(int j = alt; j<ust; j++){
            if(dizi[j]<=pivot){
                i++;
                int temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = temp;
            }
        }

        int temp2 = dizi[i+1];
        dizi[i+1] = dizi[ust];
        dizi[ust] = temp2;

        return i+1;

    }

    public static void quickSort(int dizi[], int alt, int ust){

        if (alt<ust){
            int pi = partition(dizi,alt,ust);
            quickSort(dizi, alt, pi-1); // pivatun sol tarafi icin recursive yapida calisiyor.
            quickSort(dizi, pi+1, ust); // pivatun sag tarafi icin recursive yapida calisiyor.
        }

    }


}
