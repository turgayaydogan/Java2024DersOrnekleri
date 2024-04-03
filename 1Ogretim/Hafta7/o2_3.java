public class o2_3 {
    public static void main(String[] args) {
        int[] sayilar = { 5, 4, 3, 9, 10, 15 };
        int eks,eksIndex;
        eks = sayilar[0];
        eksIndex = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < eks){
                eks = sayilar[i];
                eksIndex = i;
            }
        }
        System.out.println("En küçük Eleman index değeri "+eksIndex+" olan = "+eks);
    }
}
