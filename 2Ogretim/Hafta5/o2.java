/*
 * 2015 yılı itibarı ile ülke nüfusu 77 milyondur. 
 * Yıllık nüfus artış oranı %1.3 tür. 
 * Sonraki 10 yılda ülke nüfusunu yıllara göre hesaplayıp
 * ekrana yazdıran programın kodlarını yazınız.

    nufus = 100
    yeniNufus = artisMiktari + nufus
    yeniNufus = (nufus/100)*1.3 + nufus
 */
public class o2 {
    public static void main(String[] args) {

        double nufus = 77;//milyon demek
        double artisMiktari = 0;

        for (int i = 0; i < 10; i++) {
            artisMiktari = (nufus / 100) * 1.3;            
            nufus = artisMiktari + nufus;
            System.out.println(nufus);
        }
    }
}
