/*2015 yılı itibarı ile ülke nüfusu 77 milyondur. 
Yıllık nüfus artış oranı %1.3 tür. 
Sonraki 10 yılda ülke nüfusunu yıllara göre 
programın kodlarını yazınız.

    77 milyon
    onceki nufus = 100
    sonraki nufus = artış miktarı + onceki nufus
    artış miktarı = (onceki nufus /100) * 1.3 = 1.3
    artış miktarı = (100 /100) * 1.3 = 1.3
    sonraki nufus = 1.3+100 = 101.3

    artış miktarı = (onceki nufus /100) * 1.3 = 1.3
    artış miktarı = (101.3 /100) * 1.3 = ???


*/

public class o2 {
    public static void main(String[] args) {
        double nufus = 77;
        double artisMiktari;

        for (int i = 0; i < 10; i++) {
            artisMiktari = (nufus / 100) * 1.3;
            nufus = artisMiktari + nufus;
            System.out.println( (i+1) +" yıl sonra nufus = "+nufus);
        }

    }
}
