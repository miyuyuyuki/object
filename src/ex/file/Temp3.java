package ex.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Temp3 {
    public static void main(String[] args) {
        question3();

//        ファイルを読み込み
//        内容をコンソールに出力
    }
    public static void question3() {
        String first = "./src/ex/file";//パス
        String fileName = "temp.txt";//テキストファイル名
        Path path = Path.of(first,fileName);

        //pathのファイルが存在しなかったら
        if(Files.notExists(path)) {
            System.out.println("読み込み対象のファイル：" + path + "が見つかりませんでした");
        }

        //存在する場合　↓
        try {
            //
            Files.lines(path).forEach(System.out::println);
        } catch (java.io.IOException e) {   //ファイルの読み込みに失敗したとき
            e.printStackTrace();
        }
    }
}
