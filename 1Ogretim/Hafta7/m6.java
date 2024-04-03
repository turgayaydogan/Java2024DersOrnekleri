public class m6 {
    public static void main(String[] args) {
        soru2(10, 50);
    }

    public static void soru2(int baslangic, int bitis) {
        int kalan;
        int adet = 0;
        for (int i = baslangic; i <= bitis; i++) {
            adet = 0;
            // 5 % 1, 5 % 2, 5 % 3, 5 % 4, 5 % 5
            for (int j = 1; j <= i; j++) {
                kalan = i % j;
                if (kalan == 0)
                    adet++;
            }
            if (adet == 2)
                System.out.println(i);
        }
    }
}
