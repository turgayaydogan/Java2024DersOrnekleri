public class o3_3 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {

            int toplam = 0;
            int kalan;

            for (int j = 1; j < i; j++) {
                kalan = i % j;
                if (kalan == 0)// tam bölünür
                    toplam += j;
            }

            if (toplam == i)
                System.out.println(i +" mükemmel sayıdır.");
            
        }

    }
}
