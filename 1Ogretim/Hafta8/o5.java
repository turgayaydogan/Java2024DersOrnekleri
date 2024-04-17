public class o5 {
    public static void main(String[] args) {
        topla(1,2);
        topla(1,3,5,7);
    }

    public static void topla(int ... sayilar){
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        System.out.println("Toplam Sonucu="+toplam);
    }
}
