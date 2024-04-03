public class o5 {
    public static void main(String[] args) {
        int[] sayilar1={3,5,1,9,7};
        for (int i : sayilar1) {
            System.out.println(i);
        }
        //Dikkat
        for (int i : sayilar1) {
            i=i*2;
        }
        System.out.println("Dizi Elemanları");
        for (int i : sayilar1) {
            System.out.println(i);
        }
    }
}
