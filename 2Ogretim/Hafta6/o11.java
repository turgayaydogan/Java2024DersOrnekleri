public class o11 {
    public static void main(String[] args) {
        // 9x10
        int sayilar[][] = {

                { 98, 93, 41, 19, 27, 93, 63, 36, 63, 28 },
                { 23, 20, 50, 56, 28, 79, 81, 39, 33, 49 },
                { 33, 36, 58, 92, 47, 32, 74, 32, 23, 26 },
                { 92, 88, 78, 68, 65, 81, 26, 89, 23, 54 },
                { 94, 61, 41, 84, 40, 79, 79, 84, 49, 21 },
                { 80, 76, 83, 54, 55, 57, 75, 44, 11, 26 },
                { 10, 35, 77, 57, 14, 79, 37, 39, 88, 23 },
                { 84, 32, 34, 81, 81, 53, 71, 39, 62, 39 },
                { 89, 45, 20, 93, 18, 90, 98, 32, 16, 17 } };
        // dizinin satırlarının elemanları toplamını bul
        int toplam = 0;
        for (int i = 0; i < 9; i++) {
            toplam = 0;
            for (int j = 0; j < 10; j++) {
                toplam += sayilar[i][j];
            }
            System.out.println((i+1)+". Satır Toplamı=" + toplam);
        }
        
    }
}
