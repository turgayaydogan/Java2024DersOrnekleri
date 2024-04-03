public class m7 {
    public static void main(String[] args) {
        int sonuc = soru3(10, 20, '*');
        System.out.println(sonuc);
    }

    public static int soru3(int sayi1, int sayi2, char islem) {
        int sonuc = 0;
        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '/':
                sonuc = sayi1 / sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
        }

        return sonuc;
    }
}
