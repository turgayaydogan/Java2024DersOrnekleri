public class sorular2 {

    public static void main(String[] args) {
        String cumle = "Bu gün hava çok güzel.";
        //System.out.println(tersle(cumle));
        System.out.println(parcaGetir("Merhaba",1,3));
        System.out.println(parcaGetir("Merhaba",2,5));
        System.out.println(parcaGetir("Ali",1,5));
        System.out.println(parcaGetir2("Ali",1,5));
        System.out.println(parcaGetir3("Ali",1,2));

    }

    public static String parcaGetir(String kelime,int baslangic,int bitis){
        String parca="";
        if(kelime.length()>=bitis)
            parca = kelime.substring(baslangic-1,bitis);

        return parca;
    }

    public static String parcaGetir3(String kelime,int baslangic,int bitis){
        String parca="";
        if(kelime.length()>=bitis){
            for(int i=baslangic-1;i<bitis;i++)
                parca+=kelime.charAt(i);
        }
        return parca;
    }

    public static String parcaGetir2(String kelime,int baslangic,int bitis){
        return kelime.length()>=bitis?kelime.substring(baslangic-1,bitis):"";
    }

    public static String tersle(String cumle) {
        String[] kelimeler = cumle.split(" ");
        String yeniCumle = "";
        for (int i = kelimeler.length - 1; i >= 0; i--)
            //yeniCumle += " "+kelimeler[i];
            yeniCumle = yeniCumle+kelimeler[i]+" ";

        return yeniCumle;
    }
}
