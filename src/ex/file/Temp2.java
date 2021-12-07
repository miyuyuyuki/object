package ex.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Temp2 {
    public static void main(String[] args) {
        question2();
    }

    public static void question2() {
        String first = "./src/ex/file";//パス
        String fileName = "temp.txt";//テキストファイル名
        Path path = Path.of(first,fileName);
        if(Files.exists(path)) {
            //Listを新規作成
            List<String> list = Arrays.asList("あいうえお","かきくけこ","さしすせそ");
            try {
                //Listをpathのファイルに書き込み
                Files.write(path,list);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}



