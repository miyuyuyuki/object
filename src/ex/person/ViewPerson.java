package ex.person;

import Sample.enumSample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ViewPerson {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(
                new Person("しむら", Gender.MEN,28),
                new Person("すどう", Gender.WOMEN,34),
                new Person("そのだ", Gender.WOMEN,21),
                new Person("さの", Gender.MEN,42),
                new Person("せがわ", Gender.WOMEN,55)
        ));
        System.out.println("課題1");
        for (Person person:personList) {
            System.out.println(person);
        }

        //課題2　年齢の降順に並べ替えて表示
        Comparator<Person> ageNaturalOrder = Comparator.comparing(Person::getAge);//年齢の昇順
        Comparator<Person>ageReverseOrder = Comparator.comparing(Person::getAge,Comparator.reverseOrder());//年齢の降順
        Comparator<Person> getNameNaturalOrder = Comparator.comparing(Person::getName);//名前の昇順

        personList.sort(ageReverseOrder);
        System.out.println("\n課題2");
        personList.forEach(System.out::println);

        //課題３ 男性のみ,名前の昇順で並べ替えて表示
        personList.sort(getNameNaturalOrder);
        System.out.println("\n課題3");
        //personList.sort(Comparator.comparing(Person::getName));
        for (Person person:personList) {
            if(person.getGender().equals(Gender.MEN)) {
                System.out.println(person);
            }
        }

//誤答        if(person.getGender().equals(Gender.MEN)) {
//            for (Person person:personList) {
//                System.out.println(person);
//            }
//        }
//拡張for文に初期化が含まれているので、forの中にif{}をいれるのが◎
//


        //課題４ 男性と女性の平均年齢
        System.out.println("課題４");
        int sumMen = 0,sumWomen = 0;    //年齢合計数の初期化　＝0
        double countMen = 0,countWomen = 0; //合計数の初期化　=0
        for (Person person:personList) {
            if (person.getGender().equals(Gender.MEN)){
                countMen++;  //男性の数を加算してカウント
                sumMen += person.getAge();  //該当する男性の年齢を加算する
            } else {
                countWomen++;  //女性の数を加算してカウント
                sumWomen += person.getAge();  //該当する女性の年齢を加算する
            }
        }
        System.out.println(String.format("男性の平均年齢:%.1f",sumMen/countMen));//ワイドニングになるのでint/doubleのままでOK
        System.out.println(String.format("女性の平均年齢:%.1f",sumWomen/countWomen));

        //課題５ 男性・女性の最年長をそれぞれ表示
        List<Person> menList = new ArrayList<>();   //男性のListのインスタンスを作る
        List<Person> womenList = new ArrayList<>();   //女性のListのインスタンスを作る

        for (Person person:personList) {
            if (person.getGender().equals(Gender.MEN)){ //男性のListにGender.MENと一致する人を追加
                menList.add(person);
            } else {
                womenList.add(person);   //女性のListにGender.WOMENと一致する人を追加
            }
        }

        System.out.println("課題５");
        menList.sort(Comparator.comparing(Person::getAge)); //男性のListを年齢昇順に
        womenList.sort(Comparator.comparing(Person::getAge));   //女性のListを年齢昇順に
        System.out.println("男性の最年長:" + menList.get(menList.size()-1)); //要素数-1（Listの0から数えての数）
        System.out.println("女性の最年長:" + womenList.get(womenList.size()-1)); //要素-1（〃）
    }
}
