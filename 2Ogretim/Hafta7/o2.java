public class o2 {
    public static void main(String[] args) {
        // 1
        for (int i = 100; i <= 999; i++) {
            // i sayısınınbasamaklarını ayır
            int yuzler = i / 100;
            int onlar = (i / 10) % 10;
            int birler = i % 10;

            int deger = yuzler * yuzler * yuzler + onlar * onlar * onlar + birler * birler * birler;
            if (i == deger)
                System.out.println("Sayı Armstrong sayıdır=" + i);
        }
        // 2
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int j2 = 0; j2 <= 9; j2++) {
                    int yuzler = i ;
                    int onlar = j;
                    int birler = j2;
                    int sayi = i*100+j*10+j2;

                    int deger = yuzler * yuzler * yuzler + onlar * onlar * onlar + birler * birler * birler;
                    if (sayi == deger)
                        System.out.println("Sayı Armstrong sayıdır=" + sayi);
                }
            }
        }
    }
}
