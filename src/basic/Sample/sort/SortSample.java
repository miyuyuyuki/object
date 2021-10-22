package basic.Sample.sort;

import basic.Sample.enumSample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Studentクラスを表示する処理
class SortSample {
    public static void main(String[] args) {
        //5名のインスタンスをArrayListで作成
        List<Student> students = new ArrayList<>();

        students.addAll(Arrays.asList(
                new Student("あいざわ", Gender.MEN,60,50,70),
                new Student("いのうえ",Gender.WOMEN,80,80,100),
                new Student("うえの",Gender.MEN,40,50,60),
                new Student("えんどう",Gender.WOMEN,80,80,60),
                new Student("おおた",Gender.MEN,80,100,40)
        ));

        //配列の初期値を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/ArrayList.html#forEach(java.util.function.Consumer)
        System.out.println("初期の並び順");
        students.forEach(System.out::println);
        //初期の並び順
        //あいざわ 男 60 50 70 180 60.00
        //いのうえ 女 80 80 100 260 86.67
        //うえの 男 40 50 60 150 50.00
        //えんどう 女 80 80 60 220 73.33
        //おおた 男 80 100 40 220 73.33

        //比較関数の作成
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Comparator.html
        Comparator<Student> japNaturalOrder = Comparator.comparing(Student::getJap);//国語の昇順
        Comparator<Student> japReverseOrder = Comparator.comparing(Student::getJap,Comparator.reverseOrder());//国語の降順
        Comparator<Student> mathReverseOrder = Comparator.comparing(Student::getMath,Comparator.reverseOrder());//数学の降順
        Comparator<Student> engReverseOrder = Comparator.comparing(Student::getEng,Comparator.reverseOrder());//英語の降順


        //出力
        students.sort(japNaturalOrder);
        System.out.println("\n国語の昇順");
        students.forEach(System.out::println);
        //国語の昇順
        //うえの 男 40 50 60 150 50.00
        //あいざわ 男 60 50 70 180 60.00
        //いのうえ 女 80 80 100 260 86.67
        //えんどう 女 80 80 60 220 73.33
        //おおた 男 80 100 40 220 73.33

        students.sort(japReverseOrder);
        System.out.println("\n国語の降順");
        //国語の降順
        //いのうえ 女 80 80 100 260 86.67
        //えんどう 女 80 80 60 220 73.33
        //おおた 男 80 100 40 220 73.33
        //あいざわ 男 60 50 70 180 60.00
        //うえの 男 40 50 60 150 50.00

        students.sort(japReverseOrder.thenComparing(mathReverseOrder).thenComparing(engReverseOrder));
        System.out.println("\n国語の降順→数学の降順→英語の降順");
        students.forEach(System.out::println);
        //国語の降順→数学の降順→英語の降順
        //おおた 男 80 100 40 220 73.33
        //いのうえ 女 80 80 100 260 86.67
        //えんどう 女 80 80 60 220 73.33
        //あいざわ 男 60 50 70 180 60.00
        //うえの 男 40 50 60 150 50.00

        students.sort(Comparator.naturalOrder());
        System.out.println("\n合計点の昇順");
        students.forEach(System.out::println);
        //合計点の昇順
        //うえの 男 40 50 60 150 50.00
        //あいざわ 男 60 50 70 180 60.00
        //おおた 男 80 100 40 220 73.33
        //えんどう 女 80 80 60 220 73.33
        //いのうえ 女 80 80 100 260 86.67

        students.sort(Comparator.reverseOrder());
        System.out.println("\n合計点の降順");
        students.forEach(System.out::println);
        //合計点の降順
        //いのうえ 女 80 80 100 260 86.67
        //おおた 男 80 100 40 220 73.33
        //えんどう 女 80 80 60 220 73.33
        //あいざわ 男 60 50 70 180 60.00
        //うえの 男 40 50 60 150 50.00
    }
}
