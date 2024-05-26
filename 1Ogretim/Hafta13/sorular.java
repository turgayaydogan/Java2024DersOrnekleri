public class sorular {
    public static void main(String[] args) {
        String cumle = "Bu gün hava çok güzel";
        System.out.println(tersle(cumle));

        String kelime = "Merhaba";
        System.out.println(parcaGetir(kelime, 2, 4));
        System.out.println(parcaGetir_3(kelime, 2, 4));
    }

    public static String tersle(String cumle) {
        String[] kelimeler = cumle.split(" ");
        String yeniCumle = "";
        for (int i = kelimeler.length - 1; i >= 0; i--) {
            yeniCumle += kelimeler[i] + " ";
        }

        return yeniCumle;
    }

    public static String parcaGetir(String kelime, int baslangic, int bitis) {
        String parca = "";
        if (kelime.length() >= bitis)
            parca = kelime.substring(baslangic - 1, bitis);
        else
            parca = "";
        return parca;
    }

    public static String parcaGetir_2(String kelime, int baslangic, int bitis) {
        if (kelime.length() >= bitis)
            return kelime.substring(baslangic - 1, bitis);
        else
           return "";
    }

    public static String parcaGetir_3(String kelime, int baslangic, int bitis) {
        String parca="";
        if (kelime.length() >= bitis){
            for (int i = baslangic-1; i <bitis; i++) {
                parca+=kelime.charAt(i);
            }
        }
        return parca;
    }
}
