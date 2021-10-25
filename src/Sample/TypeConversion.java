package Sample;

//型変換の見本
public class TypeConversion {
    public static void main(String[] args) {
        //数値→文字
        double d1 = 20.0;
        System.out.println(d1);
        String str = String.valueOf(d1);
        System.out.println(str);

        //文字→数値
        String number ="12.34";
        double d2 = Double.parseDouble(number);
        double d3 = Double.valueOf(number);
        System.out.println(d2);
        System.out.println(d3);
    }
}
