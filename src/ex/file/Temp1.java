package ex.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Temp1 {
    public static void main(String[] args) throws IOException {
        question1();

    }

    //ファイルの新規作成

    public static void question1() {
        String first = "./src/ex/file";//パス
        String fileName = "temp.txt";//テキストファイル名

        //ファイルが存在するか確認し、
        if(Files.notExists(Path.of(first,fileName))) {
            //存在しなければ、Fileを新規作成
            try {
                Files.createFile(Path.of(first,
                        fileName));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}