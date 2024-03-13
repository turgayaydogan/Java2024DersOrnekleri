public class o7_2 {
    public static void main(String[] args) {
        int enAz = 50;
        int enCok = 100;
        int tutulanSayi;
        // enAz.....enCok arasında rastgele bir tam sayı tutmak için
        tutulanSayi = enAz + ((int) (Math.random() * (enCok - enAz + 1)));
        System.out.println(tutulanSayi);

    }
}
