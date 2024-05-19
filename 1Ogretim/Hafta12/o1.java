/**
 * o1
 */
public class o1 {

    //BU metot hata oluşturabilir diye ekleme yaptık ama içeriğinde
    // hata oluşturan her hangi bir kod yok
    public static void hataOlusturanMetot() throws Exception{
        System.out.println("Metot çalıştı");
    }

    //BU metot hata oluşturabilir diye ekleme yaptık  
    // içeriğinde if in ise kısmı şarta göre hata oluşturabilir
    public static void hataOlusturanMetot2() throws Exception {
        int sayi=4;
        System.out.println("merhaba");
        if (sayi<5)
            throw new Exception();
    }

    // hata oluşturabilecek kodlar kullandığımızı belli etmek adına
    // ortama hata fırlatan metotları kullanıdığımız onaylamak adına
    // metot adından sonra throws Exception yazdık
    public static void main(String[] args) throws Exception  {
        hataOlusturanMetot();
        
        hataOlusturanMetot2();
    }
}