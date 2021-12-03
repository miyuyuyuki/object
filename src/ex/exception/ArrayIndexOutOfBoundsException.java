package ex.exception;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        //一次元配列に、3つの値:1,2,3を格納
        int n[] = {10,20,30};
        System.out.println("開始");

        try {
            //for分にて、インデックスの値を0から、3まで指定して
            // 一次元配列のデータ値をprintln
            for(int i = 0; i < 4; i++){
                System.out.println(n[i]);
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("配列の範囲を超えています");
        } finally {
            System.out.println("終了");
        }
    }
}
