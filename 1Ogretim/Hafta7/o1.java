/**
 * o1
 */
public class o1 {

    public static void main(String[] args) {
        int[][] duzensizDizi = new int[4][];
        duzensizDizi[0] = new int[2];
        duzensizDizi[1] = new int[4];
        duzensizDizi[2] = new int[1];
        duzensizDizi[3] = new int[3];
        //satır
        for (int i = 0; i < duzensizDizi.length; i++) {
            //sutun
            for (int j = 0; j < duzensizDizi[i].length; j++) {
                System.out.print(duzensizDizi[i][j]+"\t");
            }
            System.out.println();
        }
    }
}