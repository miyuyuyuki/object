package Sample;

import java.util.Arrays;

class StringSample {
    public static void main(String[] args) {
        String word1 = "aaaa";
        //文字列の結合
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/invoke/StringConcatException.html
        System.out.println(word1.concat("bbb"));//aaabbb

        //文字列の分割//重要
        String sentence = "1-1,いのうえ,女,80,70,95";
        String[] data = sentence.split(",",6);
        System.out.println(Arrays.toString(data));

        //文字列の結合//重要
        String joinWord = String.join("",data);
        System.out.println(joinWord);

        //文字列の置き換え
        String original = "This + is a pen.";
        String replace = original.replace("is","at");
        System.out.println(replace);

        //文字列の位置を検索する
        sentence = "This is a pen.";
        int index = sentence.indexOf("is");
        System.out.println(index);
    }
}
