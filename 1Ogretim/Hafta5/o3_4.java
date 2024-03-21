public class o3_4 {
    public static void main(String[] args) {
        int toplam = 0;
        int kalan;

        for (int i = 1; i <= 100; i++) {
            toplam = 0;
            for (int j = 1; j < i; j++) {
                kalan = i % j;
                if (kalan == 0)// tam bölünür
                    toplam += j;
            }

            if (toplam == i)
                System.out.println(i + " mükemmel sayıdır.");

        }
    }
}
