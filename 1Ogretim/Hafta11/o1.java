import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class o1 {
    public static void main(String[] args) {
        byte[] b_arr = {116, 117, 114, 103, 97, 121};
        Charset cs1 = StandardCharsets.US_ASCII;
        Charset cs2 = StandardCharsets.UTF_16BE;
        String str1 = new String(b_arr, cs1);
        System.out.println(str1);
        // System.out.println(i+" "+(char)i);
        byte[] aa1 = new byte[127];
        byte[] aa2 = new byte[127];
        for (byte i = 0; i < 127; i++) {
            aa1[i] = i;
            aa2[i] = i;
        }
        str1 = new String(aa1, cs1);
        String str2 = new String(aa2, cs2);
        System.out.println(str1);
        System.out.println(str2);
    }
}
