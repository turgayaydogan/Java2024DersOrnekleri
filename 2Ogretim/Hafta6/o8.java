public class o8 {
    public static void main(String[] args) {
        int[][] sayilar=new int[2][3];

        sayilar[0][0] = 11;
        sayilar[0][1] = 12;
        sayilar[0][2] = 13;

        sayilar[1][0] = 21;
        sayilar[1][1] = 22;
        sayilar[1][2] = 23;

        System.out.println(sayilar[0][2]);
        System.out.println("Dizinin Elemanları");
        //satırlar
        for (int i = 0; i < 2; i++) {
            //sutunlar
            for (int j = 0; j < 3; j++) {
                System.out.println(sayilar[i][j]);
            }
        }
        System.out.println("Dizinin Elemanları - 2");
        //satırlar
        for (int i = 0; i < 2; i++) {
            //sutunlar
            for (int j = 0; j < 3; j++) {
                System.out.print(sayilar[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Dizinin Elemanları - 2");
        //satırlar
        for (int i = 0; i < sayilar.length; i++) {
            //sutunlar
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
