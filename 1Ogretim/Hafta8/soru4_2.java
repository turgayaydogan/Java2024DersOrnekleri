import java.util.Arrays;

public class soru4_2 {
    public static void main(String[] args) {
        int[] sayilar = {2,4,6,8,10};
        //int[] sayilar2;
        System.out.println("");
        System.out.println(Arrays.toString(sayilar)); 
        System.out.println("Dizi Elemanı Yer Değiştir");
        sayilar = yerDegistir(sayilar, 1, 3);
        System.out.println(Arrays.toString(sayilar)); 
     }
     public static int[] yerDegistir(int[] gelenDizi,int ilkIndex,int ikinciIndex){
         int yedek;
         yedek = gelenDizi[ilkIndex];//İlk elemanı geçici değişkene ata
         gelenDizi[ilkIndex] = gelenDizi[ikinciIndex];//İkinci elemanı ilk indexe ata
         gelenDizi[ikinciIndex] = yedek;//İkinci indexe ilk indexdeki eleman atandı
         return gelenDizi;
     }
}
