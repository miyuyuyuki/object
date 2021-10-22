package basic.Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//ArrayListのサンプル
class ArrayListSample {
    public static void main(String[] args) {
        //宣言と初期化
        //コンストラクタ
        List<Integer> list = new ArrayList<>();

        //初期化
        list.addAll(Arrays.asList(20,10,40,30,50));

        //表示
        System.out.println(list);//[20, 10, 40, 30, 50]

        //要素の追加
        list.add(60);
        System.out.println(list);//[20, 10, 40, 30, 50, 60]
        list.add(2,70);//2番目に70を挿入
        System.out.println(list);//[20, 10, 70, 40, 30, 50, 60]

        //要素の上書き
        list.set(0,80); //0番目を80に上書き
        System.out.println(list); //[80, 10, 70, 40, 30, 50, 60]

        //要素の削除
        list.remove(2);//２番目を削除
        System.out.println(list);//[80, 10, 40, 30, 50, 60]

        list.removeAll(Arrays.asList(30,60));//値30，60を削除
        System.out.println(list);//[80, 10, 40, 50]

        list.retainAll(Arrays.asList(80,10,50));//一致する要素だけ残す（他は削除）
        System.out.println(list);

        //インデックスを指定して要素を取得
        System.out.println(list.get(2));//50

        //サイズ
        System.out.println(list.size());//4(配列の要素数)

        //一部の要素の取得
        System.out.println(list.subList(1,3));//1,2の位置にある値を出す

        //要素の消去
        list.clear();
        System.out.println(list);//[]

        System.out.println(list.isEmpty());//true　(リストの要素は空ですか？)

        //初期化
        list.addAll(Arrays.asList(2,6,1,4,5,0,4));
        System.out.println(list);

        //値の検索
        System.out.println(list.contains(6));//true　(値6が存在しますか？)
        System.out.println(list.contains(10));//false (値10が存在しますか？）
        System.out.println(list.containsAll(Arrays.asList(1, 2, 4)));//true
        System.out.println(list.containsAll(Arrays.asList(1, 2, 3)));//false

        int num = 4;    //[2, 6, 1, 4, 5, 0, 4]
        if (list.contains(num)) {
            System.out.println(list.indexOf(num));//最初に見つけたインデックス　//3(4を最初に見つけた場所は？３番目)
            System.out.println(list.lastIndexOf(num));//最後に見つけたインデックス　//6(4を最後に見つけた場所は？６番目)
        }

        //ソート
        list.sort(Comparator.naturalOrder());//昇順
        System.out.println(list);//[0, 1, 2, 4, 4, 5, 6]
        list.sort(Comparator.reverseOrder());//降順
        System.out.println(list);//[6, 5, 4, 4, 2, 1, 0]
    }
}
