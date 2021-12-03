package ex.exception;

import java.io.IOException;

public class ThrowsException {
    //検査例外を投げるメソッド
    static void readFile(String filepath) throws IOException {
        throw new IOException("ファイル：" + filepath + "がありませんでした");
    }
    //呼び出し側
    public static void main(String[] args) {
        try{
            readFile("c:\\text.txt");
        }  catch  (IOException e)  {
            System.out.println("ファイルの読み込みに失敗しました");
            e.printStackTrace();
        }
    }
}
