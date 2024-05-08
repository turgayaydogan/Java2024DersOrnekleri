public class o3 {
    public static void main(String[] args) {
        System.out.println(karelerinToplami(3));
        System.out.println(karelerinToplami(-5));

    }

    public static int karelerinToplami(int sayi) {
        int sonuc = 0;
        if(sayi<1){
            System.out.println("Hesaplama işlemi yapılamaz");
            sonuc = -1;
        }
        else if (sayi == 1)
            sonuc = 1;
        else
            sonuc = sayi * sayi + karelerinToplami(sayi - 1);

        return sonuc;
    }
}
