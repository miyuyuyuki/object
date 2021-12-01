package ex.person2;

import Sample.enumSample.Gender;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(15);

        personList.addAll(Arrays.asList(
                new Person("やまだ",Birthplace.HOKKAIDO, Gender.MEN,35),
                new Person("いけだ",Birthplace.HOKKAIDO,Gender.WOMEN,26),
                new Person("いのうえ",Birthplace.FUKUOKA,Gender.MEN,32),
                new Person("たむら",Birthplace.FUKUOKA,Gender.WOMEN,22),
                new Person("わだ",Birthplace.TOKYO,Gender.MEN,42),
                new Person("くどう",Birthplace.TOKYO,Gender.WOMEN,55),
                new Person("さらど",Birthplace.OSAKA,Gender.MEN,31),
                new Person("あいざわ",Birthplace.OSAKA,Gender.WOMEN,44)
        ));

        //Streamの練習
        //年齢が35歳以上の人の名前だけ表示
        System.out.println("練習1");
        personList.stream()            //生成
                .filter(p -> p.getAge() >= 35)      //中間操作
                    .forEach(p -> System.out.println(p.getName()));    //終端操作
        //練習1
        //やまだ
        //わだ
        //くどう
        //あいざわ

        //年齢が35歳未満の人を表示
        System.out.println("練習2");
        personList.stream()
                .filter(p -> p.getAge() < 35)
                    .forEach(System.out::println);
        //練習2
        //いけだ 北海道 女 26
        //いのうえ 福岡 男 32
        //たむら 福岡 女 22
        //さらど 大阪 男 31
        System.out.println("\n");
        System.out.println("練習1");
        personList.stream()
                .forEach(System.out::println);

        System.out.println("\n");
        System.out.println("練習2");//名前だけを表示
        personList.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        System.out.println("\n");
        System.out.println("練習3");//男性のみを表示
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                    .forEach(System.out::println);
        //女性のみを表示
        System.out.println("課題3-1");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                    .forEach(System.out::println);

        System.out.println("\n");
        System.out.println("練習4");//年齢の降順に並べ替えて表示
        personList.stream()
                .sorted((p1,p2) -> p2.getAge() - p1.getAge())
                .forEach(System.out::println);
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .forEach(System.out::println);

        System.out.println("\n");
        System.out.println("練習5");//男性のみ名前の昇順に並べ替えて表示

        personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        System.out.println("\n");
        System.out.println("練習6");//PersonListから名前リストを生成、表示
        List<String> nameList = personList.stream() //nameListにpersonListを代入
                .map(Person::getName)   //Personクラスから名前を取得
                .collect(Collectors.toList());  //結果を作成しnameListにつめる
        nameList.forEach(System.out::println);//nameListを出力

        System.out.println("\n");
        System.out.println("練習7");//性別でグルーピングしたMAP<Gender, Person>を生成し、内容を表示
        Map<Gender,List<Person>> map = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));//Key:Gender,Value:list のmap
        //↓　mapにセットする
        map.entrySet().stream()
                .map(s -> s.getKey().getJpName() + ":" + s.getValue())
        .forEach(System.out::println);
        //練習7
        //女:[いけだ 北海道 女 26, たむら 福岡 女 22, くどう 東京 女 55, あいざわ 大阪 女 44]
        //男:[やまだ 北海道 男 35, いのうえ 福岡 男 32, わだ 東京 男 42, さらど 大阪 男 31]

        System.out.println("\n");
        System.out.println("練習8");//男性で最年長の人を表示
        Optional<Person> person = personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .max(Comparator.comparing(Person::getAge));
        person.ifPresent(System.out::println);

        System.out.println("\n");
        System.out.println("練習9");//女性で最年少の人を表示
        Optional<Person> personW = personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .min(Comparator.comparing(Person::getAge));
        //ifPresent():nullだったときのため
        personW.ifPresent(System.out::println);

        System.out.println("練習10");//女性の平均年齢を求め表示
        //mapToInt():nullが帰ってきても入ってこないようにする
        OptionalDouble womenAverageAge = personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .mapToInt(Person::getAge)
                .average();
        womenAverageAge.ifPresent(a -> System.out.println("女性の平均年齢：" + a));

        System.out.println("練習11");//男性の平均年齢を求め表示
        OptionalDouble menAverageAge = personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .mapToInt(Person::getAge)
                .average();
        menAverageAge.ifPresent(a -> System.out.println("男性の平均年齢：" + a));
    }
}
