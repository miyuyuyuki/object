package Sample;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正規表現のサンプル
//忘れっぽい人のための正規表現チートシート
//https://qiita.com/tossh/items/635aea9a529b9deb3038
class RegexSample {
    public static void main(String[] args) {
        //郵便番号の正規表現
        String regex = "^[0-9]{3}-[0-9]{4}$";
        String zip1 = "064-0809";
        System.out.println(zip1.matches(regex));//true
        String zip2 = "0000-888";
        System.out.println(zip2.matches(regex));//false(4桁－3桁のため）

        //正規表現の準備
        Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
        Matcher matcher = pattern.matcher(zip1);
        List<String> zipList = List.of("064-0809","0000-888");

        for(String zip: zipList) {
            matcher = pattern.matcher(zip);
            if (matcher.matches()) {
                System.out.println(zip + ":ok");
            } else {
                System.out.println(zip + ":ng");
            }
        }
        //064-0809:ok
        //0000-888:ng
    }
}
