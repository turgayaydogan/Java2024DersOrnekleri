public class o4 {
    public static void main(String[] args) {
        sayilariTopla(1,3);
        sayilariTopla(10,20,30,50,60,90);
    }

    // sayilar parametresi bir boyutlu dizidir
    public static void sayilariTopla(int ... sayilar){
        int toplam =0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        System.out.println(toplam);
    }
}
