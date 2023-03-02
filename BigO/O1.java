package BigO;

public class O1 {  // O(1) -- Constant Complexity (Sabit Karmasiklik)

    // Constant Complexity :  Algoritmaya girilen veri seti ne kadar büyük olursa olsun çalışma
    //                        zamanı ve kullanılan kaynak miktarı sabittir.

    public static void main(String[] args) {

        int[] arr = {10,2,20,40,55,7};
        //Task: Array'in son elemanini ekrana yaziniz.

        System.out.println(arr[arr.length - 1]); // 0(1)

        //Task: Verilen bir sayinin cift olup olmama durumu
        int x = 24;
        System.out.println(x % 2 == 0 ? "Cift" : "Tek"); // O(1)

    }

}
